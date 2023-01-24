package com.willi_vstn.two_way_data_binding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.willi_vstn.two_way_data_binding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person person1 = new Person("Pieter");

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        activityMainBinding.setPerson(person1);

    }

}