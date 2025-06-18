public class Main {
    public static void main(String[] args) {
        HCN hcn1 = new HCN(4, 5);
        HCN hcn2 = new HCN(10, 2);

        System.out.println("HCN 1:");
        hcn1.inThongTin();

        System.out.println("\nHCN 2:");
        hcn2.inThongTin();

        // So sánh bằng equals (diện tích)
        if (hcn1.equals(hcn2)) {
            System.out.println("\nHai hình chữ nhật có cùng diện tích.");
        } else {
            System.out.println("\nHai hình chữ nhật KHÁC diện tích.");
        }

        // So sánh bằng compareTo
        int kq = hcn1.compareTo(hcn2);
        if (kq > 0) {
            System.out.println("HCN 1 lớn hơn HCN 2 (về diện tích).");
        } else if (kq < 0) {
            System.out.println("HCN 1 nhỏ hơn HCN 2 (về diện tích).");
        } else {
            System.out.println("HCN 1 bằng HCN 2 (về diện tích).");
        }
    }
}
