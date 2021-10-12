package com.khystudent.restaurangsmeny;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView starters;
    TextView mainCourses;
    TextView desserts;

    ImageView phone;
    ImageView mail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setIDs();
        setListeners();

    }

    public void setIDs(){

        starters = findViewById(R.id.starters_title);
        mainCourses = findViewById(R.id.main_course_title);
        desserts = findViewById(R.id.dessert_title);
        phone = findViewById(R.id.phone_symbol);
        mail = findViewById(R.id.mail_symbol);
    }

    public void setListeners(){

        starters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToStarters = new Intent(MainActivity.this, Starters.class);
                RunAnimation(starters);
                startActivity(goToStarters);
            }
        });

        mainCourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToMainCourses = new Intent(MainActivity.this, MainCourses.class);
                RunAnimation(mainCourses);
                startActivity(goToMainCourses);
            }
        });

        desserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToDesserts = new Intent(MainActivity.this, Desserts.class);
                RunAnimation(desserts);
                startActivity(goToDesserts);
            }
        });

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent caller = new Intent(Intent.ACTION_DIAL);
                caller.setData(Uri.parse("tel:0765881154"));
                startActivity(caller);
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mailer = new Intent(Intent.ACTION_VIEW);
                Uri data = Uri.parse("mailto:amicimiei@gmail.com");
                mailer.setData(data);

                try{
                    startActivity(mailer);
                }catch (ActivityNotFoundException e){
                    Toast.makeText(MainActivity.this, "No e-mail app present", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    private void RunAnimation(TextView tv)
    {
        Animation a = AnimationUtils.loadAnimation(this, R.anim.blink);
        a.reset();
        tv.clearAnimation();
        tv.startAnimation(a);
    }


}