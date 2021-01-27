package com.nat.homework1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class MenuActivity extends AppCompatActivity {
    private RadioButton light;
    private RadioButton dark;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_black);

        light =findViewById(R.id.rb1);
        dark =findViewById(R.id.rb2);

        View.OnClickListener r1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.tema =true;
                openMain();
                finish();

            }
        };
        light.setOnClickListener(r1);
        View.OnClickListener r2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.tema =false;
                openMain();
                finish();

            }
        };
        dark.setOnClickListener(r2);

    }
    private void openMain(){
        Intent intent = new Intent(MenuActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
