package com.example.runal.mycourses;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.runal.mycourses.ProductDesign.pref;

public class ProductViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_view);

        final Button b21 = (Button) findViewById(R.id.b21);
        final Button b22 = (Button) findViewById(R.id.b22);
        final TextView tv1 = (TextView)findViewById(R.id.tv1);
        final TextView tv2 = (TextView)findViewById(R.id.tv2);
        final TextView tv3 = (TextView)findViewById(R.id.tv3);
        final TextView tv4 = (TextView)findViewById(R.id.tv4);
        final TextView tv5 = (TextView)findViewById(R.id.tv5);
        final TextView tv6 = (TextView)findViewById(R.id.tv6);
        final TextView tv7 = (TextView)findViewById(R.id.tv7);
        final TextView tv8 = (TextView)findViewById(R.id.tv8);

        SharedPreferences saving = getSharedPreferences(pref,0);

        String course = saving.getString("name","none found");
        TextView tvw = (TextView)findViewById(R.id.tv1);
        tvw.setText(course);

        String subject = saving.getString("subj","none found");
        TextView tvw1 = (TextView)findViewById(R.id.tv2);
        tvw1.setText(subject);

        String bop = saving.getString("brk","none found");
        TextView tvw2 = (TextView)findViewById(R.id.tv3);
        tvw2.setText(bop);

        String bop1 = saving.getString("brk1","none found");
        TextView tvw3 = (TextView)findViewById(R.id.tv4);
        tvw3.setText(bop1);

        String bop2 = saving.getString("brk2","none found");
        TextView tvw4 = (TextView)findViewById(R.id.tv5);
        tvw4.setText(bop2);

        String bop3 = saving.getString("brk3","none found");
        TextView tvw5 = (TextView)findViewById(R.id.tv6);
        tvw5.setText(bop3);

        String resource = saving.getString("rsr","none found");
        TextView tvw6 = (TextView)findViewById(R.id.tv7);
        tvw6.setText(resource);

        String resource1 = saving.getString("rsr1","none found");
        TextView tvw7 = (TextView)findViewById(R.id.tv8);
        tvw7.setText(resource1);

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(ProductViewActivity.this,MainActivity.class);
                ProductViewActivity.this.startActivity(mIntent);
            }
        });

        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent epIntent = new Intent(ProductViewActivity.this,ProductDesign.class);
                ProductViewActivity.this.startActivity(epIntent);
            }
        });
        };
    }

