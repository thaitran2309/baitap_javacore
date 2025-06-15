import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLPTGT ql = new QLPTGT();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhập đăng ký phương tiện");
            System.out.println("2. Tìm phương tiện theo màu");
            System.out.println("3. Tìm phương tiện theo năm sản xuất");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    ql.nhapPhuongTien();
                    break;
                case 2:
                    System.out.print("Nhập màu cần tìm: ");
                    String mau = sc.nextLine();
                    ql.timTheoMau(mau);
                    break;
                case 3:
                    System.out.print("Nhập năm sản xuất cần tìm: ");
                    int nam = Integer.parseInt(sc.nextLine());
                    ql.timTheoNam(nam);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Chọn sai!");
            }
        } while (chon != 0);
    }
}
