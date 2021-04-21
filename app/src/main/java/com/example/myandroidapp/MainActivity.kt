package com.example.myandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var photoAdapter: PhotoAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        photoAdapter = PhotoAdapter(mutableListOf())
        rvItems.adapter = photoAdapter
        rvItems.layoutManager = LinearLayoutManager(this)
        idAddButton.setOnClickListener {

            val photoId = tvId.text.toString()

            if (photoId.isNotEmpty()) {

                val photo = Photo(photoId)
                photoAdapter.addId(photo)
                tvId.text.clear()


            }


        }


    }
}