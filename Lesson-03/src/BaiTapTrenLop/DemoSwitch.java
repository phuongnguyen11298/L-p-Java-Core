package BaiTapTrenLop;

import java.util.Scanner;

public class DemoSwitch {
    public static void main(String[] args) {
        System.out.println("Insert a number between 2 and 8: ");
        int day = new Scanner(System.in).nextInt();

        switch (day) {
            case 2:
                System.out.println("It's monday ");
                break;
            case 3:
                System.out.println("It's tuesday");
                break;
            case 4:
                System.out.println("It's wednesday ");
                break;
            case 5:
                System.out.println("It's thursday ");
                break;
            case 6:
                System.out.println("It's friday");
                break;
            case 7:
                System.out.println("It's saturday");
                break;
            case 8:
                System.out.println("It's sunday");
                break;

        }
    }
}
