package com.decatom.fairpay.onboarding.ui.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.fairpay.R
import com.example.fairpay.databinding.OnboardingScreen3Binding

class OnboardingScreen3 : Fragment() {
    private var _binding: OnboardingScreen3Binding? = null
    private val binding get() = _binding!!
    private lateinit var loginTxt: TextView
    private lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = OnboardingScreen3Binding.inflate(inflater, container, false)

        // initialize textview
        loginTxt = binding.loginText

        loginTxt.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_loginScreen)
        }

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onResume() {
        super.onResume()
        // swipe effect
        viewPager = activity?.findViewById(R.id.viewPager2)!!

        Handler(Looper.getMainLooper()).postDelayed(
            { viewPager.currentItem = 0 },
            2000
        )
    }
}
