package com.upb.aroundme.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.upb.aroundme.ui.interfaces.CitiesCallBack
import com.upb.aroundme.ui.adapters.CitiesListAdapter
import com.upb.aroundme.R
import com.upb.aroundme.data.CitiesDataSource
import com.upb.aroundme.databinding.FragmentCitiesListBinding
import com.upb.aroundme.model.City
import com.upb.aroundme.ui.base.StepBaseFragment

class CitiesListFragment: StepBaseFragment() {
    private val citiesListAdapter= CitiesListAdapter()
    private lateinit var binding: FragmentCitiesListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCitiesListBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.rvCities.adapter = citiesListAdapter
        val layoutManager = GridLayoutManager(context, 2)
        binding.rvCities.layoutManager = layoutManager
        citiesListAdapter.addAll(CitiesDataSource.departementsList)
        citiesListAdapter.setOnCityClickListener {
            val directions = CitiesListFragmentDirections.actionCitiesListFragmentToGeneralCityActivity()
            findNavController().navigate(directions)
        }


    }
}