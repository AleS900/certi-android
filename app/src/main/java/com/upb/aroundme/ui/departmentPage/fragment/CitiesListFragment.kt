package com.upb.aroundme.ui.departmentPage.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.upb.aroundme.ui.adapters.CitiesListAdapter
import com.upb.aroundme.data.DepartmentDataSource
import com.upb.aroundme.databinding.FragmentCitiesListBinding

class CitiesListFragment: Fragment() {
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
        citiesListAdapter.addAll(DepartmentDataSource.departmentList)
        citiesListAdapter.setOnCityClickListener {
            val directions = CitiesListFragmentDirections.actionCitiesListFragmentToGeneralCityActivity(it)
            findNavController().navigate(directions)
        }


    }
}