package com.example.nugraha10.kebudayaannusantara;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class Splashscreen extends Activity implements Loading.LoadingTaskFinishedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressbar_default);
        new Loading(progressBar, this).execute("");

    }

    @Override
    public void onTaskFinished() {
        completeSplash();
    }

    private void completeSplash() {
        startApp();
        finish();
    }

    private void startApp() {
        Intent intent = new Intent(Splashscreen.this, Home.class);
        startActivity(intent);
    }
}
