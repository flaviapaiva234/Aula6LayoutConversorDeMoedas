package com.example.aula6conversor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.aula6conversor.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

private var _binding: FragmentFirstBinding? = null

    private val binding get() = _binding!!

        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       _binding = FragmentFirstBinding.inflate(inflater, container, false)

            return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listener()
    }

    private fun listener() {
        binding.button.setOnClickListener {
            convert()
        }
    }
    private fun convert() {
        val getValueFromEditText = binding.etValor.text.toString()
        val realToday = 5.17

        val calc = getValueFromEditText.toDouble() * realToday

        binding.tv2.text = calc.toString()
    }
    }