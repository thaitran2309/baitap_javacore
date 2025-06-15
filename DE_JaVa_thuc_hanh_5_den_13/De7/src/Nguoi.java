import java.util.Date;

public class Nguoi {
    private String hoTen;
    private Date ngaySinh;
    private String queQuan;

    public Nguoi(String hoTen, Date ngaySinh, String queQuan) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void hienThiThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Quê quán: " + queQuan);
    }
}
