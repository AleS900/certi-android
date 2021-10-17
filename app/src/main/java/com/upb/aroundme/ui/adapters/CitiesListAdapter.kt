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
import com.upb.aroundme.databinding.ListCitiesBinding
import com.upb.aroundme.ui.interfaces.CitiesCallBack
import com.upb.aroundme.model.City

class CitiesListAdapter: RecyclerView.Adapter<CitiesListViewHolder>()
{
    private val cityList: MutableList<City> = mutableListOf()
    private lateinit var callBack: CitiesCallBack
    private var onCityItemClickListener:((city: City) -> Unit)? = null
    fun addAll(newCityList:MutableList<City>){
        cityList.clear()
        cityList.addAll(newCityList)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CitiesListViewHolder {
        val binding = ListCitiesBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CitiesListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CitiesListViewHolder, position: Int) {
        holder.bind(cityList[position])
        holder.binding.root.setOnClickListener {
            onCityItemClickListener?.invoke(cityList[position])
        }
    }

    override fun getItemCount(): Int {
        return cityList.size
    }

    fun setOnCityClickListener(onCityClickListener:((city: City) -> Unit)?){
        this.onCityItemClickListener=onCityClickListener
    }
}


class CitiesListViewHolder(val binding : ListCitiesBinding):RecyclerView.ViewHolder(binding.root){

    fun bind(city: City){
        Glide.with(itemView)
            .load(city.pictureUrl)
            .transform(CenterCrop(), RoundedCorners(40))
            .into(binding.ivCityPicture)
        binding.tvNameCity.text=city.nameCity
    }
}