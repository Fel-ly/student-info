package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView CourseNameTextView;
    private TextView departmentNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        CourseNameTextView = (TextView) findViewById(R.id.courseName);
        departmentNameTextView = (TextView) findViewById(R.id.courseDepartment);

        // name should be the same string name we passed in the previous activity
        String courseName = getIntent().getStringExtra("courseName");
        String departmentName = getIntent().getStringExtra("departmentName");

        //passing the data into the course object
        Course newCourse = new Course(courseName, departmentName);

        // pass the newCourse class created data into the textviews for displaying
        CourseNameTextView.setText(newCourse.getName());
        departmentNameTextView.setText(newCourse.department);
    }
}