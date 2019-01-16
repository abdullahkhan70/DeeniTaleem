package com.example.abdullahkhan.deenitaleem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import jp.wasabeef.glide.transformations.BlurTransformation;

public class loginOrSignupScreen extends AppCompatActivity {
    private ImageView background_image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_or_signup_screen);

        background_image = findViewById(R.id.background_image);

//        Glide.with(this).load(R.drawable.masjid_background_as_login_or_signup_screen)
//                .apply(RequestOptions.bitmapTransform(new BlurTransformation(15,3)))
//                .into(background_image);



    }
}
