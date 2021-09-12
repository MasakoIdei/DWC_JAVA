//４章 確認問題
//名前を「String」型の変数名に代入してください
//次に好きな言葉を同じ変数に代入してください。
//ラッキーナンバーとして「int」型で宣言した定数を出力してください。

    public class Chapter04 {
        public static void main(String[] args) {
            String name = "花子";
            System.out.println(name);

            name = "もちまる日記";
            System.out.println(name + "を見たよ");

            final int LUCKY_NUMBER = 7;
            System.out.println("ラッキーナンバーは" + LUCKY_NUMBER + "でした。");
        }
    }
