package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TextView NoteApp = findViewById(R.id.textView3);
        EditText email = findViewById(R.id.et_email);
        EditText pass = findViewById(R.id.et_password);
        Button btn = findViewById(R.id.btn_connect);
        TextView Signup = findViewById(R.id.tv_signup);

        Signup.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,SignupActivity.class);
            startActivity(intent);

        });

        btn.setOnClickListener(v -> {
            String user = "test@gmail.com";
            String password = "1234";
            if(email.getText().toString().equals(user)&& pass.getText().toString().equals(password)){

                Intent intent = new Intent(MainActivity.this,WelcomeActivity.class);
                intent.putExtra("email", user);
                startActivity(intent);

            }else {
                Toast.makeText(this,"Wrong password or email",Toast.LENGTH_SHORT).show();
            }


        });
    }
}