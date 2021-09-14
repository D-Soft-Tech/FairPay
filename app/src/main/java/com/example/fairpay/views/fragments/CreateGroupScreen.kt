package com.example.fairpay.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.fairpay.R
import com.example.fairpay.databinding.CreateGroupScreenBinding

class CreateGroupScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: CreateGroupScreenBinding =
            DataBindingUtil.inflate(inflater, R.layout.create_group_screen, container, false)

        return binding.root
    }
}
