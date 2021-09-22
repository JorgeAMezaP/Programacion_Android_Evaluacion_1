package com.jmeza.evaluacionu1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;
    private CheckBox aceptarCondiciones;
    private Button btnConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.editTextName);
        aceptarCondiciones = findViewById(R.id.checkBoxAceptarTerminos);
        btnConfirmar = findViewById(R.id.buttonConfirmar);

    }

    public void  enableDisableConfirmButtom(View view){
        btnConfirmar.setEnabled(aceptarCondiciones.isChecked());
    }

    public void showMessage(View view){
        if(!nombre.getText().toString().equals(""))
            Toast.makeText(this, nombre.getText().toString() + ", Pedido confirmado!", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "El nombre es requerido", Toast.LENGTH_SHORT).show();

    }
}