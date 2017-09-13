package com.example.user.sep_13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void NextScene(View v){
        Intent i = new Intent(this, Main2Activity.class);  // 이것이 인텐트, 메시지 객체이다.
        startActivity(i);

    }

    public void NextScene1(View v){  // nextScene를 실행시킬려면 startActivity가 있어야 한다.
        Intent a = new Intent(this, Main2Activity.class);  // 어디로 가야될지 모를 때 인텐드를 사용한다.
        startActivity(a);
    }


}
