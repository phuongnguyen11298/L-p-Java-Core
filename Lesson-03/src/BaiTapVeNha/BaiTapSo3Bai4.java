package BaiTapVeNha;
import java.util.Scanner;
public class BaiTapSo3Bai4 {
    public static void main(String[] args) {
        System.out.print("Nhập n = ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Tất cả các số nguyên tố nhỏ hơn " +n+ " là:");
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}