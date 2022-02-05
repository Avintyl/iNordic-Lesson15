package com.example.afterlesson15

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

object Navigation {

    fun navigateFragmentFromActivity(activity: AppCompatActivity, fragment: Fragment) {
        activity.supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}