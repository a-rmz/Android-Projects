package com.rabidraccoon.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityMain extends AppCompatActivity {

    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send = (Button) findViewById(R.id.send_btn);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.to);
                String to = editText.getText().toString();

                editText = (EditText) findViewById(R.id.subject);
                String subject = editText.getText().toString();

                editText = (EditText) findViewById(R.id.message);
                String message = editText.getText().toString();

                Mail mail = new Mail(to, subject, message);

                Intent intent = new Intent(ActivityMain.this, ActivityReceive.class);
                intent.putExtra("sentMail", mail);

                startActivity(intent);

            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        // Wipe the ET.
        EditText editText = (EditText) findViewById(R.id.to);
        editText.setText("");

        editText = (EditText) findViewById(R.id.subject);
        editText.setText("");

        editText = (EditText) findViewById(R.id.message);
        editText.setText("");
    }
}
