package BaiTapVeNha;

import java.util.Scanner;

public class BaiTapSo3Bai3 {
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhập số nguyên b: ");
        int b = new Scanner(System.in).nextInt();

        for (int i = 1; i >= a && i >= b; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println("Bội chung nhỏ nhất của a và b là: " + i);
            }
        }
        for (int m = 1; m <= a && m <= b; m++) {
            if (a % m == 0 && b % m == 0) {
                System.out.println("Ước chung nhỏ nhất của a và b là: " + m);
            }

        }
    }

}

