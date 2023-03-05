package com.hakaninc.newtoggproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.hakaninc.newtoggproject.databinding.FragmentToggMenuBinding
import javax.inject.Inject

class ToggMenuFragment @Inject constructor(
): Fragment(R.layout.fragment_togg_menu) {
    private var fragmentBinding: FragmentToggMenuBinding ?= null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentToggMenuBinding.bind(view)
        fragmentBinding = binding

        binding.carStatus.setOnClickListener {
            findNavController().navigate(ToggMenuFragmentDirections.actionToggMenuFragmentToCarStatusFragment())
        }
        binding.carMusicPlayer.setOnClickListener {
            findNavController().navigate(ToggMenuFragmentDirections.actionToggMenuFragmentToMusicPlayerFragment())
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        fragmentBinding = null
    }

}