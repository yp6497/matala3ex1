package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b,b2;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.btn);
        b=findViewById(R.id.btn2);
        t=findViewById(R.id.t);
    }
    int x;
    public void co(View view) { //click for number
        x=(int) (Math.random()*100+0);
        t.setText("number="+x);

    }

    public void yo(View view) {      //cancle
        t.setText("number not faund");
    }
}
