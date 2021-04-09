package com.example.activity5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityHasil extends AppCompatActivity {

    TextView txEmail, txPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txEmail = findViewById(R.id.TxEmail);
        txPass = findViewById(R.id.TxPass);

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString("a");
        String Pass = bundle.getString("b");

        txEmail.setText(email);
        txPass.setText(Pass);

    }
}