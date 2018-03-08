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

    User user = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // MainActivity 레이아웃 바인딩
        binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);

        // Activity 변수 할당
        binding.setActivity(MainActivity.this);

        // User 변수 할당
        user = new User("최", "영진");
        binding.setUser(user);
    }

    public void onButtonClick(View v) {
        user.setFirstName("Hello");
        user.setLastName("Databinding");

        Toast.makeText(MainActivity.this, "이름 바꾸기 성공", Toast.LENGTH_SHORT).show();
    }

    public void onImageClick(View v) {
        Toast.makeText(MainActivity.this, "이미지 클릭", Toast.LENGTH_SHORT).show();
    }
}
