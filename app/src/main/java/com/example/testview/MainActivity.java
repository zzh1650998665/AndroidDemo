package com.example.testview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.testview.gridview.GridViewActivity;
import com.example.testview.listview.ListViewActivity;
import com.example.testview.recyclerview.RecyclerViewActivity;

public class MainActivity extends AppCompatActivity {

    //声明控件
    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRedioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnListView;
    private Button mBtnGridView;
    private Button mBtnRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnTextView = findViewById(R.id.ben_textView);
        mBtnButton = findViewById(R.id.ben_button);
        mBtnEditText = findViewById(R.id.ben_edittext);
        mBtnRedioButton = findViewById(R.id.ben_redioBtn);
        mBtnCheckBox = findViewById(R.id.ben_checkBox);
        mBtnImageView = findViewById(R.id.imageViewBtn);
        mBtnListView = findViewById(R.id.listView);
        mBtnGridView = findViewById(R.id.gridView);
        mBtnRecyclerView = findViewById(R.id.recyclerView);
        setListeners();
    }


    private void setListeners(){
        OnClick onClick = new OnClick();
        mBtnTextView.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnRedioButton.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);
        mBtnListView.setOnClickListener(onClick);
        mBtnGridView.setOnClickListener(onClick);
        mBtnRecyclerView.setOnClickListener(onClick);
    }


    private class OnClick implements View.OnClickListener{

        Intent intent = null;

        @Override
        public void onClick(View view) {

            //跳转相应演示界面
            switch (view.getId()){
                case R.id.ben_textView:
                    intent = new Intent(MainActivity.this,TextView.class);
                    break;
                case R.id.ben_button:
                    intent = new Intent(MainActivity.this,ButtonActivity.class);
                    break;
                case R.id.ben_edittext:
                    intent = new Intent(MainActivity.this,EditTextActivity.class);
                    break;
                case R.id.ben_redioBtn:
                    intent = new Intent(MainActivity.this,RedioButtonActivity.class);
                    break;
                case R.id.ben_checkBox:
                    intent = new Intent(MainActivity.this,CheckBoxActivity.class);
                    break;
                case R.id.imageViewBtn:
                    intent = new Intent(MainActivity.this,ImageViewActivity.class);
                    break;
                case R.id.listView:
                    intent = new Intent(MainActivity.this, ListViewActivity.class);
                    break;
                case R.id.gridView:
                    intent = new Intent(MainActivity.this, GridViewActivity.class);
                    break;
                case R.id.recyclerView:
                    intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }


}
