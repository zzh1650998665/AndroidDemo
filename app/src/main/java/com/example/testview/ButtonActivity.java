package com.example.testview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    //声明控件
    private Button mBtn3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mBtn3 = findViewById(R.id.ben_3);
        mBtn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonActivity.this,"按钮3被点击了",Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void showToast(View view){
        Toast.makeText(this,"你点我干嘛？",Toast.LENGTH_SHORT).show();
    }



}
