package BaiTapVeNha;

import java.util.Scanner;

public class BaiTapSo3Bai1<d> {
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên a: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhập số nguyên b: ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Nhập số nguyên c: ");
        int c = new Scanner(System.in).nextInt();
        System.out.println("Nhập số nguyên d: ");
        int d = new Scanner(System.in).nextInt();

        if (a > b && a > c && a > d) {
            System.out.println("Số lớn nhất trong 4 số là: " + a);
        } else if (b > c && b > a && b > d) {
            System.out.println("Số lớn nhất trong 4 số là:" + b);
        } else if (c > a && c > b && c > d) {
            System.out.println("Số lớn nhất trong 4 số là: " + c);
        } else {
            System.out.println("Số lớn nhất trong 4 số là: " + d);
        }


    }

}

