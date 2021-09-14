package com.example.fairpay.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.fairpay.R
import com.example.fairpay.databinding.ChangePasswordScreenBinding
import com.example.fairpay.views.viewmodels.ChangePasswordScreenViewModel

class ChangePasswordScreen : Fragment() {

    lateinit var viewModel: ChangePasswordScreenViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: ChangePasswordScreenBinding =
            DataBindingUtil.inflate(inflater, R.layout.change_password_screen, container, false)

        binding.lifecycleOwner = this
        binding.thisFragment = this

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(ChangePasswordScreenViewModel::class.java)
    }
}
