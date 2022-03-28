package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    EditText email,pass;
    
    Button sign;
    
    String nama,Pass;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        email =findViewById(R.id.email);
        pass = findViewById(R.id.pas);
        
        sign = findViewById(R.id.button);
        
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = email.getText().toString();
                Pass = pass.getText().toString();
                
                if(nama.isEmpty()||Pass.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Data Harus Di isi", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (nama.equals("Abian") && Pass.equals("123")){
                        Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_SHORT).show();

                        Intent data = new Intent(getApplicationContext(), Home_Activity.class);
                        startActivity(data);
                    }
                    else if(!nama.equals("Abian")){
                        Toast.makeText(getApplicationContext(), "Nama Salah", Toast.LENGTH_SHORT).show();
                    }
                    else if(!Pass.equals("123")){
                        Toast.makeText(getApplicationContext(), "Password Salah", Toast.LENGTH_SHORT).show();
                        
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Login Gagal", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        
    }
}