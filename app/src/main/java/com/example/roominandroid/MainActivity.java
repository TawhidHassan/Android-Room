package com.example.roominandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.roominandroid.Room.MyDatabase;
import com.example.roominandroid.Room.Student;

public class MainActivity extends AppCompatActivity {
    EditText firstName , secondName, className , updatename , updateid , deleteID;
    Button insert , read , btnUpdate , btnDelete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = (EditText) findViewById(R.id.firstName);
        secondName = (EditText) findViewById(R.id.secondName);
        className = (EditText) findViewById(R.id.className);
        updatename = (EditText) findViewById(R.id.updatename);
        updateid = (EditText) findViewById(R.id.updateid);
        deleteID = (EditText) findViewById(R.id.deleteID);
        insert = (Button) findViewById(R.id.insert);
        read = (Button) findViewById(R.id.read);
        btnUpdate = (Button) findViewById(R.id.btnUpdate);
        btnDelete = (Button) findViewById(R.id.btnDelete);


        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Student student=new Student(firstName.getText().toString(),secondName.getText().toString(),className.getText().toString());
                MyDatabase myDatabase= Room.databaseBuilder(MainActivity.this,MyDatabase.class,"StudentDB")
                        .allowMainThreadQueries().build();
                myDatabase.dao().studentInsertion(student);
            }
        });


    }
}