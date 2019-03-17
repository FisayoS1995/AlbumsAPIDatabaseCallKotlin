package com.example.albumsapidbcallkotlin.data




interface DataSource{

    fun addAlbums(albums :AlbumsItem)

    fun getAlbums():Maybe<List<AlbumsItem>>


}