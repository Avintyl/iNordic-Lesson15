package com.example.afterlesson15

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnAnimation.setOnClickListener() {
            Toast.makeText(view.context, "Я - анимация, я анимируюсь!", Toast.LENGTH_SHORT).show()
        }
    }
}