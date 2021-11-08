package com.example.practica18_drawable

import android.graphics.Color
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.content.res.AppCompatResources

class MainActivity : AppCompatActivity() {
    private lateinit var animacion: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        //setContentView(MyCanvasView(this))
        super.onCreate(savedInstanceState)
        animacion = AppCompatResources.getDrawable(this, R.drawable.animacion) as AnimationDrawable
        val vista= ImageView(this)
        vista.setBackgroundColor(Color.WHITE)
        vista.setImageDrawable(animacion)
        animacion.start()
        setContentView(vista)
    }
} 