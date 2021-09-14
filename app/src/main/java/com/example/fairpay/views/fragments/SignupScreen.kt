package com.example.fairpay.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.fairpay.R
import com.example.fairpay.databinding.SignupScreenBinding
import com.example.fairpay.views.viewmodels.SignupScreenViewModel

class SignupScreen : Fragment() {

    private lateinit var viewModel: SignupScreenViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: SignupScreenBinding =
            DataBindingUtil.inflate(inflater, R.layout.signup_screen, container, false)

        binding.signupFragment = this

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(SignupScreenViewModel::class.java)
    }

    fun navigate(view: View) {
        when {
            view is TextView && view.text == getString(R.string.login) -> {
                val action = SignupScreenDirections.actionSignupScreenToLoginScreen()
                findNavController().navigate(action)
            }
            view is TextView && view.text == getString(R.string.forgot_password) -> {
                val action = SignupScreenDirections.actionSignupScreenToForgotPasswordScreen()
                findNavController().navigate(action)
            }
            view is Button && view.text == getString(R.string.join_fairpay) -> {
                val action = SignupScreenDirections.actionSignupScreenToCreateGroupScreen()
                findNavController().navigate(action)
            }
        }
    }
}
