package com.gardner.honorsmobileapps.grocerylist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gardner.honorsmobileapps.grocerylist.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container,false)
       val rootView = binding.root
        // Inflate the layout for this fragment
        return rootView

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}