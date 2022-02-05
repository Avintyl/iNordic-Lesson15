package com.example.afterlesson15

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

object Navigation {

    fun navigateFragmentFromActivity(activity: AppCompatActivity, fragment: Fragment) {
        activity.supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }

    fun navigateToFragmentFromFragment(fragmentActivity: FragmentActivity, fragmentTo: Fragment) {

        fragmentActivity.supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragmentTo)
            .addToBackStack(null)
            .commit()
    }
}