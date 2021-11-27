package com.example.aplikasilanjutan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


import android.widget.Toast;



public class Login extends AppCompatActivity {



    String username="admin";

    String password="admin";





    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        EditText username_text=findViewById(R.id.username_text);

        EditText password_text=findViewById(R.id.password_text);

        Button login=findViewById(R.id.btnlogin);



        login.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                if(username_text.getText().toString().equalsIgnoreCase(username)&& password_text.getText().toString().equalsIgnoreCase(password)) {

                    startActivity(new Intent(Login.this, Dashboard.class));

                }else{

                    Toast.makeText(Login.this, "Username atau Password Salah", Toast.LENGTH_SHORT).show();

                }

            }

        });



    }

}

