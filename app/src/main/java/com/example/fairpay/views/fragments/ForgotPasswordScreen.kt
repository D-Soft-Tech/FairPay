package com.example.fairpay.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.fairpay.R
import com.example.fairpay.databinding.ForgotPasswordScreenBinding
import com.example.fairpay.views.viewmodels.ForgotPasswordScreenViewModel

class ForgotPasswordScreen : Fragment() {

    private lateinit var viewModel: ForgotPasswordScreenViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: ForgotPasswordScreenBinding =
            DataBindingUtil.inflate(inflater, R.layout.forgot_password_screen, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(ForgotPasswordScreenViewModel::class.java)
    }
}
