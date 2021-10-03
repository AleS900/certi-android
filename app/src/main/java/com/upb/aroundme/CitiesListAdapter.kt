package com.upb.aroundme

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners

class CitiesListAdapter: RecyclerView.Adapter<CitiesListViewHolder>()
{
    val cityList: MutableList<City> = mutableListOf()
    fun addAll(newCityList:MutableList<City>){
        cityList.clear()
        cityList.addAll(newCityList)



    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CitiesListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_cities,parent,false)
        return CitiesListViewHolder(view)
    }

    override fun onBindViewHolder(holder: CitiesListViewHolder, position: Int) {
        holder.bind(cityList[position])
    }

    override fun getItemCount(): Int {
        return cityList.size
    }
}

class CitiesListViewHolder(val itemView: View):RecyclerView.ViewHolder(itemView){
    private val ivCityPicture=itemView.findViewById<ImageView>(R.id.ivCityPicture)
    private val tvCityName=itemView.findViewById<TextView>(R.id.tvNameCity)

    fun bind(city: City){
        Glide.with(itemView)
            .load(city.pictureUrl)
            .transform(CenterCrop(), RoundedCorners(40))
            .into(ivCityPicture)
        tvCityName.text=city.nameCity
    }
}