package BaiTapVeNha;

import java.util.Scanner;

public class BienLuanPTbac1 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner= new Scanner (System.in);
        System.out.println("Nhập số a: ");
        a = scanner.nextInt();
        System.out.println("Nhập số b: ");
        b = scanner.nextInt();
        System.out.println("Phương trình vừa nhập vào là " +a+ "x+" + b+ "= 0");

        String ketluan = "Phương trình có nghiệm x = " + (-b/(double) a );
        ketluan = (a==0) ? "Phương trình vô nghiệm": ketluan;
        ketluan = a==0 && b==0 ? "Phương trình vô số nghiệm" : ketluan;
        System.out.println(ketluan);


    }
}
