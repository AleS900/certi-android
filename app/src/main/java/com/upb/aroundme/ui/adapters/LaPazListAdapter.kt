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
import com.upb.aroundme.model.LaPazPlace


class LaPazListAdapter: RecyclerView.Adapter<LaPazListViewHolder>() {
    val placesLaPazList: MutableList<LaPazPlace> = mutableListOf()

    fun addAll(newElementList: MutableList<LaPazPlace>) {
        placesLaPazList.clear()
        placesLaPazList.addAll(newElementList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LaPazListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_places_la_paz, parent, false)
        return LaPazListViewHolder(view)
    }

    override fun onBindViewHolder(holder: LaPazListViewHolder, position: Int) {
        holder.bind(placesLaPazList[position])
    }

    override fun getItemCount(): Int {
        return placesLaPazList.size
    }
}

class LaPazListViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {
    private val laPazPlaceImage = itemView.findViewById<ImageView>(R.id.laPazPlaceImage)
    private val laPazPlaceName = itemView.findViewById<TextView>(R.id.laPazPlaceName)
    private val laPazPlaceShortDescription = itemView.findViewById<TextView>(R.id.laPazPlaceShortDescription)
    private val laPazPlaceLikes = itemView.findViewById<TextView>(R.id.laPazPlaceLikes)

    fun bind(placesLaPaz: LaPazPlace) {
        Glide.with(itemView)
            .load(placesLaPaz.urlImage)
            .transform(CenterCrop(), RoundedCorners(24))
            .into(laPazPlaceImage)
        laPazPlaceName.text = placesLaPaz.placeName
        laPazPlaceShortDescription.text = placesLaPaz.placeDescription
        laPazPlaceLikes.text = "${placesLaPaz.likeCont}"
    }
}