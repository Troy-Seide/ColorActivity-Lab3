package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ListView listView=findViewById(R.id.listView);
        final View v = findViewById(R.id.backgroundactivity);
        final String[] Colors= {"Blue", "Cyan", "Gray", "Green", "Magenta", "Red", "aqua", "purple",
        "maroon", "yellow"};
        final ColorAdapter colorAdapter = new ColorAdapter(this, Colors);
       final Spinner spin= (Spinner)findViewById(R.id.spinner3);
        spin.setAdapter(colorAdapter);
        final ConstraintLayout backgroundcolor= (ConstraintLayout)findViewById(R.id.backgroundactivity);
        //AdapterView.OnItemSelectedListener Sl= new AdapterView.OnItemSelectedListener() {
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                //v.setBackgroundColor(Color.parseColor(((TextView)v).getText().toString()));
                backgroundcolor.setBackgroundColor(Color.parseColor((String) Colors[pos]));
                view.setBackgroundColor(Color.WHITE);
                }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        //ArrayAdapter adapter = new ArrayAdapter<>(ColorActivity.this, android.R.layout.simple_list_item_1, Colors);
        //ColorAdapter adapter= new ColorAdapter(ColorActivity.this, Colors);
        //listView.setAdapter(adapter);
    }
}
