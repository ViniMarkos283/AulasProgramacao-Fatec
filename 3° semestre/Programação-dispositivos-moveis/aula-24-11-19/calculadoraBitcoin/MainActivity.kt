package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.net.URL
import android.widget.TextView
import kotlinx.coroutines.*
import org.json.JSONObject
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    val API_URL = "https://www.mercadobitcoin.net/api/BTC/ticker/"

    var cotacaoBitcoin: Double = 0.0

    // Variáveis de views
    private lateinit var btnCalcular: TextView
    private lateinit var txtCotacao: TextView
    private lateinit var txtValor: TextView
    private lateinit var txtQtdBitcoins: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializando as views
        btnCalcular = findViewById(R.id.btnCalcular)
        txtCotacao = findViewById(R.id.txtCotacao)
        txtValor = findViewById(R.id.txtValor)
        txtQtdBitcoins = findViewById(R.id.txtQtdBitcoins)

        buscarCotacao()

        btnCalcular.setOnClickListener {
            calcular()
        }
    }

    fun buscarCotacao() {
        // Usando CoroutineScope para controle correto da thread
        CoroutineScope(Dispatchers.IO).launch {
            // Trabalha em background
            val resposta = URL(API_URL).readText()
            cotacaoBitcoin = JSONObject(resposta).getJSONObject("ticker")
                .getDouble("last")

            val f = NumberFormat.getCurrencyInstance(Locale("pt", "BR"))
            val cotacaoFormatada = f.format(cotacaoBitcoin)

            withContext(Dispatchers.Main) {
                // Atualizando a UI com a cotação formatada
                txtCotacao.text = cotacaoFormatada
            }
        }
    }

    fun calcular() {
        if (txtValor.text.isEmpty()) {
            txtValor.error = "Preencha um valor"
            return
        }
        // Valor digitado pelo usuário
        val valorDigitado = txtValor.text.toString()
            .replace(",", ".").toDouble()

        // Caso não venha valor da API
        val resultado = if (cotacaoBitcoin > 0) valorDigitado / cotacaoBitcoin else 0.0

        // Atualizando o TextView com o resultado formatado com 8 casas decimais
        txtQtdBitcoins.text = "%.8f".format(resultado)
    }
}
