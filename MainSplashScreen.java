package com.example.easydeveloper.librarymanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainSplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_splash_screen);

// METHOD 1

        /****** Create Thread that will sleep for 5 seconds *************/
        Thread background = new Thread() {
            public void run() {

                try {
                    // Thread will sleep for 5 seconds
                    sleep(1*1000);

                    // After 5 seconds redirect to another intent
                    Intent i=new Intent(getBaseContext(),LoginManagement.class);
                    startActivity(i);

                    //Remove activity
                    finish();

                } catch (Exception e) {

                }
            }
        };
        // start thread
        background.start();
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();

    }
}
