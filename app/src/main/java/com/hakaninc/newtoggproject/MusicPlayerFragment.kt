package com.hakaninc.newtoggproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.hakaninc.newtoggproject.databinding.FragmentMusicPlayerBinding
import com.hakaninc.newtoggproject.databinding.FragmentToggMenuBinding


class MusicPlayerFragment : Fragment(R.layout.fragment_music_player) {

    private var fragmentBinding: FragmentMusicPlayerBinding ?= null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Toast.makeText(this.requireContext(),"Bu sayfa tasarım aşamasındadır.",Toast.LENGTH_SHORT).show()
        return super.onCreateView(inflater, container, savedInstanceState)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentMusicPlayerBinding.bind(view)
        fragmentBinding = binding
    }
}