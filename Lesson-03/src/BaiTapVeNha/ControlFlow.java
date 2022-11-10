package BaiTapVeNha;

public class ControlFlow {
    public static void main(String[] args) {
        String string = "Hello every one";
        System.out.println("Ta có chuỗi: " + string);
        int count = 0;
        char kytu = 'e';
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == kytu) {
                count++;
            }
        }
        System.out.println("Tổng số ký tự của e trong chuỗi là: " + count);

    }

}

