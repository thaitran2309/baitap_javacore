import java.util.Scanner;
// dem so lan xuat hien ky tu
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine().toLowerCase();

        System.out.print("Nhập ký tự cần đếm: ");
        char ch = sc.nextLine().toLowerCase().charAt(0);

        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) count++;
        }

        System.out.println("Ký tự '" + ch + "' xuất hiện " + count + " lần.");
    }
}
