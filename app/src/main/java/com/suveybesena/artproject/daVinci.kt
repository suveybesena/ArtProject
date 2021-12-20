package com.suveybesena.artproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class daVinci : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_da_vinci)
    }

    fun backPageVinci(view: View){
            val intent2 = Intent(applicationContext, Page3::class.java)
            startActivity(intent2)
        }



}