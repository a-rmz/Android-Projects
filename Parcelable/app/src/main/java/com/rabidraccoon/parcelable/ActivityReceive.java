package com.rabidraccoon.parcelable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityReceive extends AppCompatActivity {

    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);

        back = (Button) findViewById(R.id.back_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Mail received = getIntent().getParcelableExtra("sentMail");

        TextView text = (TextView) findViewById(R.id.to_received);
        text.setText(received.getTo());

        text = (TextView) findViewById(R.id.subject_received);
        text.setText(received.getSubject());

        text = (TextView) findViewById(R.id.message_received);
        text.setText(received.getMessage());
    }
}
