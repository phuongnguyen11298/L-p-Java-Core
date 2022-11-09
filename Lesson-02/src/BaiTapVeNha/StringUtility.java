package BaiTapVeNha;
import java.util.Scanner;
public class StringUtility {
    public static void main(String[] args) {
        String str;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        str = scanner.nextLine();
        System.out.println("Nhập ký tự cần tìm: ");
        String c = scanner.nextLine();
        System.out.println("Vị trí xuất hiện cuối cùng của ký tự: " +  str.lastIndexOf(c));
       ;

    }
}
