package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CollectData extends AppCompatActivity {

    private EditText courseInput, departmentInput;
    private Button submitData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect_data);

        courseInput = (EditText) findViewById(R.id.editTextTextCourseName);
        departmentInput = (EditText) findViewById(R.id.editTextTextDepartmentName);
        submitData = (Button) findViewById(R.id.submitData);



        submitData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userCourse = courseInput.getText().toString();
                String userDepartment = departmentInput.getText().toString();

                Intent intent = new Intent(CollectData.this, SecondActivity.class);
                // pass user input from collectdata activity to second activity
                intent.putExtra("courseName", userCourse);
                intent.putExtra("departmentName", userDepartment);
                startActivity(intent);
            }
        });
    }
}
