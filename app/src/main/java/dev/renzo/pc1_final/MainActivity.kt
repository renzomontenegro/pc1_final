package dev.renzo.pc1_final

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val etParcial : EditText = findViewById(R.id.etParcial)
        val etFinal : EditText = findViewById(R.id.etFinal)
        val etPEP : EditText = findViewById(R.id.etPEP)
        val btnCalcular : Button = findViewById(R.id.btnCalcular)

        btnCalcular.setOnClickListener{
            this.sendMessage(etPEP.text.toString());
        }
    }
    private fun sendMessage(message: String){
        val intent = Intent(this,ResultadoCalculo::class.java)
        intent.putExtra("param",message)
        startActivity(intent)
    }
}