package com.example.runal.mycourses;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProductDesign extends AppCompatActivity {

    public static final String pref = "PrefFile";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_design);

        final Button bHome2 = (Button) findViewById(R.id.bHome2);
        final Button bSave2 = (Button) findViewById(R.id.bSave2);
        final EditText editText = (EditText)findViewById(R.id.editText);
        final EditText editText2 = (EditText)findViewById(R.id.editText2);
        final EditText editText3 = (EditText)findViewById(R.id.editText3);
        final EditText editText4 = (EditText)findViewById(R.id.editText4);
        final EditText editText9 = (EditText)findViewById(R.id.editText9);
        final EditText editText12 = (EditText)findViewById(R.id.editText12);
        final EditText editText13 = (EditText)findViewById(R.id.editText13);
        final EditText editText14 = (EditText)findViewById(R.id.editText14);

        bHome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hooIntent = new Intent(ProductDesign.this,MainActivity.class);
                ProductDesign.this.startActivity(hooIntent);
            }
        });

        bSave2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences saving = getSharedPreferences(pref, 0);
                SharedPreferences.Editor editor = saving.edit();
                editor.putString("name",editText.getText().toString());
                editor.putString("subj",editText2.getText().toString());
                editor.putString("brk",editText3.getText().toString());
                editor.putString("brk1",editText4.getText().toString());
                editor.putString("brk2",editText9.getText().toString());
                editor.putString("brk3",editText12.getText().toString());
                editor.putString("rsr",editText13.getText().toString());
                editor.putString("rsr1",editText14.getText().toString());

                editor.commit();
            }
        });




        };
    }

