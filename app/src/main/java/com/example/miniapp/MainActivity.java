package com.example.miniapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.miniapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btn1.setOnClickListener(v -> {
            startActivity(new Intent(this, HakkimizdaActivity.class));
        });

        binding.btn2.setOnClickListener(v -> {
            startActivity(new Intent(this, IletisimActivity.class));
        });


    }
}