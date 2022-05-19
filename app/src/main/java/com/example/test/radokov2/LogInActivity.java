package com.example.test.radokov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {

    TextView GoToSign;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);

        GoToSign = findViewById(R.id.go_sign);
        GoToSign.setOnClickListener(v -> {
            Intent sign = new Intent(getApplicationContext(),SignUpActivity.class);
            startActivity(sign);
            finish();
        });

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(v -> {
            Intent Home = new Intent(getApplicationContext(),HomeActivity.class);
            startActivity(Home);
        });
    }
}