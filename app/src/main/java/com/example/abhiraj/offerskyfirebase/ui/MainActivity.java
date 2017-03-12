package com.example.abhiraj.offerskyfirebase.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.abhiraj.offerskyfirebase.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button state, city, mall, shop, coupon, categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initializeViews();

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void initializeViews()
    {
        state = (Button) findViewById(R.id.add_state_btn);
        city = (Button) findViewById(R.id.add_city_btn);
        mall = (Button) findViewById(R.id.add_mall_btn);
        shop = (Button) findViewById(R.id.add_shop_btn);
        coupon = (Button) findViewById(R.id.add_coupon_btn);
        categories = (Button) findViewById(R.id.add_categories_btn);

        state.setOnClickListener(this);
        city.setOnClickListener(this);
        mall.setOnClickListener(this);
        shop.setOnClickListener(this);
        coupon.setOnClickListener(this);
        categories.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

        if(view == state)
        {
            Intent intent= new Intent(this, AddState.class);
            startActivity(intent);
        }

        if(view == city)
        {
            Intent intent= new Intent(this, AddCity.class);
            startActivity(intent);
        }

        if(view == mall)
        {
            Intent intent= new Intent(this, AddMall.class);
            startActivity(intent);
        }

        if(view == shop)
        {
            Intent intent= new Intent(this, AddShop.class);
            startActivity(intent);
        }

        if(view == coupon)
        {
            Intent intent= new Intent(this, AddCoupons.class);
            startActivity(intent);
        }

        if(view == categories)
        {
            Intent intent= new Intent(this, AddCategories.class);
            startActivity(intent);
        }
    }
}
