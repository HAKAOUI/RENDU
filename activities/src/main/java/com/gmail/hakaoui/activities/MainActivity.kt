package com.gmail.hakaoui.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gmail.hakaoui.activities.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var nbClick = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        if (nbClick == 0) {
            binding.texte.text = ""
        }
        binding.btnClickMe.setOnClickListener {
            nbClick++
            val newText = "Cliquez moi $nbClick"
            binding.btnClickMe.text = newText
            val msg = "Vous avez cliquez $nbClick fois"
            binding.texte.text = msg
            if (nbClick == 6) {

                binding.btnClickMe.isEnabled = false
            }
        }
        binding.btnCompute.setOnClickListener {
            val intent = Intent(baseContext, ComputeActivity::class.java)
            startActivity(intent)
        }
    }
}
