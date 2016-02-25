package com.androide.alex.itesolog_in;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button loginButton;
    public Context context = getApplicationContext();
    public EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.usr);
        pass = (EditText) findViewById(R.id.pass);

        loginButton = (Button) findViewById(R.id.login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usr = user.getText().toString();
                String pss = pass.getText().toString();
                String message = "";
                Toast toast;

                if(usr.isEmpty() || pss.isEmpty()) {
                    message = "El nombre de usuario o la contraseña están vacíos";
                } else {
                    
                }

                toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);

            }
        });
    }

}
