//switch文　変数の値を条件にして、処理を分岐する制御文
/*　使用できる条件
・すべての条件式が ＝＝　みたいな左辺と右辺を比べて一致するかどうかを比較になっている。
「＜」「＞」「!=」などが使われていない。
・比較する値が、整数or文字型、文字である。※小数や真偽ではない。

case…英語の「～の場合は」
case 値: が基本の書き方
↑この部分をラベル、caseラベルというらしい。
*/

public class Switch01 {
    public static void main(String[] args) {
        int val = 2;
        switch (val) {
            case 3:  //「;」ではなくて、「:」な所に注意！
                System.out.println("良く出来ました！");
                break; //breakを記入しないと次の処理も実行されてしまう。書き忘れに注意！
            case 2:
                System.out.println("ふつうでした！");
                break;
            default:  // case文のどれにも当てはまらない、一致しない時の処理をしたいときに使う。何もしないときは書かなくてもOK
                System.out.println("がんばろう！");
        }
    }
}
//if 文で書く場合↓
/*
         int val = 2;
         if (val == 3) {
           System out println("良く出来ました！");
         } else if (val == 2) {
           System out println("ふつうでした！");
         } else {
           System out println("がんばろう！");
         }
 switch文の方が、条件分の箇所がすっきりしている。
 何と何を比較しての処理なのかぱっと見だと分かりやすいし、
 同じような条件式を繰り返し書く手間も減る。
*/