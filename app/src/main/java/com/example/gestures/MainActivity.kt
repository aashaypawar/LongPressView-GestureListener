package com.example.gestures

import android.os.Bundle
import android.view.GestureDetector
import android.view.GestureDetector.SimpleOnGestureListener
import android.view.MotionEvent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private val gestureDetector = GestureDetector(object : SimpleOnGestureListener() {
        override fun onLongPress(e: MotionEvent) {
            Toast.makeText(applicationContext,"Long Press Detected",Toast.LENGTH_SHORT).show()
        }
    })

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return gestureDetector.onTouchEvent(event)
    }
}