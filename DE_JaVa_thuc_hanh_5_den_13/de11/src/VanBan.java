public class VanBan {
    private String noiDung;

    public VanBan() {
        this.noiDung = "";
    }

    public VanBan(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    // Đếm số từ trong xâu
    public int demSoTu() {
        if (noiDung == null || noiDung.trim().isEmpty()) {
            return 0;
        }
        String[] tu = noiDung.trim().split("\\s+");
        return tu.length;
    }

    // Đếm số ký tự 'H' không phân biệt hoa thường
    public int demSoKyTuH() {
        int dem = 0;
        for (int i = 0; i < noiDung.length(); i++) {
            char c = Character.toLowerCase(noiDung.charAt(i));
            if (c == 'h') {
                dem++;
            }
        }
        return dem;
    }

    // Chuẩn hoá xâu
    public String chuanHoa() {
        if (noiDung == null) return "";
        noiDung = noiDung.trim();
        noiDung = noiDung.replaceAll("\\s+", " ");
        return noiDung;
    }
}
