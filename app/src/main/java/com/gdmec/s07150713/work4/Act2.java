package com.gdmec.s07150713.work4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Act2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        Button bt=(Button)findViewById(R.id.button2);
        bt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(Act2.this,"这是自身类做监听二",Toast.LENGTH_SHORT).show();
    }
}
