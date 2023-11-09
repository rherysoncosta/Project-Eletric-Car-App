package com.example.eletriccarapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.eletriccarapp.data.CarFactory
import com.example.eletriccarapp.presentation.CalcularAutonomiaActivity
import com.example.eletriccarapp.presentation.adapter.CarAdapter


class MainActivity : AppCompatActivity() {

    lateinit var btnCalcular: Button
    lateinit var listaCarros: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Lifecycle")
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()
        setupList()
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle", "RESUME")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "Start")

    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle", "Pause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle", "Stop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle", "Destroy")

    }

    fun setupList() {

        val adapter = CarAdapter(CarFactory.list)
        listaCarros.adapter = adapter

    }

    fun setupView() {
        btnCalcular = findViewById(R.id.btn_calcular)
        listaCarros = findViewById(R.id.rv_lista_carros)
    }

    fun setupListeners() {

        btnCalcular.setOnClickListener {
            startActivity(Intent (this, CalcularAutonomiaActivity::class.java))
        }
    }


}