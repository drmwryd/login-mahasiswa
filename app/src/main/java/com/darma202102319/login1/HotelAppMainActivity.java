package com.darma202102319.login1;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class HotelAppMainActivity extends AppCompatActivity
{
    private ImageView _imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotelapp_main);

        _imageView4 = findViewById(R.id.imageViewHotel);

        String imageUrl = "https://ik.imagekit.io/ev2sgtdljw/b43463f4.webp?updatedAt=1685989708752.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView4);
    }
}
