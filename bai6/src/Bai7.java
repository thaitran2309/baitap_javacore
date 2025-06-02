import java.util.Scanner;
/// / chia chuoi
 public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        String[] words = str.trim().split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
