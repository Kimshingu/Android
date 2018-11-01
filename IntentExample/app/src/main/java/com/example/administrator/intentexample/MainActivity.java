package com.example.administrator.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        final EditText editText = (EditText)findViewById(R.id.editText);

        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //현재 Activity와 전환될 Activity를 인자로 넘긴다.
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                //EditTet에서 사용자가 입력한 문자열을 넘김, 스트링 변환후 넘겨야함
                intent.putExtra("sendText", String.valueOf(editText.getText())); // 사용자가 입력한 데이터를 가져옴
                //SubActivity를 호출
                startActivity(intent);
                // 개발자의 의도를 startActivity에 담아서 안드로이드에 요청
            }
        });

    }
}
