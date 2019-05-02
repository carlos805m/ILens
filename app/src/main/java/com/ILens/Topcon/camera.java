package com.ILens.Topcon;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class camera extends AppCompatActivity {

    private Button buttonUp;
    private boolean buttonUpPressed = true;
    private  Handler mHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        initButtonUp();
    }


    public void initButtonUp(){
        buttonUp = (Button)findViewById(R.id.buttonUp);
        buttonUp.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        if (mHandler != null) return true;
                        mHandler = new Handler();
                        mHandler.postDelayed(mAction, 200);
                        break;
                    case MotionEvent.ACTION_UP:
                        if (mHandler == null) return true;
                        mHandler.removeCallbacks(mAction);
                        mHandler = null;
                        break;
                }
                return false;
            }
            Runnable mAction = new Runnable() {
                @Override public void run() {
                    Log.d("BUTTOND", "run: ");
                    mHandler.postDelayed(this, 200);
                }
            };
        });

    }



    public void cameraDown(View v) {
        while(buttonUpPressed) {
            Log.d("CAMERA", "cameraDown: ");
        }
    }

    public void cameraLeft(View v) {
        Log.d("CAMERA", "cameraLeft: ");
    }

    public void cameraRight(View v) {
        Log.d("CAMERA", "cameraRight: ");
    }
}
