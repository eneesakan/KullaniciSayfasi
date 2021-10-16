package com.example.kullanicisayfasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.LayoutInflater
import com.example.kullanicisayfasi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater)
        setContentView(binding.root)

        binding.btnGirisYap.setOnClickListener {
            intent = Intent(applicationContext,MainHosgeldiniz::class.java)
            startActivity(intent)
        }

    }
}