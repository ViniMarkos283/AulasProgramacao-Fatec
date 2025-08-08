package com.example.myapplication

import android.os.Bundle
import android.util.Base64
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputText: EditText = findViewById(R.id.inputText)
        val encryptionTypeSpinner: Spinner = findViewById(R.id.encryptionTypeSpinner)
        val encryptButton: Button = findViewById(R.id.encryptButton)
        val decryptButton: Button = findViewById(R.id.decryptButton)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        encryptButton.setOnClickListener {
            val input = inputText.text.toString()
            val selectedType = encryptionTypeSpinner.selectedItem.toString()
            val result = when (selectedType) {
                "Base64" -> encryptBase64(input)
                "Cifra de César" -> encryptCaesar(input, 3)
                "Morse" -> encryptMorse(input)
                "Zenit Polar" -> zenitPolar(input, true)
                "Teclado Numérico" -> encryptT9(input)
                else -> "Tipo de criptografia não suportado"
            }
            resultTextView.text = result
        }

        decryptButton.setOnClickListener {
            val input = inputText.text.toString()
            val selectedType = encryptionTypeSpinner.selectedItem.toString()
            val result = when (selectedType) {
                "Base64" -> decryptBase64(input)
                "Cifra de César" -> decryptCaesar(input, 3)
                "Morse" -> decryptMorse(input)
                "Zenit Polar" -> zenitPolar(input, false)
                "Teclado Numérico" -> decryptT9(input)
                else -> "Tipo de descriptografia não suportado"
            }
            resultTextView.text = result
        }
    }

    // Base64
    private fun encryptBase64(input: String): String {
        return Base64.encodeToString(input.toByteArray(), Base64.DEFAULT)
    }

    private fun decryptBase64(input: String): String {
        return String(Base64.decode(input, Base64.DEFAULT))
    }

    // Cifra de César
    private fun encryptCaesar(input: String, shift: Int): String {
        return input.map {
            if (it.isLetter()) {
                val offset = if (it.isUpperCase()) 'A' else 'a'
                ((it - offset + shift) % 26 + offset.code).toChar()
            } else it
        }.joinToString("")
    }

    private fun decryptCaesar(input: String, shift: Int): String {
        return encryptCaesar(input, 26 - shift)
    }

    // Morse
    private val morseMap = mapOf(
        'A' to ".-", 'B' to "-...", 'C' to "-.-.", 'D' to "-..", 'E' to ".", 'F' to "..-.",
        'G' to "--.", 'H' to "....", 'I' to "..", 'J' to ".---", 'K' to "-.-", 'L' to ".-..",
        'M' to "--", 'N' to "-.", 'O' to "---", 'P' to ".--.", 'Q' to "--.-", 'R' to ".-.",
        'S' to "...", 'T' to "-", 'U' to "..-", 'V' to "...-", 'W' to ".--", 'X' to "-..-",
        'Y' to "-.--", 'Z' to "--..", ' ' to "/"
    )
    private val morseReverseMap = morseMap.entries.associate { it.value to it.key }

    private fun encryptMorse(input: String): String {
        return input.uppercase().map { morseMap[it] ?: "" }.joinToString(" ")
    }

    private fun decryptMorse(input: String): String {
        return input.split(" ").map { morseReverseMap[it] ?: ' ' }.joinToString("")
    }

    // Zenit Polar
    private fun zenitPolar(input: String, isEncrypt: Boolean): String {
        val pairs = "ZENITPOLARzenitpolar"
        return input.map {
            val index = pairs.indexOf(it)
            if (index == -1) it else pairs[(index + 5) % 10 + (index / 10) * 10]
        }.joinToString("")
    }

    // Teclado Numérico (T9)
    private val t9Map = mapOf(
        'A' to "2", 'B' to "22", 'C' to "222",
        'D' to "3", 'E' to "33", 'F' to "333",
        'G' to "4", 'H' to "44", 'I' to "444",
        'J' to "5", 'K' to "55", 'L' to "555",
        'M' to "6", 'N' to "66", 'O' to "666",
        'P' to "7", 'Q' to "77", 'R' to "777", 'S' to "7777",
        'T' to "8", 'U' to "88", 'V' to "888",
        'W' to "9", 'X' to "99", 'Y' to "999", 'Z' to "9999",
        ' ' to "0"
    )
    private val t9ReverseMap = t9Map.entries.associate { it.value to it.key }

    private fun encryptT9(input: String): String {
        return input.uppercase().map { t9Map[it] ?: "" }.joinToString(" ")
    }

    private fun decryptT9(input: String): String {
        return input.split(" ").map { t9ReverseMap[it] ?: ' ' }.joinToString("")
    }
}
