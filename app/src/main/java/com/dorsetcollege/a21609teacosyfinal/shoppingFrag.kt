package com.dorsetcollege.a21609teacosyfinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_shopping.view.*
import kotlinx.android.synthetic.main.fragment_titlefrag.view.*

class shoppingFrag : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_shopping, container, false)
        //switching  to cart fragment when cart button was pressed
        view.cartbutton.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.navigate_to_cart)}
        return view
    }

}