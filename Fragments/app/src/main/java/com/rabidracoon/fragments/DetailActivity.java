package com.rabidracoon.fragments;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by alex on 2/29/16.
 */
public class DetailActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.detail_activity_layout);
        // getIntent() checks if an Intent opened this activity
        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            String s = extras.getString("value");
            TextView view = (TextView) findViewById(R.id.detailText);
            view.setText(s);
        }
    }
}
