package com.example.justfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public  void Mainsignup(View view) {
        Toast.makeText(this, "Welcome to Justfod", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, loginpage.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
