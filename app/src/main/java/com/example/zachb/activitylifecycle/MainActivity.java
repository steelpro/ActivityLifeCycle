package com.example.zachb.activitylifecycle;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/* Zachary Betters
   4/17/17
   CIS 282
   Activity Life Cycle App */

public class MainActivity extends AppCompatActivity {

    View layout_main;

    /*
       Order of methods:
       onCreate
       onConfigChanged
       onStart
       onPause
       onResume
       onClickNext
       onBackPressed
       onRestart
       onStop
       onDestroy
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout_main = findViewById(R.id.layout_main);

        Toast.makeText(this, "Activity has been created!", Toast.LENGTH_SHORT).show();

        Snackbar snackbar = Snackbar.make(layout_main, "Activity has been created!",
                Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar subSnackbar = Snackbar.make(layout_main, "Cool cool!", Snackbar.LENGTH_SHORT);
                        subSnackbar.show();
                    }
                });
        snackbar.show();

        Button closeButton = (Button) findViewById(R.id.btnExit);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        setContentView(R.layout.land_layout);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "Activity has started!", Toast.LENGTH_SHORT).show();

        Snackbar snackbar = Snackbar.make(layout_main, "Activity has started!",
                Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar subSnackbar = Snackbar.make(layout_main, "Cool cool!", Snackbar.LENGTH_SHORT);
                subSnackbar.show();
            }
        });
        snackbar.show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this, "Activity has been paused!", Toast.LENGTH_SHORT).show();

        Snackbar snackbar = Snackbar.make(layout_main, "Activity has been paused!",
                Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar subSnackbar = Snackbar.make(layout_main, "Cool cool!", Snackbar.LENGTH_SHORT);
                subSnackbar.show();
            }
        });
        snackbar.show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this, "Activity has resumed!", Toast.LENGTH_SHORT).show();

        Snackbar snackbar = Snackbar.make(layout_main, "App started again!",
                Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar subSnackbar = Snackbar.make(layout_main, "Cool cool!", Snackbar.LENGTH_SHORT);
                subSnackbar.show();
            }
        });
        snackbar.show();
    }

    public void onClickNext(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Toast.makeText(this, "Back button pressed!", Toast.LENGTH_SHORT).show();

        Snackbar snackbar = Snackbar.make(layout_main, "You pressed the back button!",
                Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar subSnackbar = Snackbar.make(layout_main, "Cool cool!", Snackbar.LENGTH_SHORT);
                subSnackbar.show();
            }
        });
        snackbar.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this, "Activity has been restarted!", Toast.LENGTH_SHORT).show();

        Snackbar snackbar = Snackbar.make(layout_main, "App has restarted!",
                Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar subSnackbar = Snackbar.make(layout_main, "Cool cool!", Snackbar.LENGTH_SHORT);
                subSnackbar.show();
            }
        });
        snackbar.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Activity has stopped!", Toast.LENGTH_SHORT).show();

        Snackbar snackbar = Snackbar.make(layout_main, "Activity has stopped!",
                Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar subSnackbar = Snackbar.make(layout_main, "Cool cool!", Snackbar.LENGTH_SHORT);
                subSnackbar.show();
            }
        });
        snackbar.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "Closing activity!", Toast.LENGTH_SHORT).show();

        Snackbar snackbar = Snackbar.make(layout_main, "Closing activity!",
                Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar subSnackbar = Snackbar.make(layout_main, "Cool cool!", Snackbar.LENGTH_SHORT);
                subSnackbar.show();
            }
        });
        snackbar.show();
    }
}