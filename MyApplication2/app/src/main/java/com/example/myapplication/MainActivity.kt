package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val greetingTextView = findViewById<TextView>(R.id.tvHello)
            val inputField = findViewById<EditText>(R.id.InserirNome)
            val submitButton = findViewById<Button>(R.id.Botão)
            val offersButton = findViewById<Button>(R.id.btoferta)
            submitButton.setOnClickListener {
                val enteredName = inputField.text.toString()

                if (enteredName == ""){
                    offersButton.visibility = INVISIBLE
                    greetingTextView.text = ""
                    Toast.makeText(
                        this@MainActivity,
                        "Insira seu nome!",
                        Toast.LENGTH_SHORT
                    ).show()

                }else {
                    val message = "Fala tu $enteredName"
                    greetingTextView.text = message
                    inputField.text.clear()
                    offersButton.visibility = VISIBLE
                }
            }

    }
}