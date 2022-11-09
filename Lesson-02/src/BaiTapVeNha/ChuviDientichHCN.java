package BaiTapVeNha;
import java.util.Scanner;
public class ChuviDientichHCN {
    public static void main(String[] args) {
        double h, w;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài hình chữ nhật: ");
        h = scanner.nextFloat();
        System.out.println("Nhập chiều rộng hình chữ nhật: ");
        w = scanner.nextFloat();
        System.out.println("Chu vi hình chữ nhật = " + (h+w)*2);
        System.out.println("Diện tích hình chữ nhật = " + h*w);


    }
}
