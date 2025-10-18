package com.example.btapgk;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private EditText etUsername, etPassword;
    private Button btnLogin;
    private final String correctUsername ="myduyen";
    private final String correctPassword ="12345";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(v->{
            String username = etUsername.getText().toString().trim();
            String password = etPassword.getText().toString().trim();
        if(username.isEmpty()||password.isEmpty()){
            Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin!", Toast.LENGTH_SHORT).show();
            return;
        }
        if(username.equals(correctUsername)&& password.equals(correctPassword)){
            Toast.makeText(this,"Đăng nhập thành công!",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, FoodActivity.class);
            intent.putExtra("user",username);
            startActivity(intent);
        }else{
            Toast.makeText(this,"Sai tên đăng nhập hoặc mật khẩu!",Toast.LENGTH_SHORT).show();
        }
        });

    }
}