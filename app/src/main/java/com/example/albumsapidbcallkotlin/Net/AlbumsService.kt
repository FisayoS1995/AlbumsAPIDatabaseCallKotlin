package com.example.albumsapidbcallkotlin.Net



interface  AlbumService{

    @GET(ENDPOINT)

    fun getAlbums(): Single<List<AlbumsItem>>

}