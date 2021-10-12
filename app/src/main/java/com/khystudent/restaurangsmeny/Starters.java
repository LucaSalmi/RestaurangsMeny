package com.khystudent.restaurangsmeny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;

public class Starters extends AppCompatActivity {

    ImageView next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        setIDs();
        setListeners();

    }

    public void setIDs(){
        next = findViewById(R.id.next_page);
    }

    public void setListeners(){

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent goToMain = new Intent(Starters.this, MainCourses.class);
                startActivity(goToMain);

            }
        });

    }
}