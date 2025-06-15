import java.util.ArrayList;
import java.util.Scanner;

public class QLPTGT {
    private ArrayList<PTGT> danhSach = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void nhapPhuongTien() {
        System.out.println("Chọn loại phương tiện (1. Ô tô, 2. Xe máy, 3. Xe tải): ");
        int chon = Integer.parseInt(sc.nextLine());

        System.out.print("Hãng sản xuất: ");
        String hang = sc.nextLine();
        System.out.print("Năm sản xuất: ");
        int nam = Integer.parseInt(sc.nextLine());
        System.out.print("Giá bán: ");
        double gia = Double.parseDouble(sc.nextLine());
        System.out.print("Màu: ");
        String mau = sc.nextLine();

        switch (chon) {
            case 1:
                System.out.print("Số chỗ: ");
                int soCho = Integer.parseInt(sc.nextLine());
                System.out.print("Kiểu động cơ: ");
                String dongCo = sc.nextLine();
                danhSach.add(new OTo(hang, nam, gia, mau, soCho, dongCo));
                break;
            case 2:
                System.out.print("Công suất: ");
                double cs = Double.parseDouble(sc.nextLine());
                danhSach.add(new XeMay(hang, nam, gia, mau, cs));
                break;
            case 3:
                System.out.print("Trọng tải: ");
                double tt = Double.parseDouble(sc.nextLine());
                danhSach.add(new XeTai(hang, nam, gia, mau, tt));
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
    }

    public void timTheoMau(String mauTim) {
        System.out.println("Các phương tiện có màu: " + mauTim);
        for (PTGT pt : danhSach) {
            if (pt.getMau().equalsIgnoreCase(mauTim)) {
                pt.hienThi();
                System.out.println("------------------");
            }
        }
    }

    public void timTheoNam(int namTim) {
        System.out.println("Các phương tiện sản xuất năm: " + namTim);
        for (PTGT pt : danhSach) {
            if (pt.getNamSanXuat() == namTim) {
                pt.hienThi();
                System.out.println("------------------");
            }
        }
    }
}
