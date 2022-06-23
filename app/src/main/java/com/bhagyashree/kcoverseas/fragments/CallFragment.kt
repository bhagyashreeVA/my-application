package com.bhagyashree.kcoverseas.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bhagyashree.kcoverseas.R
import com.bhagyashree.kcoverseas.R.layout.fragment_call


class CallFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(fragment_call, container, false)
    }

}