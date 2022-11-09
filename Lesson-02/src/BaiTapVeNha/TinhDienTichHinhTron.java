package BaiTapVeNha;
import java.util.Scanner;

public class TinhDienTichHinhTron {
    public static void main(String[] args) {
        double r;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính của hình tròn: ");
        r = scanner.nextDouble();
        System.out.println("Diện tích của hình tròn: " + Math.pow(r,2)*3.14);


    }
}
