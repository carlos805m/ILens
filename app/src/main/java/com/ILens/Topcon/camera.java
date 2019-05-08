package com.ILens.Topcon;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.List;

public class camera extends AppCompatActivity {

    private Button buttonUp;
    private boolean buttonUpPressed = true;
    private  Handler mHandler;
    private ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        image = (ImageView)findViewById(R.id.image);

    }


    public void up(View v){
        //Toast.makeText(this,"Camera: Up", Toast.LENGTH_SHORT).show();
        float y = image.getY()-5;
        image.setY(y);
    }

    public void down(View v) {
        float y = image.getY()+5;
        image.setY(y);
    }

    public void left(View v) {
        float x = image.getX()-5;
        image.setX(x);
    }

    public void right(View v) {
        float x = image.getX()+5;
        image.setX(x);
    }
}
