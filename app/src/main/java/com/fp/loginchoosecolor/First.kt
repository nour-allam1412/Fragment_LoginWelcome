package com.fp.loginchoosecolor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.fp.loginchoosecolor.databinding.FragmentFirstBinding

class First : Fragment() {
    lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first,  container,false)
        binding.btnLogin.setOnClickListener {
            val username = binding.entEmail.text.toString()
            val password = binding.entPass.text.toString()
            findNavController().navigate(FirstDirections.firstToSecondFragAction(username, password))
        }
        return binding.root
    }
}