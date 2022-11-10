package BaiTapTrenLop;

import java.util.Scanner;

public class ThucHanhTrenLop01 {
    public static void main(String[] args) {
        System.out.println("Nhập chiều dài hình chữ nhật: ");
        int width = new Scanner(System.in).nextInt();
        if (width <= 0) {
            System.out.println("Cạnh của hình chữ nhật phải có giá trị dương, vui lòng nhập lại");
            width = new Scanner(System.in).nextInt();
        }
        System.out.println("Nhập chiều rộng hình chữ nhật: ");
        int height = new Scanner(System.in).nextInt();
        }
    }

