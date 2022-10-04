package com.example.app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

public class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.i("info","Valor Informacion");
        Log.d("Debug","Valor Debug");
        Log.w("Warning","Valor Warning");
        Log.e("Error","Valor Error");
        Log.v("Ver","Valor Verbose");

      //  val helloText = findViewById<TextView>(R.id.Hello_Text)
        // "Hello Welcome ".also { helloText.text = it }
    }
    /// LOS Cuatros  override funcionan para cuando salga de la aplicacion no la cierre el sistema

    override fun onDestroy() {

        super.onDestroy()
    }

    override fun onStart() {

        super.onStart()
    }


    override fun onStop() {
        super.onStop()
    }
    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }
    //Laboratorio Practico programacion IV, Kotlin
    fun metodoRegistro(){



    }
}