package com.decatom.fairpay.onboarding.ui.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(
    fm: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fm, lifecycle) {
    var fragments: ArrayList<Fragment> = arrayListOf()

    override fun getItemCount() = fragments.size

    override fun createFragment(position: Int) = fragments[position]
}
