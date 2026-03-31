package com.app.foodorder.v1
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Menentukan layout yang digunakan untuk activity ini
        setContentView(R.layout.activity_splash)
        // Handler digunakan untuk menunda eksekusi suatu perintah
        Handler(Looper.getMainLooper()).postDelayed({
            // Setelah delay selesai, pindah ke MainActivity
            startActivity(Intent(this, MainActivity::class.java))
            // Menutup SplashActivity agar tidak kembali ke layar splash saat
            finish()
        }, 500) // Delay selama 1500 milidetik (1,5 detik)
    }
}
