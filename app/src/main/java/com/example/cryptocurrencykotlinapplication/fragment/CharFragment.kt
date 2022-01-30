package com.example.cryptocurrencykotlinapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.cryptocurrencykotlinapplication.R
import com.example.cryptocurrencykotlinapplication.databinding.FragmentCharBinding

class CharFragment : Fragment() {

    lateinit var binding:FragmentCharBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_char,container,false)
        return binding.root
    }
}