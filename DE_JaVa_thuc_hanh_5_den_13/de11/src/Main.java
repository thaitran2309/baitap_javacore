import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập nội dung văn bản: ");
        String input = scanner.nextLine();

        VanBan vb = new VanBan(input);

        System.out.println("Số từ: " + vb.demSoTu());
        System.out.println("Số ký tự 'H' (không phân biệt hoa/thường): " + vb.demSoKyTuH());
        System.out.println("Chuỗi sau chuẩn hoá: \"" + vb.chuanHoa() + "\"");

        scanner.close();
    }
}
