package BaiTapVeNha;

public class TimSoLonNhatTrongBonSo {
    public static void main(String[] args) {
        float a = 4.6f;
        float b = 7;
        float c = 9;
        float d = 5.9f;
        float max = Math.max(b, Math.max(a, Math.max(c,d)));
        System.out.println("Số lớn nhất trong bốn số là " + max);
    }
}
