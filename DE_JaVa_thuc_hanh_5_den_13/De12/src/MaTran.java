import java.util.Scanner;

public class MaTran {
    private int soDong;
    private int soCot;
    private int[][] duLieu;

    // Toán tử tạo lập không tham số
    public MaTran() {
        this.soDong = 0;
        this.soCot = 0;
        this.duLieu = new int[0][0];
    }

    // Toán tử tạo lập có tham số
    public MaTran(int n, int m) {
        this.soDong = n;
        this.soCot = m;
        this.duLieu = new int[n][m];
    }

    // Phương thức nhập ma trận
    public void nhap(Scanner sc) {
        System.out.println("Nhập phần tử cho ma trận có " + soDong + " dòng và " + soCot + " cột:");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                duLieu[i][j] = sc.nextInt();
            }
        }
    }

    // Phương thức hiển thị ma trận
    public void hienThi() {
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(duLieu[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Phương thức cộng 2 ma trận
    public MaTran cong(MaTran m2) {
        if (this.soDong != m2.soDong || this.soCot != m2.soCot) {
            System.out.println("Không thể cộng ma trận: kích thước không khớp.");
            return null;
        }
        MaTran tong = new MaTran(soDong, soCot);
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                tong.duLieu[i][j] = this.duLieu[i][j] + m2.duLieu[i][j];
            }
        }
        return tong;
    }

    // Phương thức trừ 2 ma trận
    public MaTran hieu(MaTran m2) {
        if (this.soDong != m2.soDong || this.soCot != m2.soCot) {
            System.out.println("Không thể trừ ma trận: kích thước không khớp.");
            return null;
        }
        MaTran hieu = new MaTran(soDong, soCot);
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                hieu.duLieu[i][j] = this.duLieu[i][j] - m2.duLieu[i][j];
            }
        }
        return hieu;
    }

    // Phương thức nhân 2 ma trận
    public MaTran tich(MaTran m2) {
        if (this.soCot != m2.soDong) {
            System.out.println("Không thể nhân ma trận: số cột A phải bằng số dòng B.");
            return null;
        }
        MaTran tich = new MaTran(this.soDong, m2.soCot);
        for (int i = 0; i < this.soDong; i++) {
            for (int j = 0; j < m2.soCot; j++) {
                for (int k = 0; k < this.soCot; k++) {
                    tich.duLieu[i][j] += this.duLieu[i][k] * m2.duLieu[k][j];
                }
            }
        }
        return tich;
    }
}
