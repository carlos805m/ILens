package com.ILens.Topcon;

import android.content.Intent;
import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
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
        //Intent myIntent = new Intent(mainMenu.this, viewer_3d.class);
        //mainMenu.this.startActivity(myIntent);
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.setToolbarColor(0x4B4B4B);

        CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.launchUrl(mainMenu.this, Uri.parse("https://get.webgl.org/"));
    }
    public void convert3D(View v){
        Intent myIntent = new Intent(mainMenu.this, convert.class);
        mainMenu.this.startActivity(myIntent);
    }
    public void manageFiles(View v){
        Intent myIntent = new Intent(mainMenu.this, fileManager.class);
        mainMenu.this.startActivity(myIntent);
    }
    public void camera(View v){
        Intent myIntent = new Intent(mainMenu.this, camera.class);
        mainMenu.this.startActivity(myIntent);
    }
}
