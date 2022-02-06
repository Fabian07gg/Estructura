package com.example.estructura

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pagina2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina2)
        //boton1
        val boton1 = findViewById<Button>(R.id.button8)
        boton1.setOnClickListener{
            val pase_vista = Intent(this, MainActivity::class.java)
            startActivity(pase_vista)
        }
        //boton2
        val boton2 = findViewById<Button>(R.id.button9)
        boton2.setOnClickListener{
            val pase_vista = Intent(this, Pagina2::class.java)
            startActivity(pase_vista)
        }
        //boton3
        val boton3 = findViewById<Button>(R.id.button10)
        boton3.setOnClickListener{
            val pase_vista = Intent(this, Pagina3::class.java)
            startActivity(pase_vista)
        }
        //boton4
        val boton4 = findViewById<Button>(R.id.button11)
        boton4.setOnClickListener{
            val pase_vista = Intent(this, Pagina4::class.java)
            startActivity(pase_vista)
        }
        //boton5
        val boton5 = findViewById<Button>(R.id.button12)
        boton5.setOnClickListener{
            val pase_vista = Intent(this, Pagina5::class.java)
            startActivity(pase_vista)
        }
    }
}