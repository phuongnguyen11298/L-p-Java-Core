package BaiTapVeNha;

import java.util.Scanner;
import java.util.Random;

public class DoanSo {
    public static void main(String[] args) {

        System.out.println("Nhập số nguyên bất kỳ: ");
        int n = new Scanner(System.in).nextInt();

        int r = new Random().nextInt(100);
        System.out.println("Số ngẫu nhiên là: " + r);

        if (n > r) {
            System.out.println("Bạn đoán lớn hơn rồi, mời nhập lại");
        } else if (n < r) {
            System.out.println("Bạn đoán nhỏ hơn rồi, mời nhập lại");
        } else {
            System.out.println("Bạn đoán trúng rồi");

        }
    }
}
