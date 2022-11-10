package BaiTapVeNha.BaiTapSo3;
import java.util.Scanner;

public class BaiTapSo3Bai2 {
    public static void main(String[] args) {
        System.out.println("Nhập số nguyên n:");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println("Các ước số của n là: " + i);

            }
        }
    }
}