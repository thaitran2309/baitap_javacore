import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NguoiDAO {
    public List<Nguoi> getAll() {
        List<Nguoi> ds = new ArrayList<>();
        String sql = "SELECT * FROM nguoi";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Nguoi n = new Nguoi(
                        rs.getInt("id"),
                        rs.getString("ho_ten"),
                        rs.getString("ngay_sinh"),
                        rs.getString("nghe_nghiep")
                );
                ds.add(n);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ds;
    }

    public List<Nguoi> getNguoiThuongTho() {
        List<Nguoi> ds = new ArrayList<>();
        String sql = "SELECT * FROM nguoi WHERE TIMESTAMPDIFF(YEAR, ngay_sinh, CURDATE()) >= 80";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                ds.add(new Nguoi(
                        rs.getInt("id"),
                        rs.getString("ho_ten"),
                        rs.getString("ngay_sinh"),
                        rs.getString("nghe_nghiep")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ds;
    }
}
