package com.example.nb

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.nb.databinding.ActivityMainBinding
import com.example.nb.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("SecondActivity", "onCreate 호출됨")
    }

    override fun onStart() {
        super.onStart()
        Log.d("SecondActivity", "onStart 호출됨")
    }

    override fun onResume() {
        super.onResume()
        Log.d("SecondActivity", "onResume 호출됨")
    }

    override fun onPause() {
        super.onPause()
        Log.d("SecondActivity", "onPause 호출됨")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SecondActivity", "onStop 호출됨")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SecondActivity", "onDestroy 호출됨")
    }
}
