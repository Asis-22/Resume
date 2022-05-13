package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    EditText company, year_t;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        company = findViewById(R.id.Company);
        year_t = findViewById(R.id.year_t);
        next = findViewById(R.id.next);

        String name = getIntent().getStringExtra("namesurname");
        String gmail = getIntent().getStringExtra("gmail");
        String number = getIntent().getStringExtra("number");
        String dob = getIntent().getStringExtra("dob");
        String course = getIntent().getStringExtra("course");
        String school = getIntent().getStringExtra("school");


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String x = company.getText().toString();
                String y = year_t.getText().toString();


                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                intent.putExtra("namesurname", name);
                intent.putExtra("gmail", gmail);
                intent.putExtra("number", number);
                intent.putExtra("dob", dob);
                intent.putExtra("course", course);
                intent.putExtra("school", school);
                intent.putExtra("company", x);
                intent.putExtra("year_t", y);
                startActivity(intent);
            }
        });
    }
}