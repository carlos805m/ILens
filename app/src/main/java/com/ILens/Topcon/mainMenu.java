package com.ILens.Topcon;

import android.content.Intent;
import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class mainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_menu_activity);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this,"Back Button Disabled",Toast.LENGTH_SHORT).show();
    }

    public void viewer3D(View v){
        //Intent myIntent = new Intent(mainMenu.this, viewer_3d.class);
        //mainMenu.this.startActivity(myIntent);
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.setToolbarColor(0x4B4B4B);
        CustomTabsIntent customTabsIntent = builder.build();
        if(Global.base64URN != "" && Global.token != ""){
            String viewUrl = "https://models.autodesk.io/view.html?";
            viewUrl = viewUrl + "token=" + Global.token;
            viewUrl = viewUrl + "&urn=" + Global.base64URN;
            customTabsIntent.launchUrl(mainMenu.this, Uri.parse(viewUrl));

        }else {
            customTabsIntent.launchUrl(mainMenu.this, Uri.parse("https://get.webgl.org/"));
        }
    }
    public void convert3D(View v){
        Intent myIntent = new Intent(mainMenu.this, convert.class);
        mainMenu.this.startActivity(myIntent);
    }
    public void manageFiles(View v){
        //Intent myIntent = new Intent(mainMenu.this, fileManager.class);
        //mainMenu.this.startActivity(myIntent);
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.cxinventor.file.explorer");
        if (launchIntent != null) {
            Toast.makeText(this,"Navigate to-> Main Storage / DCIM for files",Toast.LENGTH_LONG).show();
            startActivity(launchIntent);//null pointer check in case package name was not found
        }
    }
    public void camera(View v){
        Intent myIntent = new Intent(mainMenu.this, camera.class);
        mainMenu.this.startActivity(myIntent);
    }
}
