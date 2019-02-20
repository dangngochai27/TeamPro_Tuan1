package com.example.student.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
<<<<<<< HEAD
    public void Tru2So(View view) {
        Intent intent = new Intent(MainActivity.this, Truactivity.class);
        startActivity(intent);
    }
=======


    public void Tong(View view) {
        Intent intent = new Intent(MainActivity.this, tong2so.class);
        startActivity(intent);
    }


    public void Nhan2so(View view) {
        Intent intent = new Intent(MainActivity.this, NhanActivity.class);
        startActivity(intent);
    }

>>>>>>> c809ef9774eb82c427c09ee7a924e1ccfd9fb594
}
