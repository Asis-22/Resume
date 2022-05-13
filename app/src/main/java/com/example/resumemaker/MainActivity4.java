package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity {

    EditText skill, skill2, skill3;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        skill = findViewById(R.id.skill);
        skill2 = findViewById(R.id.skill2);
        skill3 = findViewById(R.id.skill3);
        next = findViewById(R.id.next);

        String name = getIntent().getStringExtra("namesurname");
        String gmail = getIntent().getStringExtra("gmail");
        String number = getIntent().getStringExtra("number");
        String dob = getIntent().getStringExtra("dob");
        String course = getIntent().getStringExtra("course");
        String school = getIntent().getStringExtra("school");
        String company = getIntent().getStringExtra("company");
        String year_t = getIntent().getStringExtra("year_t");


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = skill.getText().toString();
                String s2 = skill2.getText().toString();
                String s3 = skill3.getText().toString();


                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                intent.putExtra("namesurname", name);
                intent.putExtra("gmail", gmail);
                intent.putExtra("number", number);
                intent.putExtra("dob", dob);
                intent.putExtra("course", course);
                intent.putExtra("school", school);
                intent.putExtra("company", company);
                intent.putExtra("year_t", year_t);
                intent.putExtra("skill", s1);
                intent.putExtra("skill2", s2);
                intent.putExtra("skill3", s3);
                startActivity(intent);
            }
        });
    }
}