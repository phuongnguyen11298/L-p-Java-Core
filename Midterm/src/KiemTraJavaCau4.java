public class KiemTraJavaCau4 {
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
        for (int i = 0; i < 10; i++) {
            if (isPrimeNumber(i)) {
                System.out.println("Số nguyên tố nhỏ hơn 10 là: " + i);

            }
        }
        int n = 10;
        int dem = 0;
        int j = 2;
        while (dem < n) {
            if (isPrimeNumber(j)) {
                System.out.print(j + " ");
                dem++;
            }
            j++;

        }

    }
}


