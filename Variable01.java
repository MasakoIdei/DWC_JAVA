/*
変数について
　・変数を使用するには、宣言が必要。
　・railsの時と同じで予約語が存在している。
　・先頭に数字は使えない
　・アルファベットの大小は区別される。
　・変数名には大小のアルファベット、＿アンダースコア、＄ドルマークなどが使用できる。
　※注意点は;(セミコロン)の付け忘れと、文字列の時の””の付け忘れ
　
　基本構成は、　型 変数名;
　代入時は、　　変数名 = 代入したいデータ;
*/

public class Variable01 {
    public static void main(String[] args) {

        int num1;    //データ型の指定　＋　変数名の宣言
        String str1;
        num1 = 10;   //変数の代入(初期化)
        str1 = "Hello World!";
        System.out.println(num1);
        System.out.println(str1);

        num1 = 20;  //再代入
        System.out.println(num1);

        int num2 = 30;  //型　変数名の宣言と同時に、初期化
        System.out.println(num2);
    }
}