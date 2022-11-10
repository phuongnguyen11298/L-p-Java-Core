package BaiTapTrenLop;

import java.util.Scanner;

public class TongsoChanWhile {
    public static void main(String[] args) {
        System.out.println("Nhập số n: ");
        int n = new Scanner(System.in).nextInt();
        int i = 1, s = 0;
        while (i <= n) {
            i += 2;
            s += i;
        }
        System.out.println("Tổng các số chẵn từ 1-" + n + " là: " + s);

    }
}


