package com.example.androidkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // BAGIAN 1: DEKLARASI VARIABEL
    private lateinit var tvCounter: TextView
    private lateinit var btnAddNumber: Button
    private lateinit var btnSubtractNumber: Button
    private lateinit var btnResetNumber: Button // <-- TAMBAHKAN BARIS INI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // BAGIAN 2: INISIALISASI VARIABEL
        tvCounter = findViewById(R.id.tvCounter)
        btnAddNumber = findViewById(R.id.btnAddNumber)
        btnSubtractNumber = findViewById(R.id.btnSubtractNumber)
        btnResetNumber = findViewById(R.id.btnResetNumber) // <-- TAMBAHKAN BARIS INI

        tvCounter.text = "0"

        // Listener untuk tombol Add (sudah ada)
        btnAddNumber.setOnClickListener {
            val currVal = tvCounter.text.toString().toInt()
            val nextVal = currVal + 1
            tvCounter.text = nextVal.toString()
        }

        // ===============================================
        // BAGIAN 3: TAMBAHKAN LISTENER RESET DI SINI
        // ===============================================
        btnResetNumber.setOnClickListener {
            tvCounter.text = "0" // Langsung set nilai ke "0"
        }
        // ===============================================

        // Listener untuk tombol Subtract (sudah ada)
        btnSubtractNumber.setOnClickListener {
            val currVal = tvCounter.text.toString().toInt()
            val nextVal = currVal - 1
            tvCounter.text = nextVal.toString()
        }

    } // <-- Ini adalah kurung kurawal penutup untuk 'onCreate'
}