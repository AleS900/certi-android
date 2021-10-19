package com.upb.aroundme.ui.placesToVisitPage.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.upb.aroundme.databinding.ListPlacesBinding
import com.upb.aroundme.model.PlacesToVisit



class PlaceToVisitAdapter: RecyclerView.Adapter<PlacesToVisitListViewHolder>() {
    private val placesToVisitList: MutableList<PlacesToVisit> = mutableListOf()
    private var onPlaceItemClickListener : ((places:PlacesToVisit)->Unit)?=null


    @SuppressLint("NotifyDataSetChanged")
    fun addAll(newElementList: List<PlacesToVisit>) {
        placesToVisitList.clear()
        placesToVisitList.addAll(newElementList)
        notifyDataSetChanged()
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlacesToVisitListViewHolder {
        val binding = ListPlacesBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PlacesToVisitListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PlacesToVisitListViewHolder, position: Int) {
        holder.bind(placesToVisitList[position])
        holder.binding.root.setOnClickListener{
            onPlaceItemClickListener?.invoke(placesToVisitList[position])
        }

    }
    override fun getItemCount(): Int {
        return placesToVisitList.size
    }
    fun setOnPlaceToVisitClickListener(onPlaceToVisitClickListener:((places:PlacesToVisit)->Unit)?){
        this.onPlaceItemClickListener=onPlaceToVisitClickListener
    }
}

class PlacesToVisitListViewHolder(val binding: ListPlacesBinding):RecyclerView.ViewHolder(binding.root) {
    fun bind(places: PlacesToVisit) {
        binding.place = places
    }

}