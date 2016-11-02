package com.example.runal.mycourses;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.runal.mycourses.FPGA.prefer;

public class FPGAViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fpgaview);

        final Button b11 = (Button) findViewById(R.id.b11);
        final Button b12 = (Button) findViewById(R.id.b12);
        final TextView tv9 = (TextView)findViewById(R.id.tv9);
        final TextView tv10 = (TextView)findViewById(R.id.tv10);
        final TextView tv11 = (TextView)findViewById(R.id.tv11);
        final TextView tv12 = (TextView)findViewById(R.id.tv12);
        final TextView tv13 = (TextView)findViewById(R.id.tv13);
        final TextView tv14 = (TextView)findViewById(R.id.tv14);
        final TextView tv15 = (TextView)findViewById(R.id.tv15);
        final TextView tv16 = (TextView)findViewById(R.id.tv16);
        final TextView tv17 = (TextView)findViewById(R.id.tv17);

        SharedPreferences saver = getSharedPreferences(prefer,0);

        String cours = saver.getString("nam","none found");
        TextView tvw8 = (TextView)findViewById(R.id.tv9);
        tvw8.setText(cours);

        String subjec = saver.getString("sub","none found");
        TextView tvw9 = (TextView)findViewById(R.id.tv10);
        tvw9.setText(subjec);

        String bo = saver.getString("br","none found");
        TextView tvw10 = (TextView)findViewById(R.id.tv11);
        tvw10.setText(bo);

        String bo1 = saver.getString("br1","none found");
        TextView tvw11 = (TextView)findViewById(R.id.tv12);
        tvw11.setText(bo1);

        String bo2 = saver.getString("br2","none found");
        TextView tvw12 = (TextView)findViewById(R.id.tv13);
        tvw12.setText(bo2);

        String bo3 = saver.getString("br3","none found");
        TextView tvw13 = (TextView)findViewById(R.id.tv14);
        tvw13.setText(bo3);

        String resources = saver.getString("rs","none found");
        TextView tvw14 = (TextView)findViewById(R.id.tv15);
        tvw14.setText(resources);

        String resources1 = saver.getString("rs1","none found");
        TextView tvw15 = (TextView)findViewById(R.id.tv16);
        tvw15.setText(resources1);

        String resources2 = saver.getString("rs2","none found");
        TextView tvw16 = (TextView)findViewById(R.id.tv17);
        tvw16.setText(resources2);

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fpacIntent = new Intent(FPGAViewActivity.this,FPGA.class);
                FPGAViewActivity.this.startActivity(fpacIntent);
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent maIntent = new Intent(FPGAViewActivity.this,MainActivity.class);
                FPGAViewActivity.this.startActivity(maIntent);
            }
        });
    }
}
