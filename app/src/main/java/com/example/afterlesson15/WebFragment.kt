package com.example.afterlesson15

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_web.*


class WebFragment : Fragment(R.layout.fragment_web) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setUpWebView()
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun setUpWebView(){
        wbv.webViewClient = WebViewClient()

        wbv.apply {
            loadUrl("https://github.com/Avintyl/iNordic-Lesson15")
            settings.javaScriptEnabled = true
            if (Build.VERSION.SDK_INT >= 26) {
                settings.safeBrowsingEnabled = true
            }
        }
    }
}