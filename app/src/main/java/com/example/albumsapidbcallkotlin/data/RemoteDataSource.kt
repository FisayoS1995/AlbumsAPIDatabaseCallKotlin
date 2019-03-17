package com.example.albumsapidbcallkotlin.data

class RemoteDataSource:DataSource{



    private val albumService: AlbumsService by lazy {

        val okHttpClient = OkHttpClient.Builder()

            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))

            .build()

        val retrofit = Retrofit.Builder()

            .client(okHttpClient)

            .baseUrl(BASE_URL)

            .addConverterFactory(GsonConverterFactory.create())

            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())

            .build()

        retrofit.create(AlbumService::class.java)

    }

    override fun getAlbums(): Maybe<List<AlbumsItem>> {

        return albumsService.getAlbums().flatMapMaybe { Maybe.just(it) }

    }



    override fun addAlbums(albums: AlbumsItem) {


    }



}