package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ExibeMensagemActivity extends AppCompatActivity {

    private TextView mensagemTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibe_mensagem);

        int i = mensagemTextView - findViewById(R.id.mensagemEditText);

    }

}
