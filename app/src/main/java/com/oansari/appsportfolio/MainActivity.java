package com.oansari.appsportfolio;

import android.app.Activity;
import android.app.Notification;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class MainActivity extends Activity {

    @InjectView(R.id.spotifyStreamerButton)
    Button mSpotifyStreamerButton;
    @InjectView(R.id.superDuoButton)
    Button mSuperDuoButton;
    @InjectView(R.id.buildItBiggerButton)
    Button mBuildItBiggerButton;
    @InjectView(R.id.xyzReaderButton)
    Button mXYZReaderButton;
    @InjectView(R.id.capstoneButton)
    Button mCapstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        clickEvents();
    }

    private void clickEvents() {
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button clickedButton = (Button) v;
                Toast.makeText(v.getContext(), String.format(getString(R.string.app_launcher_text), clickedButton.getText().toString()), Toast.LENGTH_LONG).show();
            }
        };
        mSpotifyStreamerButton.setOnClickListener(listener);
        mSuperDuoButton.setOnClickListener(listener);
        mXYZReaderButton.setOnClickListener(listener);
        mBuildItBiggerButton.setOnClickListener(listener);
        mCapstoneButton.setOnClickListener(listener);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
