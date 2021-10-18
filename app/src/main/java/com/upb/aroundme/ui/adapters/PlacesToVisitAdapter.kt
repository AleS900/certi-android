package com.upb.aroundme.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.upb.aroundme.databinding.ListPlacesGeneralCitiesBinding
import com.upb.aroundme.model.PlacesToVisit
import com.upb.aroundme.ui.interfaces.LaPazInfoCallback


class LaPazListAdapter: RecyclerView.Adapter<PlacesToVisitListViewHolder>() {
    private val placesToVisitList: MutableList<PlacesToVisit> = mutableListOf()
    private var onPlaceItemClickListener : ((places:PlacesToVisit)->Unit)?=null
    private lateinit var callBack: LaPazInfoCallback

    @SuppressLint("NotifyDataSetChanged")
    fun addAll(newElementList: MutableList<PlacesToVisit>) {
        placesToVisitList.clear()
        placesToVisitList.addAll(newElementList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlacesToVisitListViewHolder {
        val binding = ListPlacesGeneralCitiesBinding.inflate(LayoutInflater.from(parent.context),parent,false)
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
    fun setCallBack(callBack: LaPazInfoCallback ){
        this.callBack=callBack
    }
    fun setOnPlaceToVisitClickListener(onPlaceToVisitClickListener:((places:PlacesToVisit)->Unit)?){
        this.onPlaceItemClickListener=onPlaceToVisitClickListener
    }
}

class PlacesToVisitListViewHolder(val binding: ListPlacesGeneralCitiesBinding):RecyclerView.ViewHolder(binding.root) {
    fun bind(placesLaPaz: PlacesToVisit) {
        binding.place = placesLaPaz
         /*   Glide.with(itemView)
                .load(placesLaPaz.urlImage)
                .transform(CenterCrop(), RoundedCorners(24))
                .into(binding.laPazPlaceImage)

        binding.laPazPlaceName.text = placesLaPaz.placeName
        binding.laPazPlaceShortDescription.text = placesLaPaz.placeDescription
        binding.laPazPlaceLikes.text = "${placesLaPaz.likeCont}"*/
    }
}