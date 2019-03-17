package com.example.albumsapidbcallkotlin.data



class LocalDataSource(private val application: Application) : DataSource{

    override fun getAlbums()=database.albumsDAO().getAllAlbums()





    private val database :AlbumsDatabase by lazy {

        Room.databaseBuilder(application,AlbumsDatabase::class.java, DATABASE_NAME)

            .build()

    }





    override fun addAlbums(albums: AlbumsItem) {

        database.albumsDAO().addAlbums(albums)

    }



}