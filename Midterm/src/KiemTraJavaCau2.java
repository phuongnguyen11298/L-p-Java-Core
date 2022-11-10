

public class KiemTraJavaCau2 {
    public static void main(String[] args) {

        String string = "You only live once, but if you do it right, once is enough";
        System.out.println("Ta có String: " + string);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            count++;
        }
        System.out.println("Tổng số từ trong String này là: " + count);
        char kytu = 'o';
        int count2 = 0;
        for (int j = 0; j < string.length(); j++) {
            if (string.charAt(j) == kytu) {
                count2++;
            }
        }
        System.out.println("Số lần xuất hiện ký tự " + kytu + " là: " + count2);
        int index = string.indexOf(kytu);
        while (index != -1) {
            System.out.println("Thứ tự chữ cái o trong chuỗi là: " + index);
            index = string.indexOf(kytu, index + 1);
        }
    }
}



