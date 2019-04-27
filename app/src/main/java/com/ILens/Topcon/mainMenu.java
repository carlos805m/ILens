package com.ILens.Topcon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }
    public void viewer3D(View v){
        Intent myIntent = new Intent(mainMenu.this, viewer_3d.class);
        mainMenu.this.startActivity(myIntent);
    }
    public void convert3D(View v){
        Intent myIntent = new Intent(mainMenu.this, convert.class);
        mainMenu.this.startActivity(myIntent);
    }
    public void manageFiles(View v){
        Intent myIntent = new Intent(mainMenu.this, viewer_3d.class);
        mainMenu.this.startActivity(myIntent);
    }
    public void camera(View v){
        Intent myIntent = new Intent(mainMenu.this, viewer_3d.class);
        mainMenu.this.startActivity(myIntent);
    }
}
