package BaiTapVeNha;
import java.util.Scanner;

public class BienLuanPTBac2 {
    public static void main(String[] args) {
        int a,b,c;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập số a: ");
        a = scanner.nextInt();
        System.out.println("Nhập số b: ");
        b = scanner.nextInt();
        System.out.println("Nhập số c: ");
        c = scanner.nextInt();
        System.out.println("Ta có phương trình bậc hai là: " +a+ "x2 +" +b+ "x+" +c+ "=0");

        double denta = (Math.pow(b,2) - 4*a*c);
        String ketluan ="Phương trình có 2 nghiệm: " + ((-b + Math.sqrt(denta))/(double) 2*a) + " và " + ((-b - Math.sqrt(denta))/(double) 2*a);
        ketluan = denta > 0 ? ketluan : (denta == 0) ? "Phương trình có nghiệm kép: " + (-b/(double)2*a) : ketluan;
        ketluan = denta < 0 ? "Phương trình vô nghiệm": ketluan;
        System.out.println(ketluan);


    }
}
