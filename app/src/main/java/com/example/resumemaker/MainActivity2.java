package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText course, school;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        course = findViewById(R.id.course);
        school = findViewById(R.id.school);
        next = findViewById(R.id.next);


        String name = getIntent().getStringExtra("namesurname");
        String gmail = getIntent().getStringExtra("gmail");
        String number = getIntent().getStringExtra("number");
        String dob = getIntent().getStringExtra("dob");

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String c = course.getText().toString();
                String s = school.getText().toString();


                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("namesurname", name);
                intent.putExtra("gmail", gmail);
                intent.putExtra("number", number);
                intent.putExtra("dob", dob);
                intent.putExtra("course", c);
                intent.putExtra("school", s);

                startActivity(intent);
            }
        });

    }
}