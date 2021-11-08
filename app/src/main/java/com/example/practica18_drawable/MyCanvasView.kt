package com.example.practica18_drawable

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.view.View
import androidx.appcompat.content.res.AppCompatResources

class MyCanvasView(context: Context): View(context) {
    private lateinit var miImagen: Drawable

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        setBackgroundResource(R.drawable.degradado)
//        miImagen=AppCompatResources.getDrawable(context,R.drawable.android)!!
        miImagen=AppCompatResources.getDrawable(context, R.drawable.estrella)!!
//        miImagen=AppCompatResources.getDrawable(context, R.drawable.ic_baseline_history_edu_24)!!
        miImagen.setBounds(100,100,300,300)
    }
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        miImagen.draw(canvas)
    }
}