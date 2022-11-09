package BaiTapVeNha;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class TinhTuoi {
    public static void main(String[] args) {

        System.out.println("Nhập Năm - Tháng - Ngày sinh của người đó: ");
        Scanner scanner= new Scanner(System.in);
        String input =scanner.nextLine();
        scanner.close();
        LocalDate dob = LocalDate.parse(input);
        System.out.println("Người đó " +calculateAge(dob)+ " tuổi");

    }

    private static int calculateAge(LocalDate dob) {
        LocalDate curDate = LocalDate.now();
        if ((dob != null) && (curDate != null))
        {
            return Period.between(dob, curDate).getYears();
        }
        else
        {
            return 0;
        }

    }
}
