package BaiTapTrenLop;

import java.util.Scanner;

public class TinhTongS {
    public static void main(String[] args) {
        int S = 0;
        System.out.println("Nhập số n: ");
        int n = new Scanner(System.in).nextInt();


        for (int i = 1; i <= n; i ++) {S = S + i;}
        System.out.println("Tổng các số từ 1-" + n + " là: " + S);
    }
}
