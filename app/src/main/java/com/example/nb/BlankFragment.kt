package com.example.nb

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onStart() {
        super.onStart()
        Log.d("ExampleFragment", "onStart 호출됨")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ExampleFragment", "onResume 호출됨")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ExampleFragment", "onPause 호출됨")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ExampleFragment", "onStop 호출됨")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("ExampleFragment", "onDestroyView 호출됨")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ExampleFragment", "onDestroy 호출됨")
    }
}
