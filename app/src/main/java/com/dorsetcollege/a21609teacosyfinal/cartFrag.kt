package com.dorsetcollege.a21609teacosyfinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_cart.*
import kotlinx.android.synthetic.main.fragment_cart.view.*
import kotlinx.android.synthetic.main.fragment_shopping.view.*

class cartFrag : Fragment() {

    //creeating object for class shopping viewModel
    private lateinit var viewModel: shoppingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_cart, container, false)
        viewModel = ViewModelProvider(this).get(shoppingViewModel::class.java)
        //switching back to title fragment when checkout button was pressed
        view.checkoutbutton.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.navigate_to_title)}


        return view
    }

}