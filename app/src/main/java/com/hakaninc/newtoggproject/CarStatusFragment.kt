package com.hakaninc.newtoggproject

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hakaninc.newtoggproject.databinding.FragmentCarStatusBinding
import com.hakaninc.newtoggproject.databinding.FragmentMusicPlayerBinding
import com.hakaninc.newtoggproject.databinding.FragmentToggMenuBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


class CarStatusFragment : Fragment(R.layout.fragment_car_status) {
    private var fragmentBinding: FragmentCarStatusBinding?= null



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentCarStatusBinding.bind(view)
        fragmentBinding = binding

        binding.textView.visibility = View.INVISIBLE
        binding.textView2.visibility = View.INVISIBLE
        binding.textView3.visibility = View.INVISIBLE
        binding.textView4.visibility = View.INVISIBLE

        object : CountDownTimer(3000,1000){
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                binding.progressBar.visibility = View.INVISIBLE
                binding.textView.visibility = View.VISIBLE
                binding.textView2.visibility = View.VISIBLE
                binding.textView3.visibility = View.VISIBLE
                binding.textView4.visibility = View.VISIBLE
            }

        }.start()
    }
}