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

        val message = intent.getStringExtra("param")
        val textView = findViewById<TextView>(R.id.tvPEP)
        textView.text = message
        val btnCalculo: Button =findViewById(R.id.btnCalcular)

        btnCalculo.setOnClikListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}