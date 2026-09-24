package com.example.proxima_centauri_b_owen_3tie.pertemuan3

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proxima_centauri_b_owen_3tie.R

class ThirdResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third_result)

        // Mengambil data dari bundle intent
        val bundle = intent.extras
        val noTujuan = bundle?.getString("noTujuan")
        
        // Menampilkan data ke TextView menggunakan string resource
        val textNomor: TextView = findViewById(R.id.textNomor)
        textNomor.text = getString(R.string.result_nomor_tujuan, noTujuan)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}