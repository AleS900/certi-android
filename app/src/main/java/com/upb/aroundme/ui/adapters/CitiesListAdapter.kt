package com.upb.aroundme.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.upb.aroundme.R
import com.upb.aroundme.ui.interfaces.CitiesCallBack
import com.upb.aroundme.model.City

class CitiesListAdapter: RecyclerView.Adapter<CitiesListViewHolder>()
{
    private val cityList: MutableList<City> = mutableListOf()
    private lateinit var callBack: CitiesCallBack
    fun addAll(newCityList:MutableList<City>){
        cityList.clear()
        cityList.addAll(newCityList)



    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CitiesListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_cities,parent,false)
        return CitiesListViewHolder(view)
    }

    override fun onBindViewHolder(holder: CitiesListViewHolder, position: Int) {
        val city: City = this.cityList[position]
        holder.bind(cityList[position])
        holder.ivCityPicture.setOnClickListener{
            callBack.onTaskCityClicked(city)

        }
    }

    override fun getItemCount(): Int {
        return cityList.size
    }

    fun setCallBack(callBack: CitiesCallBack){
        this.callBack=callBack
    }
}

class CitiesListViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
     val ivCityPicture: ImageView =itemView.findViewById(R.id.ivCityPicture)
     private val tvCityName=itemView.findViewById<TextView>(R.id.tvNameCity)

    fun bind(city: City){
        Glide.with(itemView)
            .load(city.pictureUrl)
            .transform(CenterCrop(), RoundedCorners(40))
            .into(ivCityPicture)
        tvCityName.text=city.nameCity
    }
}