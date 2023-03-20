package dev.dgomes.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.dgomes.views.databinding.FragmentPlacesBinding

class PlacesFragment : Fragment() {

    private lateinit var binding: FragmentPlacesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPlacesBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        fun newInstance() = PlacesFragment()
    }

}