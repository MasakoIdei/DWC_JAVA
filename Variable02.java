/*定数について
　　後から、代入しなおさないことが前提で使用する変数。　　　
    Rubyの場合は、大文字スタートの変数名をつけると定数って判断されていたけど
    Javaの場合は
    final データ型　定数名 = 初期値;　になる
    ※定数の変数名はすべて大文字のアルファベットで記述、区切るときは_を使うのが一般的。
*/
    public class Variable02 {
    public static void main(String[] args) {
        final int MIN_NUMBER = 10;
        System.out.println(MIN_NUMBER);
        //代入しようとするとエラーになるかを確認.確認ができたらコメントアウト。
        //MIN_NUMBER = 20;
        //System.out.println(MIN_NUMBER);
    }
}