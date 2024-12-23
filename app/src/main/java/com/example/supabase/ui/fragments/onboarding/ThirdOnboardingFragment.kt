package com.example.supabase.ui.fragments.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.supabase.R
import com.example.supabase.databinding.FragmentThirdOnboardingBinding
import com.example.supabase.ui.fragments.OnboardFragment

class ThirdOnboardingFragment : Fragment() {

    private lateinit var binding: FragmentThirdOnboardingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentThirdOnboardingBinding.inflate(layoutInflater)

        binding.button.setOnClickListener{
            findNavController().navigate(R.id.action_onboardFragment_to_homeFragment)
        }

        return binding.root
    }

}