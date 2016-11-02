package com.example.runal.mycourses;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FPGA extends AppCompatActivity {

    public static final String prefer = "PreferFile";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fpg);

        final Button bHome1 = (Button) findViewById(R.id.bHome1);
        final Button bSave1 = (Button) findViewById(R.id.bSave1);
        final EditText etName = (EditText)findViewById(R.id.etName);
        final EditText etFull = (EditText)findViewById(R.id.etFull);
        final EditText etSyllabus = (EditText)findViewById(R.id.etSyllabus);
        final EditText editText5 = (EditText)findViewById(R.id.editText5);
        final EditText editText6 = (EditText)findViewById(R.id.editText6);
        final EditText editText7 = (EditText)findViewById(R.id.editText7);
        final EditText editText8 = (EditText)findViewById(R.id.editText8);
        final EditText editText10 = (EditText)findViewById(R.id.editText10);
        final EditText editText11 = (EditText)findViewById(R.id.editText11);

       bHome1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent hoIntent = new Intent(FPGA.this,MainActivity.class);
               FPGA.this.startActivity(hoIntent);
           }
       });

        bSave1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences saver = getSharedPreferences(prefer,0);
                SharedPreferences.Editor editor = saver.edit();
                editor.putString("nam",etName.getText().toString());
                editor.putString("sub",etFull.getText().toString());
                editor.putString("br",etSyllabus.getText().toString());
                editor.putString("br1",editText5.getText().toString());
                editor.putString("br2",editText6.getText().toString());
                editor.putString("br3",editText7.getText().toString());
                editor.putString("rs",editText8.getText().toString());
                editor.putString("rs1",editText10.getText().toString());
                editor.putString("rs2",editText11.getText().toString());

                editor.commit();

            }
        });


    }
}
