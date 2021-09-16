//条件分岐
//指定した条件に当てはまるかそうでないかによって、処理をするかしないかを制御する文。
//基本的な使い方はrubyの時と一緒だけど、書き方が少し違う。
/*【基本構文】
if (条件)　｛
　ブロック（処理分）;
｝
 */

public class If01 {
    public static void main(String[] args) {
        int number = 7;
        if (number < 5) {
            System.out.println(number + "は５未満です");
        }
        if (number < 10) {
            System.out.println(number + "は１０未満です");
        }
        if (number < 15 ) {
            System.out.println(number + "は１５未満です");
        }
    }
}
