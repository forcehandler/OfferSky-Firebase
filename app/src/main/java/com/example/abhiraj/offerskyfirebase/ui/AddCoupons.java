package com.example.abhiraj.offerskyfirebase.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.abhiraj.offerskyfirebase.R;
import com.example.abhiraj.offerskyfirebase.model.Coupon;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddCoupons extends AppCompatActivity implements View.OnClickListener {

    EditText state_key_et, city_key_et, mall_key_et, shop_key_et, coupon_key_et, brand_et, code_et, description_et, imageURL_et, category_et, price_et;
    Button okBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_coupons);

        state_key_et = (EditText) findViewById(R.id.state_key);
        city_key_et = (EditText) findViewById(R.id.city_key);
        mall_key_et = (EditText) findViewById(R.id.mall_key);
        shop_key_et = (EditText) findViewById(R.id.shop_key);
        coupon_key_et = (EditText) findViewById(R.id.coupon_key);
        brand_et = (EditText) findViewById(R.id.coupon_brand);
        code_et = (EditText) findViewById(R.id.coupon_code);
        description_et = (EditText) findViewById(R.id.coupon_description);
        price_et = (EditText) findViewById(R.id.coupon_price);
        category_et = (EditText) findViewById(R.id.coupon_category);
        imageURL_et = (EditText) findViewById(R.id.coupon_image_url);

        okBtn = (Button) findViewById(R.id.okBtn);

        okBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view == okBtn)
        {
            String state_key = state_key_et.getText().toString();
            String city_key = city_key_et.getText().toString();
            String mall_key = mall_key_et.getText().toString();
            String final_key = state_key + "_" + city_key + "_" + mall_key;

            String shop_key = shop_key_et.getText().toString();
            String coupon_key = coupon_key_et.getText().toString();
            String brand = brand_et.getText().toString();
            String description = description_et.getText().toString();
            String code = code_et.getText().toString();
            String price =  price_et.getText().toString();
            String imageURL = imageURL_et.getText().toString();
            String category = category_et.getText().toString();

            Coupon coupon = new Coupon();
            coupon.setBrand(brand);
            coupon.setcode(code);
            coupon.setDescription(description);
            coupon.setPhotoURL(imageURL);
            // Temporarily photourl is same as brand url
            coupon.setShopURL(imageURL);
            coupon.setPrice(price);
            coupon.setCategory(category);

            DatabaseReference mRef = FirebaseDatabase.getInstance().getReference("malls");
            mRef.child(final_key).child("shops").child(shop_key).child("coupons").child(coupon_key).setValue(coupon);
        }

    }
}
