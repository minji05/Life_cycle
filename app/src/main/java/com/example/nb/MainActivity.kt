package com.example.nb

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
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

        // Fragment 추가 버튼 클릭 시
        binding.addFragmentBtn.setOnClickListener {
            addFragment()
        }

        // Fragment 제거 버튼 클릭 시
        binding.removeFragmentBtn.setOnClickListener {
            removeFragment()
        }
    }

    private fun addFragment() {
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

        val fragment = BlankFragment()
        fragmentTransaction.add(R.id.fragmentContainer, fragment, "BlankFragment")
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    private fun removeFragment() {
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

        // Fragment를 제거하고 로그를 출력
        val fragment = fragmentManager.findFragmentByTag("BlankFragment")
        if (fragment != null) {
            fragmentTransaction.remove(fragment)
            fragmentTransaction.commit()
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

