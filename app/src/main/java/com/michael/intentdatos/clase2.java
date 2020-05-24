package com.michael.intentdatos;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class clase2 extends AppCompatActivity {
    TextView mensaje;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clase2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mensaje = (TextView) findViewById(R.id.txtrecibir);
        btn2 = (Button) findViewById(R.id.btncerrar);

        Intent intent = getIntent();
        String texto = intent.getStringExtra("clave");
        mensaje.setText("Bienvenido al sistema "+texto);



        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
