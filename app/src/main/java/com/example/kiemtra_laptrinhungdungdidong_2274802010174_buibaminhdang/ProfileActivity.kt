package com.example.kiemtra_laptrinhungdungdidong_2274802010174_buibaminhdang

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvProfileEmail =
            findViewById<TextView>(R.id.tvProfileEmail)

        val btnLogout =
            findViewById<Button>(R.id.btnLogout)

        // Nhận Email từ màn hình đăng nhập
        val email = intent.getStringExtra("USER_EMAIL") ?: ""

        // Hiển thị Email
        tvProfileEmail.text = "Email: $email"

        // Quay lại màn hình đăng nhập
        btnLogout.setOnClickListener {
            finish()
        }
    }
}