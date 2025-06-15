public class Nguoi {
    private int id;
    private String hoTen;
    private String ngaySinh;
    private String ngheNghiep;

    public Nguoi(int id, String hoTen, String ngaySinh, String ngheNghiep) {
        this.id = id;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.ngheNghiep = ngheNghiep;
    }

    @Override
    public String toString() {
        return hoTen + " | Ngày sinh: " + ngaySinh + " | Nghề nghiệp: " + ngheNghiep;
    }
}
