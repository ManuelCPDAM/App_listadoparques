package com.example.app_listadoparques

import android.graphics.drawable.ClipDrawable.VERTICAL
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.app_listadoparques.adapter.ParkAdapter
import com.example.app_listadoparques.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.recilerViu.layoutManager = LinearLayoutManager(this)
        binding.recilerViu.adapter=ParkAdapter(ParkProvider.parkList)



    }
}