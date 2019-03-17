package com.example.albumsapidbcallkotlin.data


@Dao

interface AlbumsDAO {

    @Query("SELECT * FROM albums")

    fun getAllAlbums(): Maybe<List<AlbumsItem>>



    @Insert

    fun addAlbums(albums : AlbumsItem)



    @Delete

    fun deleteAlbums(albums : AlbumsItem)



    @Update

    fun updateAlbums(albums: AlbumItems)

}