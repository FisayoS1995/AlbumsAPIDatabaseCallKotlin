package com.example.albumsapidbcallkotlin.data

@Database(entities = [AlbumsItem:: class],version = DATABASE_VERSION)

abstract class AlbumsDatabase : RoomDatabase(){

    abstract fun albumsDAO(): AlbumsDAO

}