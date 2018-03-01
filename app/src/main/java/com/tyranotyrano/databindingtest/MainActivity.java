package com.tyranotyrano.databindingtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tyranotyrano.databindingtest.databinding.ActivityMainBinding;
import com.tyranotyrano.databindingtest.vo.User;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);

        User user = new User("최", "영진");
        binding.setUser(user);
    }
}
