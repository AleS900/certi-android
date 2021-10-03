package com.upb.aroundme

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CitiesListFragment: StepsBaseFragment() {
    private val citiesListAdapter= CitiesListAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cities_list,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recycledView = view.findViewById<RecyclerView>(R.id.rvCities)
        recycledView.adapter= citiesListAdapter
        //recycledView.layoutManager= LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        recycledView.layoutManager=GridLayoutManager(context,2)
        citiesListAdapter.addAll(CitiesDataSource.departementsList)
    }
}