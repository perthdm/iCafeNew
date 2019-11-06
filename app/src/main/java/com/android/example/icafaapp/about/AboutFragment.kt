package com.android.example.icafaapp.about


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

import com.android.example.icafaapp.R
import com.android.example.icafaapp.databinding.FragmentAboutBinding
import com.android.example.icafaapp.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass.
 */
class AboutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentAboutBinding>(inflater,R.layout.fragment_about,container,false)

        return binding.root
    }





}
