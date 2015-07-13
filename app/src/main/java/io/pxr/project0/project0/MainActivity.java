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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
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
    private void displayToast(String toastString) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, toastString, duration);
        toast.show();
    }
}
