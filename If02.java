//else-if、else
//使い方はrubyの時とそんなに違わないけれど
//elsif　が　else if となっているのに注意するのと
//else、else if の書き出しの位置にも注意

public class If02 {
    public static void main(String[] args) {
        int number = 20;
        if (number < 5) {
            System.out.println(number + "は５未満です");
        } else if (number < 10) {
            System.out.println(number + "は５以上、１０未満です");
        } else if (number < 15) {
            System.out.println(number + "は１０以上、１５未満です");
        } else {
            System.out.println(number + "は１５未満ではないです");
        }

    }
}
