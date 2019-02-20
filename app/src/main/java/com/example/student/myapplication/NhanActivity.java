package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NhanActivity extends AppCompatActivity {
    EditText edt_Soa, edt_Sob;
    TextView tv_kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhan);
        //Anh Xa :
        edt_Soa = findViewById(R.id.edt_Soa);
        edt_Sob = findViewById(R.id.edt_Sob);
        tv_kq = findViewById(R.id.tv_Kq);
    }

    public void Nhan(View view) {
        tv_kq.setText((Integer.parseInt(edt_Soa.getText().toString())*Integer.parseInt(edt_Sob.getText().toString()))+"");
    }
}
