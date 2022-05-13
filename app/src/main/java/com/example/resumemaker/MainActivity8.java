package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.time.Year;

public class MainActivity8 extends AppCompatActivity {

    TextView namesurname_t, email_t, mobile_t, dob_t, course_t, school_t,year,
            company_t, skill_t1, skill_t2, skill_t3, skill_t4, github_t,
            linkedin_t, companyname_t, website_t, hobby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);


        namesurname_t = findViewById(R.id.name_t);
        email_t = findViewById(R.id.email_t);
        mobile_t = findViewById(R.id.mobile_t);
        dob_t = findViewById(R.id.Dob_t);
        hobby = findViewById(R.id.hobby);
        year = findViewById(R.id.year_t);
        course_t = findViewById(R.id.course_t);
        school_t = findViewById(R.id.school_t);
        company_t = findViewById(R.id.company_t);
        skill_t1 = findViewById(R.id.skill_t1);
        skill_t2 = findViewById(R.id.skill_t2);
        skill_t3 = findViewById(R.id.skill_t3);
        skill_t4 = findViewById(R.id.skill_t4);
        github_t = findViewById(R.id.github_t);
        linkedin_t = findViewById(R.id.linkedin_t);
        companyname_t = findViewById(R.id.companyname_t);
        website_t = findViewById(R.id.website_t);

        String name = getIntent().getStringExtra("namesurname");
        String gmail = getIntent().getStringExtra("gmail");
        String number = getIntent().getStringExtra("number");
        String dob = getIntent().getStringExtra("dob");
        String year_t = getIntent().getStringExtra("year_t");
        String course = getIntent().getStringExtra("course");
        String school = getIntent().getStringExtra("school");
        String company = getIntent().getStringExtra("company");
        String skill = getIntent().getStringExtra("skill");
        String skill2 = getIntent().getStringExtra("skill2");
        String skill3 = getIntent().getStringExtra("skill3");
        String github = getIntent().getStringExtra("github");
        String linkdin = getIntent().getStringExtra("linkdin");
        String Companyname = getIntent().getStringExtra("Companyname");
        String Website = getIntent().getStringExtra("Website");


        namesurname_t.setText("" + name);
        mobile_t.setText("" + number);
        email_t.setText("" + gmail);
        dob_t.setText("" + dob);
        course_t.setText("" + course);
        school_t.setText("" + school);
        company_t.setText(""+company);
        company_t.setText("" + company);
        year.setText(""+year_t);
        skill_t1.setText("" + skill);
        skill_t2.setText("" + skill2);
        skill_t3.setText("" + skill3);
        github_t.setText("" + github);
        linkedin_t.setText("" + linkdin);
        companyname_t.setText("" +Companyname);
        website_t.setText("" + Website);


    }
}