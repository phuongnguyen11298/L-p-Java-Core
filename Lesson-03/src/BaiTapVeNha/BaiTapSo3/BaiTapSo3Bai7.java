package BaiTapVeNha.BaiTapSo3;

public class BaiTapSo3Bai7 {
    public static void main(String[] args) {
        int width = 5;
        int height = 4;
        for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= width; j++) {
                    if (i == 1 || i == height || j == 1 || j == width)
                        System.out.print("*  ");
                    else
                        System.out.print("   ");
                }
                System.out.println("");
            }

        }
    }







