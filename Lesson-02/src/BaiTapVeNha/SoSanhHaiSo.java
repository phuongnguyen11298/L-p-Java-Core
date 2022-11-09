package BaiTapVeNha;
import java.util.Random;
import java.util.Scanner;

public class SoSanhHaiSo {
    public static void main(String[] args) {
        int i, r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên bất kỳ: ");
        i = scanner.nextInt();

        Random randomNumber = new Random();
        r = randomNumber.nextInt(101);
        System.out.println("Số nguyên ngẫu nhiên là: " + r);

        String s = (i > r) ? "Số bạn nhập lớn hơn số ngẫu nhiên" : "Số bạn nhập nhỏ hơn số ngẫu nhiên";
        s = (i == r) ? "Số bạn nhập bằng số ngẫu nhiên": s;
        System.out.println(s);

    }
}
