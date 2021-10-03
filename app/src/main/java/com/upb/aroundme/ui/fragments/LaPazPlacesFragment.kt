package com.upb.aroundme.ui.fragments

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.upb.aroundme.R
import com.upb.aroundme.data.LaPazPlacesDataSource
import com.upb.aroundme.ui.adapters.LaPazListAdapter

class LaPazPlacesFragment: Fragment() {
    private val laPazPlacesAdapter = LaPazListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.activity_lp_places, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.rvPlaceLP)
        recyclerView.adapter = laPazPlacesAdapter

        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        laPazPlacesAdapter.addAll(LaPazPlacesDataSource.laPazPlacesList)
    }
}