package com.hakaninc.newtoggproject

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.hakaninc.newtoggproject.databinding.FragmentAnimation2Binding

class AnimationFragment2 : Fragment(R.layout.fragment_animation2) {

    private var fragmentBinding: FragmentAnimation2Binding ?= null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentAnimation2Binding.bind(view)
        fragmentBinding = binding

        ObjectAnimator.ofFloat(binding.imageView5,"rotationY",0.0f,-360.0f).apply {
            duration = 1000

        }.start()

        object : CountDownTimer(3000,1000){
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                findNavController().navigate(AnimationFragment2Directions.actionAnimationFragmentToToggMenuFragment())
            }

        }.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        fragmentBinding = null
    }
}