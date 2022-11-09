package BaiTapTrenLop;

public class ToanTuBaNgoiDemoBieuthuc {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        String s = (a%b==0) ? "a chia hết cho b" : "a không chia hết cho b";
        System.out.println(s);
        String ketluan = a > 0 ? "dương" : "âm";
        System.out.println("a là số " +ketluan);
       //hết bài 1//

        String conclusion = (a==0) ? "a = 0":(a>0)? "dương":"âm";
        System.out.println(conclusion); //Cách 1//

        String s1 = "số 0";
        s1 = (a>0) ? "số dương":s1;
        s1 = (a<0) ? "số âm":s1;
        System.out.println(s1); //Cách 2//



    }
}
