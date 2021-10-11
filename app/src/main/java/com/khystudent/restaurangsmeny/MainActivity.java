package com.khystudent.restaurangsmeny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView starters;
    TextView mainCourses;
    TextView desserts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        starters = findViewById(R.id.starters_title);
        mainCourses = findViewById(R.id.main_course_title);
        desserts = findViewById(R.id.dessert_title);

        starters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToStarters = new Intent(MainActivity.this, Starters.class);
                startActivity(goToStarters);
            }
        });

        mainCourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToMainCourses = new Intent(MainActivity.this, MainCourses.class);
                startActivity(goToMainCourses);
            }
        });

        desserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToDesserts = new Intent(MainActivity.this, Desserts.class);
                startActivity(goToDesserts);
            }
        });
    }
}