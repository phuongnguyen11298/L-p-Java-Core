package BaiTapVeNha;

public class GiaiPTBacHai {
    public static void main(String[] args) {
        float a = -3;
        float b = 4;
        float c = 7;
        float delta = b*b - 4*a*c;
        System.out.println("Ta có phương trình bậc hai ax2 + bx + c = 0");
        System.out.println("Với a ="+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("Phương trình có nghiệm là x1= " + ((-b + Math.sqrt(delta))/(2*a)));
        System.out.println("Phương trình có nghiệm là x1= " + ((-b - Math.sqrt(delta))/(2*a)));


    }
}
