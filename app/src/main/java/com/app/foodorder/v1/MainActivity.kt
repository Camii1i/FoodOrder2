package com.app.foodorder.v1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.foodorder.v1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Menampilkan teks sambutan
        binding.tvGreeting.text = "Selamat datang 👋"

        // Menampilkan lokasi
        binding.tvLocation.text = "UPNVJ, Jakarta"

        // Hint pencarian
        binding.etSearch.hint = "Cari makanan, minuman, atau restoran"
    }
}