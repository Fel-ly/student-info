package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView CourseNameTextView;
    private TextView departmentNameTextView;
    private Course newCourse = new Course("hospitality", "tourism and hospitality");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        CourseNameTextView = (TextView) findViewById(R.id.courseName);
        departmentNameTextView = (TextView) findViewById(R.id.courseDepartment);

        // name should be the same string name we passed in the previous activity
        String courseName = getIntent().getStringExtra("courseName");
        String departmentName = getIntent().getStringExtra("departmentName");

        // once we get it now we pass it into the text views for displaying
        CourseNameTextView.setText(courseName);
        departmentNameTextView.setText(departmentName);

        // HOPEFULLY it runs now fingers crossed
    }
}