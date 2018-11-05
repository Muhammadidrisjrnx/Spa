package com.example.rplrus021.spa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ArrayList<data_item_spa> arrayList;
    public data_item_spa data_item;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycle_view_list);
        arrayList = new ArrayList<data_item_spa>();
        load_data();
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        adapter_list_item_spa adapter = new adapter_list_item_spa(MainActivity.this, arrayList);
        recyclerView.setAdapter(adapter);
    }

    private void load_data() {
        data_item = new data_item_spa();
        data_item.setId_item_product("aromaterapi_id");
        data_item.setName_item_product("AROMATERAPI");
        data_item.setImage_item_product("http://pelatihanspa.com/wp-content/uploads/simpleecommcart/digitalproduct/aromaterapi.jpg");
        data_item.setCost_item_product("2000");
        data_item.setDescription_item_product("DATA DESKRIPSI 1");
        arrayList.add(data_item);
        data_item = new data_item_spa();
        data_item.setId_item_product("lilin_pemanas_tungku_id");
        data_item.setName_item_product("LILIN PEMANAS TUNGKU");
        data_item.setImage_item_product("http://pelatihanspa.com/wp-content/uploads/simpleecommcart/digitalproduct/candle.jpg");
        data_item.setCost_item_product("3000");
        data_item.setDescription_item_product("DATA DESKRIPSI 2");
        arrayList.add(data_item);
    }
}
