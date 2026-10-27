package com.example.kiemtra_laptrinhungdungdidong_2274802010174_buibaminhdang
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvProfileEmail =
            findViewById<TextView>(R.id.tvProfileEmail)

        val btnLogout =
            findViewById<Button>(R.id.btnLogout)

        val lvSubjects =
            findViewById<ListView>(R.id.lvSubjects)

        // Nhận và hiển thị Email
        val email = intent.getStringExtra("USER_EMAIL") ?: ""
        tvProfileEmail.text = "Email: $email"

        // Danh sách 6 môn học
        val subjects = arrayOf(
            "Lập trình Android",
            "Lập trình Web",
            "Cơ sở dữ liệu",
            "Phân tích thiết kế hệ thống",
            "Lập trình hướng đối tượng",
            "Mạng máy tính"
        )

        // Hiển thị danh sách bằng ArrayAdapter
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            subjects
        )

        lvSubjects.adapter = adapter

        // Nhấn môn học để hiển thị Toast
        lvSubjects.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(
                this,
                subjects[position],
                Toast.LENGTH_SHORT
            ).show()
        }

        // Đăng xuất
        btnLogout.setOnClickListener {
            finish()
        }
    }
}