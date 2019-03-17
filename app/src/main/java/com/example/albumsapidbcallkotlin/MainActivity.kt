package com.example.albumsapidbcallkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    class MainActivity : AppCompatActivity() {



        private val albumsAdapter = AlbumsAdapter()

        override fun onCreate(savedInstanceState: Bundle?) {

            super.onCreate(savedInstanceState)

            setContentView(R.layout.activity_main)



            rvAlbums.layoutManager = LinearLayoutManager(this)

            rvAlbums.adapter = albumsAdapter



            val homeViewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)



            val observer = Observer<List<AlbumsItem>> { results->

                if (results != null) {

                    albumsAdapter.setData(results)

                }

            }





            homeViewModel.getAlbums(application)

            homeViewModel.getAlbumObservable().observe(this,observer)

        }

    }
}
