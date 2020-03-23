package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b,b2;
    int x;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.btn);
        b2=findViewById(R.id.btn2);
        t=findViewById(R.id.t);
    }

    public void co(View view) {
        x=(int) (Math.random()*100+0);
        t.setText("number="+x);
    }

    public void yo(View view) {      //cancle
        t.setText("number not faund");
    }
}
