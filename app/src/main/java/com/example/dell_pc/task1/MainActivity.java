package com.example.dell_pc.task1;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "UOL" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"Create: method is changed" );
    }
    @Override
    protected void onStart() {

        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.d(TAG, "onResume");
    }
    @Override
    protected void onPause() {

        super.onPause();
        Log.d(TAG, "onPause");
    }
    @Override
    protected void onStop() {

        super.onStop();
        Log.d(TAG, "onStop");
    }
}
