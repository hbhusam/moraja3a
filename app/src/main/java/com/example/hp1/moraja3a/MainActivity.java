package com.example.hp1.moraja3a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button bt1;
    TextView tv1;
    EditText et1, et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (Button)findViewById(R.id.bt1);
        tv1 = (TextView) findViewById(R.id.tv1);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
bt1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("Email",et1.getText().toString());
        i.putExtra("Password",et2.getText().toString());

        startActivity(i);


    }
}
