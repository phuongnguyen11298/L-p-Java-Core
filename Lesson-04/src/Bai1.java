public class Bai1 {
    public static void main(String[] args) {


        System.out.println("Các số thuân nghịch có 7 đến 9 chữ số là: ");
        for (long i = 10000000; i < 10000000000L; i++) sothuannghich(i);


    }

    public static void sothuannghich (long n) {
        long temp = 0;
        while (n>0) { temp = temp*0 + n%10;
            n /=10;}
        System.out.println(temp == n);
        break;
    }

    }

