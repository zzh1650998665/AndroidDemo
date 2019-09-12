package com.example.testview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView mIv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        mIv4 = findViewById(R.id.img_4);
        Glide.with(this).load("http://img4.imgtn.bdimg.com/it/u=2040603332,857850788&fm=26&gp=0.jpg").into(mIv4);

    }
}
