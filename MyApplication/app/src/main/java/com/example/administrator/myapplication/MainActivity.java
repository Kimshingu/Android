package com.example.administrator.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 로그를 출력할 때 Log 클래스가 지원하는 메소드를 사용한다.
        Log.d(TAG, ".onCreate()");

        // 화면 정보를 가진 XML을 로드해서 화면을 구성한다.
        // R.java 파일은 자동으로 생성/업데이트 된다.
        // 이 파일 안에서 res 폴더 밑에 존재하는 모든 자원을
        // 관리하는 파일이다.
        setContentView(R.layout.activity_main);
        // setContentView() 메소드가 처리된 후에는 XML안에 정의한
        // 뷰를 객체로써 접근하여 사용할 수 있다.

        // id가 button인 뷰 객체의 참조를 획득하여 해당 뷰에 이벤트 리스너를 장착한다.
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this,"1번 버튼 클릭", Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }

    public void onClickButton1(View view) {
        Toast toast = Toast.makeText(this,"2번 버튼 클릭", Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, ".onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, ".onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, ".onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, ".onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, ".onDestroy()");
    }

    public  void onClickNext(View view){
        // 다음 화면의 정보를 인텐트 객체에 담는다.
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("key", 100);
        // 다음 화면을 표시한다.
        // 액티비티는 안드로이드가 정한 액티비티 라이프 사이클
        // 메소드가 기동해야만 화면이 처리되므로 개발자가 직접 해당 객체를 만들어서
        // 호출하는 것이 아니라 안드로이드에게 작업을 요청해야 한다.
        startActivity(intent);
    }

    // 액티비티 화면이 뒤에 숨었다가 다시 최상단 화면으로 표시될 때
    // 기동하는 메소드이다.
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, ".onRestart()");
    }
}
