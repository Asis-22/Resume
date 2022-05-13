package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity5 extends AppCompatActivity {

    EditText github,linkdin;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        github = findViewById(R.id.github);
        linkdin = findViewById(R.id.linkdin);
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


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String g =github.getText().toString();
                String l =linkdin.getText().toString();


                Intent intent = new Intent(MainActivity5.this,MainActivity6.class);
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
                intent.putExtra("github",g);
                intent.putExtra("linkdin",l);
                startActivity(intent);
            }
        });
    }
}