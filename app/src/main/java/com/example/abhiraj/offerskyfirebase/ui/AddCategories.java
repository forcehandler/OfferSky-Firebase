package com.example.abhiraj.offerskyfirebase.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.abhiraj.offerskyfirebase.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Arrays;
import java.util.List;

public class AddCategories extends AppCompatActivity implements View.OnClickListener{

    EditText state_key_et, city_key_et, mall_key_et, shop_key_et, categories_et;
    Button okBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_categories);

        state_key_et = (EditText) findViewById(R.id.state_key);
        city_key_et = (EditText) findViewById(R.id.city_key);
        mall_key_et = (EditText) findViewById(R.id.mall_key);
        categories_et = (EditText) findViewById(R.id.categories);
        shop_key_et = (EditText) findViewById(R.id.shop_key);

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
            String categories = categories_et.getText().toString();
            List<String> categoriesList = Arrays.asList(categories.split(","));

            DatabaseReference mRef = FirebaseDatabase.getInstance().getReference("malls");
            mRef.child(final_key).child("shops").child(shop_key).child("categories").setValue(categoriesList);
        }
    }
}
