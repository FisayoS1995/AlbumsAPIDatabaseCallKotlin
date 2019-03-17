package com.example.albumsapidbcallkotlin.data



class AlbumsRepo( private val localDataSource: LocalDataSource,

                        private val remoteDataSource: RemoteDataSource):DataSource{

    override fun getAlbums(): Maybe<List<AlbumsItem>> {

        return remoteDataSource.getAlbums()

            .doOnSuccess {

                it.forEach { albums ->addAlbums(albums) }}



            .onErrorResumeNext { _: Throwable -> localDataSource.getAlbums() }

    }



    override fun addAlbums(albums: AlbumsItem) {

        localDataSource.addAlbums(albums)

    }



}