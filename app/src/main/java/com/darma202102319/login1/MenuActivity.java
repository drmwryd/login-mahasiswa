package com.darma202102319.login1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity
{
    private Button _tampilMahasiswaButton, _tampilForexButton, _tampilCuacaButton, _tampilImplicitButton, _tampilHotelAppButton, _tampilTabLayoutButton, _tampilWebViewButton   ;
    private Intent _tampilMahasiswaIntent, _tampilForexIntent, _tampilCuacaIntent, _tampilImplicitIntent, _tampilHotelAppIntent, _tampilTabLayoutIntent, _tampilWebViewIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        initTampilMahasiswaButton();
        initTampilForexButton();
        initTampilCuacaButton();
        initTampilImplicitButton();
        initTampilHotelAppButton();
        initTampilTabLayoutButton();
        initTampilWebViewButton();
    }

    private void initTampilMahasiswaButton()
    {
        _tampilMahasiswaButton = (Button) findViewById(R.id.tampilMahasiswaButton);

        _tampilMahasiswaButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                _tampilMahasiswaIntent = new Intent(getApplicationContext(), TampilMahasiswaActivity.class);
                startActivity(_tampilMahasiswaIntent);
            }
        });
    }

    private void initTampilForexButton()
    {
        _tampilForexButton = (Button) findViewById(R.id.tampilForexButton);

        _tampilForexButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                _tampilForexIntent = new Intent(getApplicationContext(), ForexMainActivity.class);
                startActivity(_tampilForexIntent);
            }
        });

    }

    private void initTampilImplicitButton()
    {
        _tampilImplicitButton = findViewById(R.id.tampilImplicitButton);

        _tampilImplicitButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                _tampilImplicitIntent = new Intent(getApplicationContext(), ImplicitMainActivity.class);
                startActivity(_tampilImplicitIntent);
            }
        });
    }
    private void initTampilHotelAppButton()
    {
        _tampilHotelAppButton = findViewById(R.id.tampilHotelAppButton);

        _tampilHotelAppButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                _tampilHotelAppIntent = new Intent(getApplicationContext(), HotelAppMainActivity.class);
                startActivity(_tampilHotelAppIntent);
            }
        });
    }
    private void initTampilCuacaButton()
    {
        _tampilCuacaButton = findViewById(R.id.tampilCuacaButton);

        _tampilCuacaButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                _tampilCuacaIntent = new Intent(getApplicationContext(), CuacaMainActivity.class);
                startActivity(_tampilCuacaIntent);
            }
        });
    }
    private void initTampilTabLayoutButton()
    {
        _tampilTabLayoutButton = findViewById(R.id.tampilTabLayoutButton);

        _tampilTabLayoutButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                _tampilTabLayoutIntent = new Intent(getApplicationContext(), TabLayoutMainActivity.class);
                startActivity(_tampilTabLayoutIntent);
            }
        });
    }
    private void initTampilWebViewButton()
    {
        _tampilWebViewButton = findViewById(R.id.tampilWebViewButton);

        _tampilWebViewButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                _tampilWebViewIntent = new Intent(getApplicationContext(), WebViewLanjutanMainActivity.class);
                startActivity(_tampilWebViewIntent);
            }
        });
    }
}
