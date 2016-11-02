package com.example.runal.mycourses;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.runal.mycourses.software.preference;

public class SoftwareViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_software_view);

        final Button b331 = (Button) findViewById(R.id.b331);
        final Button b332 = (Button) findViewById(R.id.b332);
        final TextView tv18 = (TextView)findViewById(R.id.tv18);
        final TextView tv19 = (TextView)findViewById(R.id.tv19);
        final TextView tv20 = (TextView)findViewById(R.id.tv20);
        final TextView tv21 = (TextView)findViewById(R.id.tv21);
        final TextView tv22 = (TextView)findViewById(R.id.tv22);
        final TextView tv23 = (TextView)findViewById(R.id.tv23);
        final TextView tv24 = (TextView)findViewById(R.id.tv24);
        final TextView tv25 = (TextView)findViewById(R.id.tv25);
        final TextView tv26 = (TextView)findViewById(R.id.tv26);

        SharedPreferences savior = getSharedPreferences(preference,0);

        String cour = savior.getString("na","none found");
        TextView tvw17 = (TextView)findViewById(R.id.tv18);
        tvw17.setText(cour);

        String subje = savior.getString("su","none found");
        TextView tvw18 = (TextView)findViewById(R.id.tv19);
        tvw18.setText(subje);

        String boo = savior.getString("b","none found");
        TextView tvw19 = (TextView)findViewById(R.id.tv20);
        tvw19.setText(boo);

        String boo1 = savior.getString("b1","none found");
        TextView tvw20 = (TextView)findViewById(R.id.tv21);
        tvw20.setText(boo1);

        String boo2 = savior.getString("b2","none found");
        TextView tvw21 = (TextView)findViewById(R.id.tv22);
        tvw21.setText(boo2);

        String boo3 = savior.getString("b3","none found");
        TextView tvw22 = (TextView)findViewById(R.id.tv23);
        tvw22.setText(boo3);

        String resources3 = savior.getString("r","none found");
        TextView tvw23 = (TextView)findViewById(R.id.tv24);
        tvw23.setText(resources3);

        String resources4 = savior.getString("r1","none found");
        TextView tvw24 = (TextView)findViewById(R.id.tv25);
        tvw24.setText(resources4);

        String resources5 = savior.getString("r2","none found");
        TextView tvw25 = (TextView)findViewById(R.id.tv26);
        tvw25.setText(resources5);

        b331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sofaIntent = new Intent(SoftwareViewActivity.this,software.class);
                SoftwareViewActivity.this.startActivity(sofaIntent);
            }
        });

        b332.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainaIntent =new Intent(SoftwareViewActivity.this,MainActivity.class);
                SoftwareViewActivity.this.startActivity(mainaIntent);
            }
        });

    }
}
