package com.example.supabase.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.supabase.R
import com.example.supabase.databinding.FragmentOnboardBinding
import com.example.supabase.ui.adapters.ViewPagerAdapter

class OnboardFragment : Fragment() {

    private lateinit var binding: FragmentOnboardBinding
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    private lateinit var viewPager2: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentOnboardBinding.inflate(layoutInflater)

        viewPagerAdapter = ViewPagerAdapter(this    )
        viewPager2 = binding.viewPager2
        viewPager2.adapter = viewPagerAdapter

        return binding.root
    }

    fun nextPageViewPager(){
        binding.viewPager2.setCurrentItem(viewPager2.currentItem + 1, true)
    }

}