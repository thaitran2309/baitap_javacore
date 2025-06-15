import java.util.List;

public class Main {
    public static void main(String[] args) {
        NguoiDAO dao = new NguoiDAO();

        System.out.println("📋 Danh sách tất cả người trong khu phố:");
        List<Nguoi> all = dao.getAll();
        for (Nguoi n : all) {
            System.out.println(n);
        }

        System.out.println("\n🎉 Người mừng thượng thọ (≥ 80 tuổi):");
        List<Nguoi> thuongTho = dao.getNguoiThuongTho();
        for (Nguoi n : thuongTho) {
            System.out.println(n);
        }
    }
}
