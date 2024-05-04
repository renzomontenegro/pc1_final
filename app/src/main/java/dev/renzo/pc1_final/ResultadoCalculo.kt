package dev.renzo.pc1_final

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultadoCalculo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_resultado_calculo)

        val promedio = intent.getStringExtra("param")
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        tvResultado.text = promedio

        val btnRegresar: Button = findViewById(R.id.btnRegresar)

        btnRegresar.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}