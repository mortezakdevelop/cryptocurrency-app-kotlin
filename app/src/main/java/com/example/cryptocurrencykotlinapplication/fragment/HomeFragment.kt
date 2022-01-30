package com.example.cryptocurrencykotlinapplication.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.cryptocurrencykotlinapplication.MainActivity
import com.example.cryptocurrencykotlinapplication.R
import com.example.cryptocurrencykotlinapplication.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binging:FragmentHomeBinding
    lateinit var mainActivity:MainActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = context as MainActivity
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binging = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_home,container,false)
        // Inflate the layout for this fragment
        return binging.root
    }

}