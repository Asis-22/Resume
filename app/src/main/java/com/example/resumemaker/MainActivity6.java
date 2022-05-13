package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity6 extends AppCompatActivity {
    EditText Companyname, Website;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        Companyname = findViewById(R.id.Companyname);
        Website = findViewById(R.id.Website);
        next = findViewById(R.id.next);


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


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String C =Companyname.getText().toString();
                String w =Website.getText().toString();


                Intent intent = new Intent(MainActivity6.this,templete7.class);
                intent.putExtra("namesurname",name);
                intent.putExtra("gmail",gmail);
                intent.putExtra("number",number);
                intent.putExtra("dob",dob);
                intent.putExtra("course", course);
                intent.putExtra("school", school);
                intent.putExtra("company",company);
                intent.putExtra("year_t",year_t);
                intent.putExtra("skill",skill);
                intent.putExtra("skill2",skill2);
                intent.putExtra("skill3",skill3);
                intent.putExtra("github",github);
                intent.putExtra("linkdin",linkdin);
                intent.putExtra("Companyname",C);
                intent.putExtra("Website",w);
                startActivity(intent);
            }
        });
    }
}