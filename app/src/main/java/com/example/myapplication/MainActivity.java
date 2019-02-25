package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mensagemEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensagemEditText =
                findViewById(R.id.mensagemEditText);
    }

    public void enviarMensagem(View view) {
       /* Toast.makeText(this, "Funcionou",
                Toast.LENGTH_SHORT).show();*/

        Intent i =
                new Intent (this, ExibeMensagemActivity.class);
        String msg =
                mensagemEditText.getEditableText().
                        toString();

        Intent mensagem = i.putExtra("mensagem", msg);
        startActivity(1);
    }
}
