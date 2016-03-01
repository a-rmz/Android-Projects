package com.androide.alex.itesolog_in;

import android.support.v7.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public Button loginButton;
    public Context context;
    public EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();

        user = (EditText) findViewById(R.id.usr);
        pass = (EditText) findViewById(R.id.pass);

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);


        loginButton = (Button) findViewById(R.id.login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usr = user.getText().toString();
                String pss = pass.getText().toString();

                if(usr.isEmpty() || pss.isEmpty()) {
                    Toast toast;
                    toast = Toast.makeText(context, getResources().getString(R.string.no_login), Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 20);
                    toast.show();
                } else {
                    builder.setMessage(getResources().getString(R.string.confirm)).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast toast;
                            toast = Toast.makeText(context, getResources().getString(R.string.sent), Toast.LENGTH_SHORT);
                            toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 20);
                            toast.show();
                        }
                    }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast toast;
                            toast = Toast.makeText(context, getResources().getString(R.string.cancelled), Toast.LENGTH_SHORT);
                            toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 20);
                            toast.show();
                        }
                    });
                    builder.create().show();
                }

                user.setText("");
                pass.setText("");

            }
        });
    }
}
