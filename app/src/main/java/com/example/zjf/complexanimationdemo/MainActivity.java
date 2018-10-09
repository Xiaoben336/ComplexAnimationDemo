package com.example.zjf.complexanimationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnCustomInterpolator,btnCustomTypeEvaluator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCustomInterpolator = (Button)findViewById(R.id.btnCustomInterpolator);
        btnCustomTypeEvaluator = (Button)findViewById(R.id.btnCustomTypeEvaluator);
        btnCustomInterpolator.setOnClickListener(this);
        btnCustomTypeEvaluator.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.btnCustomInterpolator:
                intent.setClass(MainActivity.this,CustomInterpolatorAvtivity.class);
                startActivity(intent);
                break;
            case R.id.btnCustomTypeEvaluator:
                intent.setClass(MainActivity.this,CustomTypeEvaluatorActivity.class);
                startActivity(intent);
                break;
                default:
                    break;
        }
    }
}
