package jp.techacademy.kita.yuuto.myapplication;

/**
 * Created by KITA on 2017/11/06.
 * 抽象クラスAnimalを生成。（∵Humanクラスに継承させるため）
 */

abstract class Animal {
    //メンバ変数
    String name; //名前
    int age;     //年齢

    abstract public void say();
}
