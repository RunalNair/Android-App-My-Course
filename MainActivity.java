package com.example.runal.mycourses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b551 = (Button) findViewById(R.id.b551);
        final Button b601 = (Button) findViewById(R.id.b601);
        final Button b602 = (Button) findViewById(R.id.b602);
        final Button bFp = (Button) findViewById(R.id.bFp);
        final Button bPd = (Button) findViewById(R.id.bPd);
        final Button bSd = (Button) findViewById(R.id.bSd);

        b551.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fpIntent = new Intent(MainActivity.this,FPGA.class);
                MainActivity.this.startActivity(fpIntent);
            }



        });
        b601.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deIntent = new Intent(MainActivity.this, ProductDesign.class);
                MainActivity.this.startActivity(deIntent);
            }

        });
        b602.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent soIntent = new Intent(MainActivity.this, software.class);
                MainActivity.this.startActivity(soIntent);
            }

        });

        bFp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oneacIntent = new Intent(MainActivity.this,FPGAViewActivity.class);
                MainActivity.this.startActivity(oneacIntent);
            }
        });

        bPd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent twoacIntent = new Intent(MainActivity.this,ProductViewActivity.class);
                MainActivity.this.startActivity(twoacIntent);
            }
        });

        bSd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent threeacIntent = new Intent(MainActivity.this,SoftwareViewActivity.class);
                MainActivity.this.startActivity(threeacIntent);
            }
        });
    }
}
