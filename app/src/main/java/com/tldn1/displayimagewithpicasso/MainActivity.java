package com.tldn1.displayimagewithpicasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.imageView);
        String url = "https://www.androidcentral.com/sites/androidcentral.com/files/postimages/684/podcast_featured_3.jpg";
        Picasso.with(this).load(url)
                .into(imageView);
    }
}
