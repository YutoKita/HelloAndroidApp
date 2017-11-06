package jp.techacademy.kita.yuuto.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human kita = new Human("kita",31);

        kita.say();

        Human Myhobby = new Human("movie");

        Myhobby.think();

    }
}
