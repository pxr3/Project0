package io.pxr.project0.project0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Context;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Button Events
    public void spotifyTapped(View view) {
        displayToast("This button will launch my Spotify app!");
    }

    public void scoresTapped(View view) {
        displayToast("This button will launch my Scores app!");
    }

    public void libraryTapped(View view) {
        displayToast("This button will launch my Library app!");
    }

    public void builditTapped(View view) {
        displayToast("This button will launch my BuildIt app!");
    }

    public void xyzTapped(View view) {
        displayToast("This button will launch my XYZ Reader app!");
    }

    public void capstoneTapped(View view) {
        displayToast("This button will launch my Capstone app!");
    }

    // Toast Management
    private Toast mAppToast;


    private void displayToast(String toastString) {
        //Stop any previous toasts
        if(mAppToast !=null){
            mAppToast.cancel();
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        mAppToast = Toast.makeText(context, toastString, duration);
        mAppToast.show();
    }
}
