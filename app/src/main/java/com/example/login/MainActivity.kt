package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Showinfo(view: android.view.View) {
        val editTextHello = findViewById(R.id.get_fullname) as EditText
        Toast.makeText(this,editTextHello.toString(), Toast.LENGTH_LONG).show()

    }

    fun Test(view: android.view.View) {

    }

}