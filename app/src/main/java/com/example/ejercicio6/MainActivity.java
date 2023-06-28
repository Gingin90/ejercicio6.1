package com.example.ejercicio6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ejercicio6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private  ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        EditText textName;
        EditText textLastName;
        EditText textMail;
        EditText textPass;

        binding.btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = binding.textName.getText().toString();
                String lastname = binding.textLastName.getText().toString();
                String email = binding.textMail.getText().toString();
                String pass = binding.textPass.getText().toString();

                if(name.isEmpty() || lastname.isEmpty() || email.isEmpty() || pass.isEmpty() || !email.contains("@") ) {
                    Toast.makeText(getBaseContext(), "Faltan campos por completar", Toast.LENGTH_SHORT).show();
                    return;
                }

                String texto = "usuario" + name + " " + lastname + "Email" + email + "contraseña" + pass;
                Toast.makeText(getBaseContext(), texto, Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(), texto, Toast.LENGTH_LONG).show();


            }

        });

    }
}



