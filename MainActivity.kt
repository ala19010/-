package com.example.simplecourseapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // قائمة الكورسات
        val courses = listOf(
            Course("كورس تطوير الذات", "أندرو تيت", "https://example.com"),
            Course("كورس اللياقة البدنية", "أندرو تيت", "https://example.com"),
            Course("كورس إدارة الأموال", "أندرو تيت", "https://example.com"),
            Course("كورس العلاقات الاجتماعية", "تريستان تيت", "https://example.com"),
            Course("كورس التسويق الرقمي", "تريستان تيت", "https://example.com")
        )

        // إعداد RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CourseAdapter(courses)
    }
}
