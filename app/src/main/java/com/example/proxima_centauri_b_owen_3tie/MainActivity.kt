package com.example.proxima_centauri_b_owen_3tie

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proxima_centauri_b_owen_3tie.databinding.ActivityFourthBinding
import com.example.proxima_centauri_b_owen_3tie.databinding.ActivityMainBinding
import com.example.proxima_centauri_b_owen_3tie.pertemuan3.ThirdResultActivity
import com.example.proxima_centauri_b_owen_3tie.pertemuan_4.FourthActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnToFourth.setOnClickListener {
            Log.e("Klik Button Submit", "Pindah Halaman")
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }
    }
}