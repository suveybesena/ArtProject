package com.suveybesena.artproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class VanGogh : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_van_gogh)
    }

    fun backPageGogh(view: View){
        val intent2 = Intent(applicationContext, Page3::class.java)
        startActivity(intent2)
    }
}