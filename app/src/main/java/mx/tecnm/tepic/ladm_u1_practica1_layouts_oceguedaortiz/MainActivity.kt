package mx.tecnm.tepic.ladm_u1_practica1_layouts_oceguedaortiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import mx.tecnm.tepic.ladm_u1_practica1_layouts_oceguedaortiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botNombre.setOnClickListener {
            binding.bienvenida.setText("¡Hola " + binding.nombre.text.toString() + "!  Bienvenido a Playtoon")
            Toast.makeText(this, "Botón presionado", Toast.LENGTH_SHORT).show()
        }

        binding.acerca.setOnClickListener {
            abrirAcerca()
        }

        binding.juegos.setOnClickListener {
            abrirJuegos()
        }

    }

    private fun abrirAcerca() {
        val otraVentana = Intent(this, ScrollingActivity::class.java)
        startActivity(otraVentana)
    }

    private fun abrirJuegos() {
        val otraVentana = Intent(this, SettingsActivity::class.java)
        startActivity(otraVentana)
    }
}