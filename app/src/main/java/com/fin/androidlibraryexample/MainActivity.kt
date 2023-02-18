package com.fin.androidlibraryexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.fin.androidanimationlibrary.AndroidEffects

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tv_hello=findViewById<TextView>(R.id.tv_hello)
        AndroidEffects.blink(tv_hello)

    }
}