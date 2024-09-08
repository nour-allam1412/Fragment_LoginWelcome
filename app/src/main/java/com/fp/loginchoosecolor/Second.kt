package com.fp.loginchoosecolor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.fp.loginchoosecolor.databinding.FragmentFirstBinding
import com.fp.loginchoosecolor.databinding.FragmentSecondBinding

class Second : Fragment() {
    lateinit var binding: FragmentSecondBinding
    val args: SecondArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second,  container,false)

        binding.welcometxt.text = buildString {
            append("Welcome, ")
            append(args.username)
            append(". Your Password is: ")
            append(args.password)
        }

        binding.btnEnter.setOnClickListener {
            binding.coloredtxt.text = buildString {
                append("Your Colored Text is: ")
                append(binding.entText.text)
            }
        }

        //binding.coloredtxt.currentTextColor =
        return binding.root
    }
}