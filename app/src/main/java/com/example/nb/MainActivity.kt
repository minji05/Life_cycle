package com.example.nb

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.nb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("MainActivity", "onCreate 호출됨")
        showToast("Hello World")

        binding.startBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart 호출됨")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume 호출됨")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause 호출됨")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop 호출됨")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy 호출됨")
    }
}

