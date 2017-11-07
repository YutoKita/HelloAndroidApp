package jp.techacademy.kita.yuuto.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("kita", 31, "movie"); //名前kita、年齢31歳、趣味movieのhumanインスタンス

        //メンバ関数
    human.say();
    human.think();
    }
}

