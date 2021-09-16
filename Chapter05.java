//演習問題
//以下のプログラムを作成してください。
//プリミティブ型の「long」「double」「boolean」の変数に値を代入して出力
//　・ラッパークラスの「Float」「Integer」「Character」の変数に値を代入して出
//・要素数が5の「int」配列に値を代入して、インデックス番号が3の値を出力
public class Chapter05 {
    public static void main(String[] args) {
   long l = 12345L;
        System.out.println(l);

   double b = 12.3;
        System.out.println(b);

   boolean t = true;
        System.out.println(t);

   Float f = 3.2f;
        System.out.println(f);

   Integer i = 100;
        System.out.println(i);

   Character c = 'う';
        System.out.println(c);
   int[] array = {0, 1, 2, 3, 4, 5 };
        System.out.println(array[3]);
    }
}
