package com.example.proxima_centauri_b_owen_3tie.pertemuan_4

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proxima_centauri_b_owen_3tie.MainActivity
import com.example.proxima_centauri_b_owen_3tie.R
import com.example.proxima_centauri_b_owen_3tie.databinding.ActivityFourthBinding
import com.example.proxima_centauri_b_owen_3tie.databinding.ActivityMainBinding


class FourthActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFourthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityFourthBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnToMain.setOnClickListener {
            Log.e("Klik Button Submit", "Pindah Halaman")
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}