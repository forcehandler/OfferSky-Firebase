package com.example.abhiraj.offerskyfirebase.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.abhiraj.offerskyfirebase.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddState extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = AddState.class.getSimpleName();

    private EditText stateNameEt, stateKeyEt;
    private Button okBtn;

    DatabaseReference mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_state);

        stateNameEt = (EditText) findViewById(R.id.state_name_et);
        stateKeyEt = (EditText) findViewById(R.id.state_key_et);
        okBtn = (Button) findViewById(R.id.okBtn);

        okBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == okBtn)
        {
            String name = stateNameEt.getText().toString();
            String key = stateKeyEt.getText().toString();

            Log.d(TAG, "Adding state");
            mRef = FirebaseDatabase.getInstance().getReference("State");
            mRef.child(key).setValue(name);
        }
    }
}
