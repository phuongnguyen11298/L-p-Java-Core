package BaiTapVeNha.BaiTapSo3;
import java.util.Scanner;

public class BaiTapSo3Bai5 {
    public static void main(String[] args) {
        int soDu, sum = 0;

        System.out.println("Nhập vào số nguyên dương bất kỳ: ");
        int n = new Scanner(System.in).nextInt();

        while (n > 0) {
            soDu = n % 10;
            n = n / 10;
            sum += soDu;
        }

        System.out.println("Tổng các chữ số = " + sum);
    }

}
