package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Truactivity extends AppCompatActivity {
    EditText edtA, edtB;
    TextView txtKq;
    Button btnHieu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truactivity);
        anhxa();
    }

    void anhxa() {
        edtA = (EditText) findViewById(R.id.edt_Soa);
        edtB = (EditText) findViewById(R.id.edt_Sob);
        btnHieu = (Button) findViewById(R.id.btn_Hieu);
        txtKq = (TextView) findViewById(R.id.tv_Kq);
    }
    public void Hieu(View view) {
        int a=0, b=0;
        double kq;
        if (edtA.getText().length()>0&&edtB.getText().length()>0) {
            a = Integer.parseInt(edtA.getText().toString());
            b = Integer.parseInt(edtB.getText().toString());
            kq = a - b;
            txtKq.setText(kq + "");
        }
    }
}
