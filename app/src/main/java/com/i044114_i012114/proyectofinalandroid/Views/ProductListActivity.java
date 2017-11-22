package com.i044114_i012114.proyectofinalandroid.Views;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import android.view.View;
import android.widget.TextView;

import com.i044114_i012114.proyectofinalandroid.R;

public class ProductListActivity extends AppCompatActivity {

    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);


        floatingActionButton = (FloatingActionButton) findViewById(R.id.id_fb_cs);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginUserActivity.changeState(ProductListActivity.this,false);
                finish();
            }
        });

    }



}
