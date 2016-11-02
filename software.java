package com.example.runal.mycourses;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class software extends AppCompatActivity {

    public static final String preference = "PreferenceFile";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_software);

        final Button bHome3 = (Button) findViewById(R.id.bHome3);
        final Button bSave3 = (Button) findViewById(R.id.bSave3);
        final EditText editText15 = (EditText)findViewById(R.id.editText15);
        final EditText editText16 = (EditText)findViewById(R.id.editText16);
        final EditText editText17 = (EditText)findViewById(R.id.editText17);
        final EditText editText18 = (EditText)findViewById(R.id.editText18);
        final EditText editText19 = (EditText)findViewById(R.id.editText19);
        final EditText editText20 = (EditText)findViewById(R.id.editText20);
        final EditText editText21 = (EditText)findViewById(R.id.editText21);
        final EditText editText22 = (EditText)findViewById(R.id.editText22);
        final EditText editText23 = (EditText)findViewById(R.id.editText23);


        bHome3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hoooIntent = new Intent(software.this,MainActivity.class);
                software.this.startActivity(hoooIntent);
            }
        });

        bSave3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences savior = getSharedPreferences(preference,0);
                SharedPreferences.Editor editor = savior.edit();
                editor.putString("na",editText15.getText().toString());
                editor.putString("su",editText16.getText().toString());
                editor.putString("b",editText17.getText().toString());
                editor.putString("b1",editText18.getText().toString());
                editor.putString("b2",editText19.getText().toString());
                editor.putString("b3",editText20.getText().toString());
                editor.putString("r",editText21.getText().toString());
                editor.putString("r1",editText22.getText().toString());
                editor.putString("r2",editText23.getText().toString());

                editor.commit();
            }
        });
    }
}
