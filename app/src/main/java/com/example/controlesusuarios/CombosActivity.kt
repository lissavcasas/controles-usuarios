package com.example.controlesusuarios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.controlesusuarios.databinding.ActivityCombosBinding
import com.google.android.material.checkbox.MaterialCheckBox

class CombosActivity : AppCompatActivity() {

    private lateinit var binding:ActivityCombosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityCombosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnImprimir.setOnClickListener {
            var opcioneSelect=""
           when (binding.rgOpcion.checkedRadioButtonId){

               binding.rbOpcionUno.id ->{
                   opcioneSelect=  "1"
               }
               binding.rbOpcionDos.id ->{
                   opcioneSelect= "2"
               }
               binding.rbOpcionTres.id ->{
                   opcioneSelect="3"
               }
               binding.rbOpcionCuatro.id ->{
                   opcioneSelect="4"
                   /*binding.chkTerminos.checkedState=MaterialCheckBox.STATE_INDETERMINATE*/
               }
               else ->{
                   opcioneSelect=  "-"
               }

           }
            val checkSelect= binding.chkTerminos.isChecked
            val checkEstado= when(binding.chkTerminos.checkedState){

                MaterialCheckBox.STATE_CHECKED->{
                    "ACEPTADO"
                }
                MaterialCheckBox.STATE_UNCHECKED->{
                    "NO ACEPTADO"
                }
                MaterialCheckBox.STATE_INDETERMINATE->{
                    "INDETERMINADO"
                }
                else->{
                    "-"
                }

            }

            binding.lblResultado.text="La opcion seleccionada es: $opcioneSelect, los terminos fueron aceptados $checkSelect, con estado $checkEstado"


        }
    }
}