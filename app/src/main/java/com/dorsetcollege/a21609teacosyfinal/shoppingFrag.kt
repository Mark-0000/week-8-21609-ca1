package com.dorsetcollege.a21609teacosyfinal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_shopping.*
import kotlinx.android.synthetic.main.fragment_shopping.view.*
import kotlinx.android.synthetic.main.fragment_titlefrag.view.*


class shoppingFrag : Fragment() {

    //creeating object for class shopping viewModel
    private lateinit var viewModel: shoppingViewModel

    var x = 25
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_shopping, container, false)
        //switching  to cart fragment when cart button was pressed
        viewModel = ViewModelProvider(this).get(shoppingViewModel::class.java)

        view.cartbutton.setOnClickListener{ Navigation.findNavController(view).navigate(R.id.navigate_to_cart)}


        //button listeners to call functions
        view.adddarjelling.setOnClickListener{onD()}
        view.addassam.setOnClickListener{onA()}
        view.addlapsang.setOnClickListener{onL()}
        view.addearlgrey.setOnClickListener{onE()}
        view.addirishbreakfast.setOnClickListener{onI()}
        view.reset.setOnClickListener{onR()}
        viewModel.delivery()
        textUpdate()
        return view
    }

    //methods being called on view model
    //add darjelling method
    private fun onD(){
        viewModel.addDarjelling()
        textUpdate()

    }
    //add assam method
    private fun onA(){
        viewModel.addAssam()
        textUpdate()

    }
    //add lapsang method
    private fun onL(){
        viewModel.addLapsang()
        textUpdate()

    }
    //add earlgrey method
    private fun onE(){
        viewModel.addEarlGrey()
        textUpdate()

    }
    //add irish breakfast method
    private fun onI(){
        viewModel.addIrishBreakfast()
        textUpdate()

    }

    //reset method
    private fun onR(){
        textUpdate()

    }
    // updating the text
    private fun textUpdate(){
        //darjellingquantity.text = x.toString()
    }

}