package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button prout;
    private EditText firstname;
    private EditText lastname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prout = (Button) findViewById(R.id.prout);
        firstname = (EditText) findViewById(R.id.editText);
        lastname = (EditText) findViewById(R.id.editText2);

        prout.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),
                    "Bonjour" + " " + firstname.getText().toString() + " " + lastname.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
