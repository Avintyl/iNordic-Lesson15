package com.example.afterlesson15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.afterlesson15.Navigation.navigateFragmentFromActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_container)

        val mainFragment = MainFragment();
        val bundleFragment = Bundle();
        bundleFragment.putString("INITIALIZATION_INFO", "Прювет")
        mainFragment.arguments = bundleFragment;
        navigateFragmentFromActivity(this, mainFragment)

    }
}