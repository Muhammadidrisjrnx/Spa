package com.example.rplrus021.spa;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class details extends AppCompatActivity {
    private ImageView imageView_details_item;
    private TextView textView_name_item, textView_details_item, textView_cost_item;
    private String id_details_item, name_details_item, image_details_item, description_details_item, cost_details_item;
    private Button button_details_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        imageView_details_item = (ImageView) findViewById(R.id.imageview_item);
        textView_name_item = (TextView) findViewById(R.id.textview_name_item);
        textView_details_item = (TextView) findViewById(R.id.textview_description_item);
        textView_cost_item = (TextView) findViewById(R.id.textview_cost_item);
        button_details_item = (Button) findViewById(R.id.button_booking_item);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            id_details_item = bundle.getString("id_product");
            image_details_item = bundle.getString("image_product");
            name_details_item = bundle.getString("name_product");
            description_details_item = bundle.getString("description_product");
            cost_details_item = bundle.getString("cost_product");
            Glide.with(details.this)
                    .load(image_details_item)
                    .into(imageView_details_item);
            textView_name_item.setText(name_details_item);
            textView_details_item.setText("Description \n\n"+description_details_item);
            textView_cost_item.setText("Cost \n\n"+cost_details_item);
        }
        button_details_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Pindah ke Booking class
                Intent intent = new Intent(details.this, booking.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }
}
