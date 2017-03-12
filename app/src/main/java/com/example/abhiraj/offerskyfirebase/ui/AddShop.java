package com.example.abhiraj.offerskyfirebase.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.abhiraj.offerskyfirebase.R;
import com.example.abhiraj.offerskyfirebase.model.Shop;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddShop extends AppCompatActivity implements View.OnClickListener {

    EditText state_key_et, city_key_et, mall_key_et, name_et, phone_et, email_et, location_et, shopURL_et, brandURL_et, shop_key_et;
    Button okBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_shop);

        state_key_et = (EditText) findViewById(R.id.state_key);
        mall_key_et = (EditText) findViewById(R.id.mall_key);
        city_key_et = (EditText) findViewById(R.id.city_key);
        shop_key_et = (EditText) findViewById(R.id.shop_key);
        name_et = (EditText) findViewById(R.id.shop_name);
        phone_et = (EditText) findViewById(R.id.shop_phone);
        email_et = (EditText) findViewById(R.id.shop_email);
        location_et = (EditText) findViewById(R.id.shop_location);
        shopURL_et = (EditText) findViewById(R.id.shop_image_url);
        brandURL_et = (EditText) findViewById(R.id.brand_image_url);

        okBtn = (Button) findViewById(R.id.okBtn);

        okBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String state_key = state_key_et.getText().toString();
        String city_key = city_key_et.getText().toString();
        String mall_key = mall_key_et.getText().toString();
        String final_key = state_key + "_" + city_key + "_" + mall_key;

        String shop_key = shop_key_et.getText().toString();
        String name = name_et.getText().toString();
        String phone = phone_et.getText().toString();
        String email =  email_et.getText().toString();
        String location = location_et.getText().toString();
        String shopUrl = shopURL_et.getText().toString();
        String brandUrl = brandURL_et.getText().toString();

        Shop shop = new Shop();
        shop.setName(name);
        shop.setLocation(location);
        shop.setPhone(phone);
        shop.setEmail(email);
        shop.setBrandImageURL(brandUrl);
        shop.setShopImageURL(shopUrl);

        DatabaseReference mRef = FirebaseDatabase.getInstance().getReference("malls");
        mRef.child(final_key).child("shops").child(shop_key).setValue(shop);
    }
}
