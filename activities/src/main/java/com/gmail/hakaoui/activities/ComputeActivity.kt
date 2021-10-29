package com.gmail.hakaoui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gmail.hakaoui.activities.databinding.ComputeActivityBinding

class ComputeActivity : AppCompatActivity() {
    private lateinit var binding: ComputeActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ComputeActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnCalculer.setOnClickListener {
            binding.resultat.text = (binding.field1.text.toString().toDouble() + binding.field2.text.toString().toDouble()).toString()
        }
    }
}
