package com.citech.vanka.cambridge;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageButton abt,acap,achv,rad,fac,gal,lu,cu,dev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        abt = (ImageButton) findViewById(R.id.imageButton);
        acap = (ImageButton) findViewById(R.id.imageButton2);
        achv = (ImageButton) findViewById(R.id.imageButton3);
        rad = (ImageButton) findViewById(R.id.imageButton4);
        fac = (ImageButton) findViewById(R.id.imageButton5);
        gal = (ImageButton) findViewById(R.id.imageButton6);
        lu = (ImageButton) findViewById(R.id.imageButton7);
        cu = (ImageButton) findViewById(R.id.imageButton8);
        dev = (ImageButton) findViewById(R.id.imageButton9);
        abt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "About Us",
                        Toast.LENGTH_SHORT).show();

            }
        });
        acap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainDept.class);
                startActivity(intent);

            }
        });
        achv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Achievements",
                        Toast.LENGTH_SHORT).show();

            }
        });
        rad.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "R&D",
                        Toast.LENGTH_SHORT).show();

            }
        });
        fac.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "FAC",
                        Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(MainActivity.this, MainFac.class);
               // startActivity(intent);

            }
        });
        gal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(isNetworkAvailable()==false)
                {
                    Toast.makeText(getApplicationContext(), "Connect to Internet",
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Gallery",
                            Toast.LENGTH_SHORT).show();

                }

            }
        });
        lu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(isNetworkAvailable()==false)
                {
                    Toast.makeText(getApplicationContext(), "Connect to Internet",
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent browserIntent =
                            new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Basavanapura+Main+Road,+Krishnarajapuram,+Cambridge+Institute+Of+Technology,+Bengaluru,+Karnataka+560036,+India/@13.011149,77.7041259,17z/data=!4m2!3m1!1s0x3bae11abe40fb245:0xfa7afc82d4a141f4?hl=en"));
                    browserIntent.setPackage("com.google.android.apps.maps");

                    startActivity(browserIntent);


                }


            }
        });
        cu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Contact Us",
                        Toast.LENGTH_SHORT).show();

            }
        });
        dev.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Developers",
                        Toast.LENGTH_SHORT).show();

            }
        });
    }
    @Override
    public void onBackPressed() {

        super.onBackPressed();
        //additional code
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
