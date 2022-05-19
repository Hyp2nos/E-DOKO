package com.example.test.radokov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    TextView GoToLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        GoToLog = findViewById(R.id.go_log);
        GoToLog.setOnClickListener(v -> {
            Intent log = new Intent(getApplicationContext(),LogInActivity.class);
            startActivity(log);
            finish();
        });
    }
}