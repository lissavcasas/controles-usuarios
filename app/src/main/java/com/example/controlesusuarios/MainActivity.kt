package com.example.controlesusuarios

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.controlesusuarios.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnEntradaTexto.setOnClickListener {
           val intentTextos = Intent(this,TextosActivity::class.java)
            startActivity(intentTextos)


//            val intentCombo=Intent(this,CombosActivity::class.java)
//            startActivity(intentCombo)


        }
    }
}