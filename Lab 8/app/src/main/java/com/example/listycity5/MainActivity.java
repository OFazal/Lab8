package com.example.listycity5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView cityList;
    ArrayList<City> cityDataList;
    CityArrayAdapter cityArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cityList = findViewById(R.id.city_list);
        cityDataList = new ArrayList<>();

        addCitiesInit();

        cityArrayAdapter = new CityArrayAdapter(this, cityDataList);
        cityList.setAdapter(cityArrayAdapter);
    }

    /**
     * Adds the initial city objects to the ArrayList
     */
    private void addCitiesInit() {
        String []cities ={"Edmonton", "Vancouver", "Toronto", "Hamilton", "Denver", "Los Angeles"};
        String []provinces = {"AB", "BC", "ON", "ON", "CO", "CA"};
        for(int i=0;i<cities.length;i++){
            cityDataList.add((new City(cities[i], provinces[i])));
        }
    }
}