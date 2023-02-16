package com.puzzle.bench.myaar

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.puzzle.bench.mylibrary.MyLibraryMainActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button_open_my_library)
        button.setOnClickListener {
            startActivity(MyLibraryMainActivity.getIntent(this))
        }
    }
}