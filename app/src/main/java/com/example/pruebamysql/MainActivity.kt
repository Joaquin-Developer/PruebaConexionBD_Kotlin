package com.example.pruebamysql

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*   // se importa los elementos de xml

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* evento Click del Boton btnConexion */
        btnConexion.setOnClickListener() {

        }


    }
}