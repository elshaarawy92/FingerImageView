package com.example.fingerimage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private SwZoomDragImageView zoomImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zoomImageView = findViewById(R.id.image);
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),
                R.drawable.pig);
        zoomImageView.setImageBitmap(bitmap);
    }
}
