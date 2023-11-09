package com.example.eletriccarapp.presentation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.eletriccarapp.R

class CalcularAutonomiaActivity : AppCompatActivity() {

    lateinit var preco : EditText
    lateinit var KmPercorrido : EditText
    lateinit var resultado : TextView
    lateinit var btncalcular : Button
    lateinit var btnClose :ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular_autonomia)
        setupView()
        setupListeners ()

        }

    fun setupView() {
        preco = findViewById(R.id.et_preco_kmh)
        KmPercorrido = findViewById(R.id.et_km_percorrido)
        resultado = findViewById(R.id.tv_resultado)
        btncalcular = findViewById(R.id.btn_calcular)
        btnClose = findViewById(R.id.iv_close)
    }

    fun setupListeners () {
        btncalcular.setOnClickListener{
            calcular()

        }
        btnClose.setOnClickListener{
            finish()
        }
    }

    fun calcular () {
        val preco = preco.text.toString().toFloat()
        val km = KmPercorrido.text.toString().toFloat()
        val result = preco / km

        resultado.text = result.toString()
    }

}