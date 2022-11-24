package com.dulali.custometoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button showToast;
    Toast toast;
    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showToast = findViewById(R.id.showToast);


        showToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                toast = new Toast(getApplicationContext());
                view = getLayoutInflater().inflate(R.layout.custom_toast_layout ,(ViewGroup) findViewById(R.id.viewContainer));
                toast.setView(view);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.TOP | Gravity.CENTER , 0,0);
                toast.show();
            }
        });



    }
}