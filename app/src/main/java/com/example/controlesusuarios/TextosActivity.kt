package com.example.controlesusuarios
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.controlesusuarios.databinding.ActivityTextosBinding
class TextosActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityTextosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTextosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMostrarError.setOnClickListener {
            binding.txtNombreFill.error=resources.getString(R.string.error_campo_requerido)
        }
        binding.btnLimpiarError.setOnClickListener {
            binding.txtNombreFill.error=null
        }
        binding.btnImprimir.setOnClickListener {
            binding.txtNombreFill.error=null

            val nombre  =binding.txtNombreFill.editText?.text.toString()
            val dia =binding.txtDiaFill.editText?.text.toString()
            val clave=binding.txtClaveFill.editText?.text.toString()

            if (nombre.isEmpty()) {
                binding.txtNombreFill.error=resources.getString(R.string.error_campo_requerido)
                return@setOnClickListener
            }
            //binding.lblResultado.text= "Nombre: $nombre\nDia: $dia\nClave: $clave "
            binding.lblResultado.text=resources.getString(R.string.resultado_,nombre,dia,clave)
        }
    }
}