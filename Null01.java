

public class Null01 {
    public static void main(String[] args) {
    String str1;

    //あいうの文字を出力
    str1 = "あいう";
    System.out.println(str1 + "の文字数は" + str1.length());

    //空白を出力
    str1 = "";
    System.out.println(str1 + "の文字は" + str1.length());

    //nullの変数を参照　＝　NullPointerExceptoinというエラーが発生するのを確認しよう
    str1 = null;
    System.out.println(str1 + "の文字は" + str1.length());

   //Exception in thread "main" java.lang.NullPointerException
        // 	at Null01.main(Null01.java:17)

   //今回のエラーの原因事態は、null(何も存在しない空の状態)の変数に対して
   //lengthメゾットで数を数えようとしたために発生。エラー文の中でも、17行目が原因かも？と教えてくれていることを確認。

    }
}

