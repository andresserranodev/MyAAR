package com.puzzle.bench.mylibrary

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MyLibraryMainActivity : AppCompatActivity() {

    companion object{
        fun getIntent(context: Context): Intent = Intent(context, MyLibraryMainActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_library_main)
    }
}