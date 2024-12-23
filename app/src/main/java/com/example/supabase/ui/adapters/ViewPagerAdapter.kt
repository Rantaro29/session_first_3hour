package com.example.supabase.ui.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.supabase.ui.fragments.onboarding.FirstOnboardingFragment
import com.example.supabase.ui.fragments.onboarding.SecondOnboardingFragment
import com.example.supabase.ui.fragments.onboarding.ThirdOnboardingFragment

class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FirstOnboardingFragment()
            1 -> SecondOnboardingFragment()
            2 -> ThirdOnboardingFragment()
            else -> throw IllegalStateException("else")
        }
    }
}