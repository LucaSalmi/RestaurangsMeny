package com.khystudent.restaurangsmeny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainCourses extends AppCompatActivity {

    ImageView next;
    ImageButton help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        setIDs();
        setListeners();

    }

    public void setIDs(){

        next = findViewById(R.id.next_page);
        help = findViewById(R.id.help_allergy);
    }

    public void setListeners(){

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent goToMain = new Intent(MainCourses.this, Desserts.class);
                startActivity(goToMain);

            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToHelp = new Intent(MainCourses.this, Help_Page.class);
                startActivity(goToHelp);
            }
        });

    }
}