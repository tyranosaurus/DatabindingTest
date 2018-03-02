package com.tyranotyrano.databindingtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.tyranotyrano.databindingtest.databinding.ActivityMainBinding;
import com.tyranotyrano.databindingtest.vo.User;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);

        // Activity 변수 할당
        binding.setActivity(MainActivity.this);

        // User 변수 할당
        User user = new User("최", "영진");
        binding.setUser(user);
    }

    public void onButtonClick(View v) {
        Toast.makeText(MainActivity.this, "버튼 클릭", Toast.LENGTH_SHORT).show();
    }
}
