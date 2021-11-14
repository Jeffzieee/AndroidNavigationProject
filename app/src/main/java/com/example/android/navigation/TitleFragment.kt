package com.example.android.navigation

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.android.navigation.databinding.FragmentTitleBinding
import java.util.zip.Inflater

class TitleFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,R.layout.fragment_title,container,false)
        binding.playButton.setOnClickListener(
        Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment))

        setHasOptionsMenu(true)
        return binding.root
    }

    //Function to Inflate Menu to ActionBar
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.title_menu, menu)
    }

    //Function to facilitate the action of the menu item
    override fun onOptionsItemSelected(item: MenuItem): Boolean = (NavigationUI.onNavDestinationSelected(item!!, view!!.findNavController())) || (super.onOptionsItemSelected(item))

}