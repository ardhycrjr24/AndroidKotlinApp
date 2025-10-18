package com.example.androidkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// Import kelas Binding yang dibuat otomatis
import com.example.androidkotlinapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Deklarasikan SATU variabel binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inisialisasi binding (menggantikan setContentView lama)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set nilai awal
        binding.tvCounter.text = "0"

        // Listener untuk tombol Add
        binding.btnAddNumber.setOnClickListener {
            val currVal = binding.tvCounter.text.toString().toInt()
            val nextVal = currVal + 1
            binding.tvCounter.text = nextVal.toString()
        }

        // Listener untuk tombol Reset
        binding.btnResetNumber.setOnClickListener {
            binding.tvCounter.text = "0"
        }

        // Listener untuk tombol Subtract
        binding.btnSubtractNumber.setOnClickListener {
            val currVal = binding.tvCounter.text.toString().toInt()
            val nextVal = currVal - 1
            binding.tvCounter.text = nextVal.toString()
        }
    }
}