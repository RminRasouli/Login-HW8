package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.pagev2_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pagev2_main)

    }
    var FullName = ""
    var UserName = ""
    var Email = ""
    var PassWord = ""
    var Confirm_PassWord = ""
    var Gender = ""

    fun Showinfo(view: android.view.View) {
//       Toast.makeText(this, showString, Toast.LENGTH_SHORT).show()
    }

    fun register(view: android.view.View) {

        val Full_name = findViewById(R.id.g_fn) as EditText
        val fullNameString = Full_name.text.toString()
        val Username = findViewById(R.id.g_US) as EditText
        val UsernameString = Username.text.toString()
        val email = findViewById(R.id.g_EM) as EditText
        val EmilString = email.text.toString()
        val Password = findViewById(R.id.g_PS) as EditText
        val PasswordString = Password.text.toString()
        val ConfirmPassWord = findViewById(R.id.g_COPS) as EditText
        val ConfirmPasswordString = ConfirmPassWord.text.toString()

        FullName = fullNameString
        UserName = UsernameString
        Email = EmilString
        PassWord = PasswordString
        Confirm_PassWord = ConfirmPasswordString
        if (radiofml.isChecked) {
            Gender = "Female"
        } else if (radioml.isChecked) {
            Gender = "Male"
        }


        TxtFN.setText(fullNameString)
        TxTUser.setText(UsernameString)
        TxTEm.setText(EmilString)
        TxtPAS.setText(PasswordString)
        TxTCOPA.setText(ConfirmPasswordString)
        TxTGender.setText(Gender)

    }

    fun Visible(view: android.view.View) {
        if (a1.getVisibility() == View.VISIBLE) {
            a1.setVisibility(View.INVISIBLE);
        } else {
            a1.setVisibility(View.VISIBLE);
        }
        if (a2.getVisibility() == View.VISIBLE) {
            a2.setVisibility(View.INVISIBLE);
        } else {
            a2.setVisibility(View.VISIBLE);
        }
        if (a3.getVisibility() == View.VISIBLE) {
            a3.setVisibility(View.INVISIBLE);
        } else {
            a3.setVisibility(View.VISIBLE);
        }
        if (a4.getVisibility() == View.VISIBLE) {
            a4.setVisibility(View.INVISIBLE);
        } else {
            a4.setVisibility(View.VISIBLE);
        }
        if (a5.getVisibility() == View.VISIBLE) {
            a5.setVisibility(View.INVISIBLE);
        } else {
            a5.setVisibility(View.VISIBLE);
        }
        if (a6.getVisibility() == View.VISIBLE) {
            a6.setVisibility(View.INVISIBLE);
        } else {
            a6.setVisibility(View.VISIBLE);
        }
        if (a7.getVisibility() == View.VISIBLE) {
            a7.setVisibility(View.INVISIBLE);
        } else {
            a7.setVisibility(View.VISIBLE);
        }
        if (a8.getVisibility() == View.VISIBLE) {
            a8.setVisibility(View.INVISIBLE);
        } else {
            a8.setVisibility(View.VISIBLE);
        }
        if (TxTCOPA.getVisibility() == View.VISIBLE) {
            TxTCOPA.setVisibility(View.INVISIBLE);
        } else {
            TxTCOPA.setVisibility(View.VISIBLE);
        }
        if (TxTEm.getVisibility() == View.VISIBLE) {
            TxTEm.setVisibility(View.INVISIBLE);
        } else {
            TxTEm.setVisibility(View.VISIBLE);
        }
        if (TxTGender.getVisibility() == View.VISIBLE) {
            TxTGender.setVisibility(View.INVISIBLE);
        } else {
            TxTGender.setVisibility(View.VISIBLE);
        }
        if (TxTUser.getVisibility() == View.VISIBLE) {
            TxTUser.setVisibility(View.INVISIBLE);
        } else {
            TxTUser.setVisibility(View.VISIBLE);
        }
        if (TxtFN.getVisibility() == View.VISIBLE) {
            TxtFN.setVisibility(View.INVISIBLE);
        } else {
            TxtFN.setVisibility(View.VISIBLE);
        }
        if (TxtPAS.getVisibility() == View.VISIBLE) {
            TxtPAS.setVisibility(View.INVISIBLE);
        } else {
            TxtPAS.setVisibility(View.VISIBLE);
        }
    }
}

