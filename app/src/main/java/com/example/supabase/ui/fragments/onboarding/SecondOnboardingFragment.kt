package com.example.supabase.ui.fragments.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.supabase.R
import com.example.supabase.databinding.FragmentSecondOnboardingBinding
import com.example.supabase.ui.fragments.OnboardFragment

class SecondOnboardingFragment : Fragment() {

    private lateinit var binding: FragmentSecondOnboardingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSecondOnboardingBinding.inflate(layoutInflater)

        binding.button.setOnClickListener{
            val parent = parentFragment as? OnboardFragment
            parent!!.nextPageViewPager()
        }

        return binding.root
    }

}