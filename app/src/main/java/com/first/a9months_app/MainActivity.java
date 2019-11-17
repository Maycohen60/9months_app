package com.first.a9months_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button loginButton;
    private Button registrationButton;
    private EditText phoneNum;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneNum = (EditText) findViewById(R.id.ID);
        pass = (EditText) findViewById(R.id.password);

        loginButton= (Button) findViewById(R.id.logButton);
        registrationButton =(Button) findViewById(R.id.registration);


        // take care to login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String entered_phone;
                String enterd_pass;

                entered_phone=phoneNum.getText().toString();
                enterd_pass=pass.getText().toString();



               /* phoneNum.setVisibility(View.VISIBLE);
                phoneNum.setText(entered_phone);
                pass.setVisibility(View.VISIBLE);
                pass.setText(enterd_pass); */

            }
        });


    }
}
