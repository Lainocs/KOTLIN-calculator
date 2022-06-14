package com.example.kotlin_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    var resultat:Int = 0

    fun add(view:View) {
        resultat = nb1.editableText.toString().toInt() + nb2.editableText.toString().toInt()
        result.text = resultat.toString()
    }

    fun less(view:View) {
        resultat = nb1.editableText.toString().toInt() - nb2.editableText.toString().toInt()
        result.text = resultat.toString()
    }

    fun multiply(view:View) {
        resultat = nb1.editableText.toString().toInt() * nb2.editableText.toString().toInt()
        result.text = resultat.toString()
    }

    fun divide(view:View) {
        resultat = nb1.editableText.toString().toInt() / nb2.editableText.toString().toInt()
        result.text = resultat.toString()
    }
}