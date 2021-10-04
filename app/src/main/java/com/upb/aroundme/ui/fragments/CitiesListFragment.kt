package com.upb.aroundme.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.upb.aroundme.ui.interfaces.CitiesCallBack
import com.upb.aroundme.ui.adapters.CitiesListAdapter
import com.upb.aroundme.R
import com.upb.aroundme.data.CitiesDataSource
import com.upb.aroundme.model.City
import com.upb.aroundme.ui.base.StepBaseFragment

class CitiesListFragment: StepBaseFragment() {
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
        addEvents()
        citiesListAdapter.addAll(CitiesDataSource.departementsList)

    }
    private fun addEvents(){
        citiesListAdapter.setCallBack(object : CitiesCallBack {
            override fun onTaskCityClicked(task: City) {
                onSuccess?.invoke()
            }
        })
    }
}