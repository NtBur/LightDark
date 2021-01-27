package com.nat.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button b1;
//private Button b2;
public static boolean  tema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if(tema){
            setTheme(R.style.AppLight);
        }else{
            setTheme(R.style.AppDark);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
       // b2 = findViewById(R.id.b2);

        View.OnClickListener ob = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        };
        b1.setOnClickListener(ob);
    }
}
