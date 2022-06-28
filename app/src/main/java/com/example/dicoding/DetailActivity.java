package com.example.dicoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ImageView imgDetail = findViewById(R.id.img_detail);
        TextView txtDetailName = findViewById(R.id.txt_detail_name);
        TextView txtDetailDetails = findViewById(R.id.txt_detail_details);

        Food food =getIntent().getParcelableExtra(ITEM_EXTRA);

        if (food != null){
            Glide.with(this)
                    .load(food.getPhoto())
                    .into(imgDetail);
            txtDetailName.setText(food.getName());
            txtDetailDetails.setText(food.getDetail());
        }
    }
}