package com.citech.vanka.cambridge;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.citech.vanka.cambridge.Subclass.DeptCiv;
import com.citech.vanka.cambridge.Subclass.DeptCse;
import com.citech.vanka.cambridge.Subclass.DeptEce;
import com.citech.vanka.cambridge.Subclass.DeptEee;
import com.citech.vanka.cambridge.Subclass.DeptIse;
import com.citech.vanka.cambridge.Subclass.DeptMec;

public class MainDept extends AppCompatActivity {
    private ImageButton dcse,dece,deee,dise,dmec,dciv,dpcs,dpcn,dpsp,dpmc,dpmd,dpmb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dept);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        dcse = (ImageButton) findViewById(R.id.imageButton10);
        dece = (ImageButton) findViewById(R.id.imageButton12);
        deee = (ImageButton) findViewById(R.id.imageButton11);
        dise = (ImageButton) findViewById(R.id.imageButton17);
        dmec = (ImageButton) findViewById(R.id.imageButton16);
        dciv = (ImageButton) findViewById(R.id.imageButton19);
        dpcs = (ImageButton) findViewById(R.id.imageButton20);
        dpcn = (ImageButton) findViewById(R.id.imageButton18);
        dpsp = (ImageButton) findViewById(R.id.imageButton13);
        dpmc = (ImageButton) findViewById(R.id.imageButton21);
        dpmd = (ImageButton) findViewById(R.id.imageButton15);
        dpmb = (ImageButton) findViewById(R.id.imageButton14);

        dcse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainDept.this, DeptCse.class);
                startActivity(intent);

            }
        });
        deee.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainDept.this, DeptEee.class);
                startActivity(intent);
            }
        });
        dece.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainDept.this, DeptEce.class);
                startActivity(intent);

            }
        });
        dise.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainDept.this, DeptIse.class);
                startActivity(intent);

            }
        });
        dmec.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainDept.this, DeptMec.class);
                startActivity(intent);

            }
        });
        dciv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainDept.this, DeptCiv.class);
                startActivity(intent);

            }
        });
        dpcs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "pCSE",
                        Toast.LENGTH_SHORT).show();

            }
        });
        dpcn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "pcn",
                        Toast.LENGTH_SHORT).show();

            }
        });
        dpmc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "mca",
                        Toast.LENGTH_SHORT).show();

            }
        });
        dpsp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "sigpro",
                        Toast.LENGTH_SHORT).show();

            }
        });
        dpmd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "machine d",
                        Toast.LENGTH_SHORT).show();

            }
        });
        dpmb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "mba",
                        Toast.LENGTH_SHORT).show();

            }
        });

    }
    @Override
    public void onBackPressed() {

        super.onBackPressed();
        //additional code
    }

}
