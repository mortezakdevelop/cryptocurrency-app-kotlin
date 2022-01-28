package com.example.cryptocurrencykotlinapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.cryptocurrencykotlinapplication.R
import com.example.cryptocurrencykotlinapplication.databinding.FragmentMarketBinding

class MarketFragment : Fragment() {

    lateinit var binding:FragmentMarketBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_market,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }
}