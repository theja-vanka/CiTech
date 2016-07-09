package com.citech.vanka.cambridge;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.citech.vanka.cambridge.Subclass.DeptCse;
import com.citech.vanka.cambridge.Subclass.FacBas;
import com.citech.vanka.cambridge.Subclass.FacCiv;
import com.citech.vanka.cambridge.Subclass.FacCse;
import com.citech.vanka.cambridge.Subclass.FacEce;
import com.citech.vanka.cambridge.Subclass.FacEee;
import com.citech.vanka.cambridge.Subclass.FacIse;
import com.citech.vanka.cambridge.Subclass.FacMba;
import com.citech.vanka.cambridge.Subclass.FacMca;
import com.citech.vanka.cambridge.Subclass.FacMec;

public class MainFac extends AppCompatActivity {
    private ImageButton fcse,feee,fece,fciv,fmec,fise,fmba,fmca,fbas,fhom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fac);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        fhom = (ImageButton) findViewById(R.id.homef);

        fcse = (ImageButton) findViewById(R.id.imageButton25);
        feee = (ImageButton) findViewById(R.id.imageButton27);
        fece = (ImageButton) findViewById(R.id.imageButton26);
        fciv = (ImageButton) findViewById(R.id.imageButton30);
        fmec = (ImageButton) findViewById(R.id.imageButton29);
        fise = (ImageButton) findViewById(R.id.imageButton28);
        fmba = (ImageButton) findViewById(R.id.imageButton24);
        fmca = (ImageButton) findViewById(R.id.imageButton23);
        fbas = (ImageButton) findViewById(R.id.imageButton22);

        fhom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                onBackPressed();

            }
        });
        fcse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainFac.this, FacCse.class);
                startActivity(intent);

            }
        });
        fece.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainFac.this, FacEce.class);
                startActivity(intent);

            }
        });
        feee.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainFac.this, FacEee.class);
                startActivity(intent);

            }
        });
        fciv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainFac.this, FacCiv.class);
                startActivity(intent);

            }
        });
        fmec.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainFac.this, FacMec.class);
                startActivity(intent);
            }
        });
        fise.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainFac.this, FacIse.class);
                startActivity(intent);
            }
        });
        fmba.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainFac.this, FacMba.class);
                startActivity(intent);

            }
        });
        fmca.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainFac.this, FacMca.class);
                startActivity(intent);
            }
        });
        fbas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainFac.this, FacBas.class);
                startActivity(intent);

            }
        });
    }
    @Override
    public void onBackPressed() {

        super.onBackPressed();
        //additional code
    }

}
