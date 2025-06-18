public class DaGiac {
    protected int soCanh;
    protected int[] kichThuoc;

    public DaGiac(int soCanh, int[] kichThuoc) {
        this.soCanh = soCanh;
        this.kichThuoc = kichThuoc;
    }

    public int tinhChuVi() {
        int chuVi = 0;
        for (int i = 0; i < soCanh; i++) {
            chuVi += kichThuoc[i];
        }
        return chuVi;
    }

    public void inCacCanh() {
        System.out.print("Cạnh: ");
        for (int i = 0; i < soCanh; i++) {
            System.out.print(kichThuoc[i] + " ");
        }
        System.out.println();
    }
}
