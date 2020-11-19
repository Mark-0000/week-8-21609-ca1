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
import org.w3c.dom.Text


class shoppingFrag : Fragment() {

    //creeating object for class shopping viewModel
    private lateinit var viewModel: shoppingViewModel

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
        return view
    }

    //methods being called on view model
    //add darjelling method
    private fun onD(){
        viewModel.addDarjelling()
        //darjellingquantity.setText(viewModel.darjellingquan.toString())
        updateText()
    }
    //add assam method
    private fun onA(){
        viewModel.addAssam()
        //assamquantity.setText(viewModel.assamquan.toString())
        updateText()
    }
    //add lapsang method
    private fun onL(){
        viewModel.addLapsang()
        //lapsangquantity.setText(viewModel.lapsangquan.toString())
        updateText()
    }
    //add earlgrey method
    private fun onE(){
        viewModel.addEarlGrey()
        //earlgreyquantity.setText(viewModel.earlgreyquan.toString())
        updateText()
    }
    //add irish breakfast method
    private fun onI(){
        viewModel.addIrishBreakfast()
        //irishbreakfastquantity.setText(viewModel.irishbreakfastquan.toString())
        updateText()
    }
    private fun updateText(){
        irishbreakfastquantity.setText(viewModel.irishbreakfastquan.toString())
        assamquantity.setText(viewModel.assamquan.toString())
        lapsangquantity.setText(viewModel.lapsangquan.toString())
        darjellingquantity.setText(viewModel.darjellingquan.toString())
        earlgreyquantity.setText(viewModel.earlgreyquan.toString())
    }

    //reset method
    private fun onR(){
        viewModel.reset()
        irishbreakfastquantity.setText(viewModel.irishbreakfastquan.toString())
        assamquantity.setText(viewModel.assamquan.toString())
        lapsangquantity.setText(viewModel.lapsangquan.toString())
        darjellingquantity.setText(viewModel.darjellingquan.toString())
        earlgreyquantity.setText(viewModel.earlgreyquan.toString())
    }


}