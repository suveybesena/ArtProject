package com.suveybesena.artproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        object : CountDownTimer(4000, 1000){
            override fun onTick(p0: Long) {
                counter.text = "Are you ready for the fun ? ${p0/1000}"
            }
            override fun onFinish() {
               counter.text = "If you ready, click start!"
            }
        }
       .start()


    }
    fun button(view : View) {
        val intent = Intent(applicationContext, Page2::class.java)
        val text1 = welcome.text.toString()
        intent.putExtra("keyword", text1)
        startActivity(intent)
    }
}









