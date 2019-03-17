package com.example.albumsapidbcallkotlin




@Entity (tableName= TABLE_NAME)
data class AlbumsItem(
    @PrimaryKey(autoGenerate = false)

    val id : Int
    val title: String
val userId: Int
)