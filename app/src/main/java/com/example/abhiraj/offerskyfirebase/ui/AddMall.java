package com.example.abhiraj.offerskyfirebase.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.abhiraj.offerskyfirebase.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddMall extends AppCompatActivity implements View.OnClickListener {

    private EditText state_key_et, city_key_et, mall_name_et, mall_key_et;
    private Button okBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_mall);

        state_key_et = (EditText) findViewById(R.id.state_key_et);
        city_key_et = (EditText) findViewById(R.id.city_key_et);
        mall_name_et = (EditText) findViewById(R.id.mall_name_et);
        mall_key_et = (EditText) findViewById(R.id.mall_key_et);
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
            String mall_name = mall_name_et.getText().toString();

            DatabaseReference mRef = FirebaseDatabase.getInstance().getReference("city_mall");
            mRef.child(city_key).child(state_key+"_"+city_key+"_"+mall_key).setValue(mall_name);
        }
    }
}
