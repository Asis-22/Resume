package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class templete7 extends AppCompatActivity {
    ImageView t1, t2, t3, t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_templete7);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);


        String name = getIntent().getStringExtra("namesurname");
        String gmail = getIntent().getStringExtra("gmail");
        String number = getIntent().getStringExtra("number");
        String dob = getIntent().getStringExtra("dob");
        String course = getIntent().getStringExtra("course");
        String school = getIntent().getStringExtra("school");
        String company = getIntent().getStringExtra("company");
        String year_t = getIntent().getStringExtra("year_t");
        String skill = getIntent().getStringExtra("skill");
        String skill2 = getIntent().getStringExtra("skill2");
        String skill3 = getIntent().getStringExtra("skill3");
        String github = getIntent().getStringExtra("github");
        String linkdin = getIntent().getStringExtra("linkdin");
        String Companyname = getIntent().getStringExtra("Companyname");
        String Website = getIntent().getStringExtra("Website");


        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(templete7.this, MainActivity8.class);
                intent.putExtra("namesurname", name);
                intent.putExtra("gmail", gmail);
                intent.putExtra("number", number);
                intent.putExtra("dob", dob);
                intent.putExtra("course", course);
                intent.putExtra("school", school);
                intent.putExtra("company", company);
                intent.putExtra("year_t", year_t);
                intent.putExtra("skill", skill);
                intent.putExtra("skill2", skill2);
                intent.putExtra("skill3", skill3);
                intent.putExtra("github", github);
                intent.putExtra("linkdin", linkdin);
                intent.putExtra("Companyname", Companyname);
                intent.putExtra("Website", Website);
                startActivity(intent);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(templete7.this, MainActivity8.class);
                intent.putExtra("namesurname", name);
                intent.putExtra("gmail", gmail);
                intent.putExtra("number", number);
                intent.putExtra("dob", dob);
                intent.putExtra("course", course);
                intent.putExtra("school", school);
                intent.putExtra("company", company);
                intent.putExtra("year_t", year_t);
                intent.putExtra("skill", skill);
                intent.putExtra("skill2", skill2);
                intent.putExtra("skill3", skill3);
                intent.putExtra("github", github);
                intent.putExtra("linkdin", linkdin);
                intent.putExtra("Companyname", Companyname);
                intent.putExtra("Website", Website);
                startActivity(intent);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(templete7.this, MainActivity8.class);
                intent.putExtra("namesurname", name);
                intent.putExtra("gmail", gmail);
                intent.putExtra("number", number);
                intent.putExtra("dob", dob);
                intent.putExtra("course", course);
                intent.putExtra("school", school);
                intent.putExtra("company", company);
                intent.putExtra("year_t", year_t);
                intent.putExtra("skill", skill);
                intent.putExtra("skill2", skill2);
                intent.putExtra("skill3", skill3);
                intent.putExtra("github", github);
                intent.putExtra("linkdin", linkdin);
                intent.putExtra("Companyname", Companyname);
                intent.putExtra("Website", Website);
                startActivity(intent);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(templete7.this, MainActivity8.class);
                intent.putExtra("namesurname", name);
                intent.putExtra("gmail", gmail);
                intent.putExtra("number", number);
                intent.putExtra("dob", dob);
                intent.putExtra("course", course);
                intent.putExtra("school", school);
                intent.putExtra("company", company);
                intent.putExtra("year_t", year_t);
                intent.putExtra("skill", skill);
                intent.putExtra("skill2", skill2);
                intent.putExtra("skill3", skill3);
                intent.putExtra("github", github);
                intent.putExtra("linkdin", linkdin);
                intent.putExtra("Companyname", Companyname);
                intent.putExtra("Website", Website);
                startActivity(intent);
            }
        });
    }
}