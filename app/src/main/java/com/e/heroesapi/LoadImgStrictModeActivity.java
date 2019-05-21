package com.e.heroesapi;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class LoadImgStrictModeActivity extends AppCompatActivity {

    private ImageView imgPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_img_strict_mode);
        imgPhoto=findViewById(R.id.imgPhoto);

        loadFromURL();

    }

    private void StrictMode(){
        android.os.StrictMode.ThreadPolicy policy=
                new android.os.StrictMode.ThreadPolicy.Builder().permitAll().build();
        android.os.StrictMode.setThreadPolicy(policy);
    }


    private void loadFromURL(){
        StrictMode();
        try{
            String imgURL="https://www.sideshow.com/collectibles/marvel-thanos-hot-toys-903429#";
            URL url=new URL(imgURL);
            imgPhoto.setImageBitmap(BitmapFactory.decodeStream((InputStream)url.getContent()));
        }

        catch (IOException e){
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }



}
