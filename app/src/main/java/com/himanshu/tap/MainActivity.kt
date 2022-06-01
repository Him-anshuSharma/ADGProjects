package com.himanshu.tap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.himanshu.tap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var count = 0

        binding.tap.setOnClickListener {
            count += 1
            binding.count.text = count.toString()
        }

    }
}