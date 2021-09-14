package com.decatom.fairpay.onboarding.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.fairpay.R
import com.example.fairpay.databinding.FragmentViewPagerBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ViewPagerFragment : Fragment() {
    private var _binding: FragmentViewPagerBinding? = null
    private val binding get() = _binding!!
    private lateinit var getStartedBtn: Button
    private lateinit var tabLayout: TabLayout
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

        getStartedBtn = binding.forgotPasswordSendEmailBtn

        getStartedBtn.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_loginScreen)
        }

        // Initializing views
        viewPager = binding.viewPager2 // View Pager
        tabLayout = binding.tabLayout // TabLayout
        viewPager.adapter = adapter // Setting adapter to the viewpager

        TabLayoutMediator(tabLayout, viewPager) { _, _ ->
        }.attach()

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
