package com.example.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.main_toolbar);

        setSupportActionBar(toolbar);
    }

    public void startAboutActivity(View view) {
        Intent intent = new Intent(MainActivity.this, AboutALC.class);
        startActivity(intent);
    }

    public void startMyProfileActivity(View view) {
        Intent intent = new Intent(MainActivity.this, MyProfile.class);
        startActivity(intent);
    }

}
