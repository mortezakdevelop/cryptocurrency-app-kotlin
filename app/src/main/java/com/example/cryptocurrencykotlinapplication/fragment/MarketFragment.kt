package com.example.cryptocurrencykotlinapplication.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.cryptocurrencykotlinapplication.MainActivity
import com.example.cryptocurrencykotlinapplication.R
import com.example.cryptocurrencykotlinapplication.databinding.FragmentMarketBinding

class MarketFragment : Fragment() {

    lateinit var binding: FragmentMarketBinding
    lateinit var mainActivity: MainActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = context as MainActivity
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(layoutInflater, R.layout.fragment_market, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupToolBar(view)
    }

    private fun setupToolBar(view: View) {
        val navController: NavController = Navigation.findNavController(view)
        val appBarConfiguration: AppBarConfiguration =
            AppBarConfiguration.Builder(R.id.marketFragment)
                .setOpenableLayout(mainActivity.drawerLayout).build()

        val toolBar: Toolbar = view.findViewById(R.id.toolbar)
        NavigationUI.setupWithNavController(toolBar,navController,appBarConfiguration)


        navController.addOnDestinationChangedListener(NavController.OnDestinationChangedListener { controller, destination, arguments ->
            if (destination.id == R.id.marketFragment){
                toolBar.setNavigationIcon(R.drawable.ic_baseline_bar_chart_24)
                toolBar.title = "Market"
            }
        })

    }
}