package com.suveybesena.artproject

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_page3.*

class Page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)



        var toast = intent.getStringExtra("keyword")
        page2WelcomeText.text = "${toast} is here!"
        introText.text = "How are you today ${toast}? Don't worry if you're not well, I have some great topics for you!"
    }
    fun davinci(view : View) {
        val intent = Intent(applicationContext, daVinci::class.java)
        startActivity(intent)
    }
    fun gogh(view : View) {
        val intent = Intent(applicationContext, VanGogh::class.java)
        startActivity(intent)
    }


}