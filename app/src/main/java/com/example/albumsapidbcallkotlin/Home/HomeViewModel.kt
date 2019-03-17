package com.example.albumsapidbcallkotlin.Home



class HomeViewModel :ViewModel(){

    private val albumsObservable: MutableLiveData<List<AlbumItem>> = MutableLiveData()



    private val compositeDisposable: CompositeDisposable = CompositeDisposable()



    fun getAlbumsObservable():LiveData<List<AlbumsItem>> = albumsObservable



    private lateinit var repository : DataSource



    private lateinit var albumsAdapter: AlbumsAdapter



    fun getAlbums(application: Application){

        albumsAdapter = AlbumsAdapter()

        repository= AlbumsRespo(remoteDataSource = RemoteDataSource(),

            localDataSource = LocalDataSource(application))



        compositeDisposable.add(repository.getAlbums()

            .subscribeOn(Schedulers.io())

            .observeOn(AndroidSchedulers.mainThread())

            .subscribe({

                albumsObservable.value= it

            },{

                it.printStackTrace()

            }))



    }

}

