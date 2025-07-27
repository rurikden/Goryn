package com.goryn.azs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.goryn.azs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Инициализация UI
        setupUI()
    }

    private fun setupUI() {
        // Здесь можно добавить дополнительную логику для UI
        // Пока что просто отображаем название приложения
    }
}