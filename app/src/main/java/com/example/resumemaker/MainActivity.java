package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText namesurname, number, gmail, dob, hobby;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namesurname = findViewById(R.id.namesurname);
        number = findViewById(R.id.number);
        gmail = findViewById(R.id.gmail);
        dob = findViewById(R.id.dob);
        hobby = findViewById(R.id.hobby);
//        gender = findViewById(R.id.gender);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String a = namesurname.getText().toString();
                String s = number.getText().toString();
                String b = gmail.getText().toString();
                String m = dob.getText().toString();
//                String c1 = hobby.getText().toString();


//                String D = gender.getText().toString();


                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                intent.putExtra("namesurname", a);
                intent.putExtra("number", s);
                intent.putExtra("gmail", b);
                intent.putExtra("dob", m);
//                intent.putExtra("gender", D);
                startActivity(intent);


            }
        });

    }
}