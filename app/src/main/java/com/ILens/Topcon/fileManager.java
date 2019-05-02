package com.ILens.Topcon;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.File;
import java.io.FilenameFilter;

public class fileManager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_manager);
        loadFileList();
    }

    private String[] mFileList;
    private String mChosenFile;
    private static final int DIALOG_LOAD_FILE = 1000;
    private void loadFileList() {


        //String xx = Environment.getExternalStorageDirectory() + "/";
        File mPath = new File(Environment.getExternalStorageDirectory() + "/DCIM/" );//+
        //getApplicationContext().getString(R.string.app_name));

        try {
            mPath.mkdirs();
        } catch (SecurityException e) {
            //Log.e(TAG, "unable to write on the sd card " + e.toString());
        }
        if (mPath.exists()) {
            FilenameFilter filter = new FilenameFilter() {
                @Override
                public boolean accept(File dir, String filename) {
                    //add your filter if needed
                    File sel = new File(dir, filename);
                    return true;
                }
            };
            mFileList = mPath.list(filter);
        } else {
            mFileList= new String[0];
        }
        Log.d("LISTTTT", "loadFileList: " + mFileList[0] + mFileList[1]);
    }
}
