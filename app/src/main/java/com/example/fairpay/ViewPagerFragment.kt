package com.example.fairpay

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.fairpay.databinding.FragmentViewPagerBinding
import com.example.fairpay.oboarding.OnboardingScreen1
import com.example.fairpay.oboarding.OnboardingScreen2
import com.example.fairpay.oboarding.OnboardingScreen3
import com.example.fairpay.oboarding.ViewPagerAdapter

class ViewPagerFragment : Fragment() {
    private var _binding: FragmentViewPagerBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewPager: ViewPager2 // ViewPager
    private lateinit var adapter: ViewPagerAdapter // The Adapter
    // List of the onBoarding fragment
    private val fragments = arrayListOf(
        OnboardingScreen1(),
        OnboardingScreen2(),
        OnboardingScreen3()
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentViewPagerBinding.inflate(inflater, container, false)

        // Adapter
        adapter = ViewPagerAdapter(requireActivity().supportFragmentManager, lifecycle)
        adapter.fragments = fragments

        // View Pager
        viewPager = binding.viewPager2
        viewPager.adapter = adapter

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
