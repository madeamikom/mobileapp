package com.example.formapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText inputName = (EditText) findViewById(R.id.id_input_name);
        final EditText inputEmail = (EditText) findViewById(R.id.id_input_email);
        final EditText inputPhone = (EditText) findViewById(R.id.id_input_phone);
        final EditText inputPassword = (EditText) findViewById(R.id.id_input_pwd);

        Button btnSave = (Button) findViewById(R.id.in_button_save);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //kode untuk aksi dari klik button

                Log.d("--Nama--", inputName.getText().toString());
                Log.d("--Email--", inputEmail.getText().toString());
                Log.d("--Phone--", inputPhone.getText().toString());
                Log.d("--Password--", inputPassword.getText().toString());

            }
        }) ;
    }
}
