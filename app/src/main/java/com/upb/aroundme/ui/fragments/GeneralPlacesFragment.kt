package com.upb.aroundme.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.upb.aroundme.R
import com.upb.aroundme.data.LaPazPlacesDataSource
import com.upb.aroundme.databinding.FragmentPlacesGeneralCitiesBinding
import com.upb.aroundme.model.PlacesToVisit
import com.upb.aroundme.ui.adapters.LaPazListAdapter
import com.upb.aroundme.ui.base.StepBaseFragment
import com.upb.aroundme.ui.interfaces.LaPazInfoCallback

class GeneralPlacesFragment: StepBaseFragment() {
    private val laPazPlacesAdapter = LaPazListAdapter()
    private lateinit var binding : FragmentPlacesGeneralCitiesBinding

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
        laPazPlacesAdapter.addAll(LaPazPlacesDataSource.laPazPlacesList)
        laPazPlacesAdapter.setOnPlaceToVisitClickListener {
            val directions = GeneralPlacesFragmentDirections.actionGeneralPlacesFragmentToLocationInfoActivity()
            findNavController().navigate(directions)
        }
    }

}