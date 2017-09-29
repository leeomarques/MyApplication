package com.example.leonardo.aprendendo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edt = (EditText) findViewById(R.id.edtTexto);
        Button btn = (Button) findViewById(R.id.button);

        //Metodo de Click
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = edt.getText().toString();
                Toast.makeText(MainActivity.this, texto, Toast.LENGTH_LONG).show();
            }
        });

    }
}
