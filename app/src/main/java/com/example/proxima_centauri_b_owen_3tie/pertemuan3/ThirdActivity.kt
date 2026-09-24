package com.example.proxima_centauri_b_owen_3tie.pertemuan3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proxima_centauri_b_owen_3tie.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnKirim.setOnClickListener {
            val noTujuan = binding.inputNoTujuan.text.toString()
            Log.e("Klik Button Submit", "Tombol berhasil di tekan. Isi dari input Nomor = $noTujuan")
            
            // Membuat Bundle untuk mengirim data
            val bundle = Bundle()
            bundle.putString("noTujuan", noTujuan)
            
            val intent = Intent(this, ThirdResultActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}