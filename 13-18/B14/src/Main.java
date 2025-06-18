import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng tam giác: ");
        int n = sc.nextInt();

        List<TamGiac> danhSach = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập cạnh tam giác thứ " + (i + 1) + ":");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            TamGiac tg = new TamGiac(a, b, c);
            if (tg.laTamGiacHopLe()) {
                danhSach.add(tg);
            } else {
                System.out.println("Không phải tam giác hợp lệ, bỏ qua.");
            }
        }

        // Tìm diện tích lớn nhất
        double maxDienTich = 0;
        for (TamGiac tg : danhSach) {
            double dt = tg.tinhDienTich();
            if (dt > maxDienTich) {
                maxDienTich = dt;
            }
        }

        // In các tam giác có diện tích lớn nhất
        System.out.println("Tam giác có diện tích lớn nhất:");
        for (TamGiac tg : danhSach) {
            if (tg.tinhDienTich() == maxDienTich) {
                tg.inCacCanh();
                System.out.println("Diện tích: " + tg.tinhDienTich());
            }
        }
    }
}
