package com.example.advancedadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Student> students = new ArrayList<>();

        Student JoshSmith = new Student();
        JoshSmith.setFirstName("Josh");
        JoshSmith.setLastName("Smith");
        JoshSmith.setMajor("Biology");
        students.add(JoshSmith);

        Student AbbyCross = new Student();
        AbbyCross.setFirstName("Abby");
        AbbyCross.setLastName("Cross");
        AbbyCross.setMajor("Chemistry");
        students.add(AbbyCross);

        Student ZekeAlexander = new Student();
        ZekeAlexander.setFirstName("Zeke");
        ZekeAlexander.setLastName("Alexander");
        ZekeAlexander.setMajor("Theater");
        students.add(ZekeAlexander);

        Student TaylorFranks = new Student();
        TaylorFranks.setFirstName("Taylor");
        TaylorFranks.setLastName("Franks");
        TaylorFranks.setMajor("Studio Art");
        students.add(TaylorFranks);

        Student RyanThompson = new Student();
        RyanThompson.setFirstName("Ryan");
        RyanThompson.setLastName("Thompson");
        RyanThompson.setMajor("Business");
        students.add(RyanThompson);
    }

    public class Student {
        String firstName;
        String lastName;
        String major;

        //...

        public Student() {
            firstName = "";
            lastName = "";
            major = "";
        }

        //...

        public void setFirstName (String name) {
            firstName = name;
        }

        public void setLastName (String name) {
            lastName = name;
        }

        public void setMajor (String degree) {
            major = degree;
        }

        //...

        public String getFirstName () {
            return firstName;
        }

        public String getLastName () {
            return lastName;
        }

        public String getMajor () {
            return major;
        }
    }



}