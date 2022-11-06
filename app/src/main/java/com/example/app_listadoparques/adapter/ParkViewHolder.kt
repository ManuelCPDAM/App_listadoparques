package com.example.app_listadoparques.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.app_listadoparques.Park
import com.example.app_listadoparques.databinding.ItemParkBinding

class ParkViewHolder (view: View):RecyclerView.ViewHolder(view){
   val binding = ItemParkBinding.bind(view)
    fun render(parkModel: Park){
        binding.ParkName.text = parkModel.name
        binding.DescriptionPark.text = parkModel.description
        Glide.with(binding.ParkPhoto.context).load(parkModel.photo).into(binding.ParkPhoto)

        // Configuración click sobre un parque

        // Para el click sobre una foto
        //binding.ParkPhoto.setOnClickListener{ Toast.makeText(binding.ParkPhoto.context,parkModel.name,Toast.LENGTH_LONG).show()}

        // Para el click sobre el cardView
        binding.cardViu.setOnClickListener{Toast.makeText(binding.cardViu.context, parkModel.name,Toast.LENGTH_LONG).show()}
    }

}