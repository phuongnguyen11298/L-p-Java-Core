package BaiTapTrenLop;

public class GiaiPTBacNhatvsMoia {
    public static void main(String[] args) {
        int a = 9;
        int b = 6;
        String ketluan = a!= 0 ? (-b/(double) a) + "" : b!=0? "Phương trình vô số nghiệm":"Phương trình vô nghiệm";
        System.out.println(ketluan); //Cách của thầy


        String s = "Phương trình có nghiệm duy nhất là " + (-b/(double)a);
        s = (a == 0) ? "Pt vô nghiệm" : s;
        s = a==0 && b==0 ? "Phương trình vô số nghiệm": s;
        System.out.println(s); //Tự làm

    }
}
