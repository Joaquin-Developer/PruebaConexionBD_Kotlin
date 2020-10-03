package com.example.pruebamysql

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*   // se importa los elementos de xml

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* evento Click del Boton btnConexion */
        btnConexion.setOnClickListener() {
            val conexion = ControladorBD()
            var lista: List<String> = conexion.obtenerUnDato()

            for (elem in lista) {
                Toast.makeText(this, elem.toString(), Toast.LENGTH_SHORT).show()
            }

        }

    }
}