package com.example.myapplication

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spn_Sexo = findViewById<Spinner>(R.id.spn_Sexo)
        val txt_Idade = findViewById<EditText>(R.id.txt_Idade)  // Campo de idade agora é EditText
        val btn_Calcular = findViewById<Button>(R.id.btn_Calcular)
        val txt_Resultado = findViewById<TextView>(R.id.txt_Resultado)

        spn_Sexo.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,
            listOf("Masculino", "Feminino"))

        // btn_Calcular_onclick
        btn_Calcular.setOnClickListener {
            val sexo = spn_Sexo.selectedItem as String
            val idadeStr = txt_Idade.text.toString()

            if (idadeStr.isEmpty()) {
                txt_Idade.error = "Campo obrigatório"
                return@setOnClickListener  // Sai da função se o campo estiver vazio
            }

            val idade = idadeStr.toInt()
            var resultado = 0

            if (sexo == "Masculino") {
                resultado = 65 - idade
            } else {
                resultado = 62 - idade
            }

            txt_Resultado.text = "Faltam $resultado anos para você se aposentar"
        }
    }
}
