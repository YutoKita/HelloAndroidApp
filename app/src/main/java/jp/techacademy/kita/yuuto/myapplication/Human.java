package jp.techacademy.kita.yuuto.myapplication;

import android.util.Log;

/**
 * Created by KITA on 2017/11/07.
 * 抽象クラスAnimalを継承
 */

class Human extends Animal implements Thinkable{
    //クラス変数
    static String to_jp = "人間";

    //メンバ変数
    String hobby;

    //コンストラクタ
    public Human(String name, int age) {
        this.name = name;    //名前
        this.age = age;      //年
    //    this.hobby = hobby; //趣味
    }
    public Human(String hobby){
        this.hobby = hobby;
    }

    //メンバ関数
    public void say(){
        Log.d("javatest", "私の名前は" + this.name + "です。" + "年は" + this.age +"です。");
    }

    @Override
    public void think(){
        Log.d("javatest", "私は" + this.hobby +"について考える。");
    }
}
