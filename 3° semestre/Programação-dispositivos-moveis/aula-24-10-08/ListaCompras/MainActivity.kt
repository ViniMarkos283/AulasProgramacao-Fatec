package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listViewProduto = findViewById<ListView>(R.id.listViewProdutos)
        val btnInserir = findViewById<Button>(R.id.btnInserir)
        val txtProduto = findViewById<EditText>(R.id.txtProduto)
        val produtosAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)

        listViewProduto.adapter = produtosAdapter

        btnInserir.setOnClickListener {
            val produto = txtProduto.text.toString()
            if (produto.isNotEmpty()) {
                produtosAdapter.add(produto)
                txtProduto.text.clear()
            } else {
                txtProduto.error = "Coloque um Produto"
            }
        }

        listViewProduto.setOnItemClickListener { adapterView: AdapterView<*>, view, position: Int, id ->
            val item = produtosAdapter.getItem(position)
            produtosAdapter.remove(item)
        }
    }
}
