package com.first.a9months_app;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class homePage extends AppCompatActivity {
    private Button personalA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

      personalA= (Button) findViewById(R.id.personalAr);



       /* personalA.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent= new Intent(homePage.this, personalArea.class);
                startActivity(intent);
            }
        });*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }
}
