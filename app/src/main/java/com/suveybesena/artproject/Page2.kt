package com.suveybesena.artproject

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_page2.*

class Page2 : AppCompatActivity() {

    lateinit var sharedPref : SharedPreferences
    var nameSurname :String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        var get = intent.getStringExtra("keyword")
        welcome2.text = get

        sharedPref = this.getSharedPreferences("com.suveybesena.artproject", Context.MODE_PRIVATE)
        nameSurname = sharedPref.getString("key","")

    }

    fun button2(view: View){

        var name = nameText.text.toString()
        var surname = surnameText.text.toString()
        var nameSurname = "${name}${surname}"

        if (nameSurname.isEmpty()){
            Toast.makeText(this, "Please enter a name.", Toast.LENGTH_LONG).show()
        }else {
            var messageAlert = AlertDialog.Builder(this)
            messageAlert.setTitle("You are logged in with a new profile, would you like to save it?")
            messageAlert.setPositiveButton("Go back and save.",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this, "Enter your name and surname.", Toast.LENGTH_LONG).show()
            })
            messageAlert.setNegativeButton("No, go ahead.",
                DialogInterface.OnClickListener { dialogInterface, i ->
                    sharedPref.edit().putString("key", nameSurname).apply()
                    val intent = Intent(applicationContext, Page3::class.java)
                    intent.putExtra("keyword", nameSurname)
                    startActivity(intent)


            })
            messageAlert.show()


        }


    }
}