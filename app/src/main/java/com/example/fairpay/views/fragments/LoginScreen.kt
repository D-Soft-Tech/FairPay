package com.example.fairpay.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.fairpay.R
import com.example.fairpay.databinding.LoginScreenBinding

class LoginScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: LoginScreenBinding =
            DataBindingUtil.inflate(inflater, R.layout.login_screen, container, false)

        binding.thisFragm = this

        return binding.root
    }

    fun navigate(view: View) {
        when {
            view is TextView && view.text == getString(R.string.signup) -> {
                val action = LoginScreenDirections.actionLoginScreenToSignupScreen()
                findNavController().navigate(action)
            }
            view is TextView && view.text == getString(R.string.forgot_password) -> {
                val action = LoginScreenDirections.actionLoginScreenToForgotPasswordScreen()
                findNavController().navigate(action)
            }
            view is Button && view.text == getString(R.string.login) -> {
                val action = LoginScreenDirections.actionLoginScreenToCreateGroupScreen()
                findNavController().navigate(action)
            }
        }
    }
}
