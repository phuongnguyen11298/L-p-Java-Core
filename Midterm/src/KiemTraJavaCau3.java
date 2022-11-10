import java.util.Scanner;

public class KiemTraJavaCau3 {
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Nhập số nguyên n: ");
        int n = new Scanner(System.in).nextInt();
        if (isPrimeNumber(n)) {
            System.out.println("Số bạn nhập là số nguyên tố");
        } else {
            System.out.println("Số bạn nhập không phải số nguyên tố");
        }
    }
}
