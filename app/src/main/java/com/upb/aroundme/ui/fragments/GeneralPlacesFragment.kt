package com.upb.aroundme.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import com.upb.aroundme.databinding.FragmentPlacesGeneralCitiesBinding
import com.upb.aroundme.ui.adapters.LaPazListAdapter
import com.upb.aroundme.ui.viewmodels.PlacesListViewModel

class GeneralPlacesFragment: Fragment() {
    private val laPazPlacesAdapter = LaPazListAdapter()
    private lateinit var binding : FragmentPlacesGeneralCitiesBinding
    private val placesListViewModel: PlacesListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPlacesGeneralCitiesBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.rvPlaceLP.adapter = laPazPlacesAdapter

        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.rvPlaceLP.layoutManager = layoutManager

        LinearSnapHelper().attachToRecyclerView(binding.rvPlaceLP)

        laPazPlacesAdapter.setOnPlaceToVisitClickListener {
            val directions = GeneralPlacesFragmentDirections.actionGeneralPlacesFragmentToLocationInfoActivity(it)
            findNavController().navigate(directions)
        }

        // This is Data Binding
        placesListViewModel.places.observe(viewLifecycleOwner) {
            laPazPlacesAdapter.addAll(it)
        }



    }

}