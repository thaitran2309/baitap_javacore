///LaiSuatKep
public class bai5 {
    public static void main(String[] args) {
        double p = 1000;
        double r1 = 0.05;
        double r2 = 0.03;
        double amount = p * (1 + r1) * (1 + r2);
        System.out.println("Số tiền sau lãi suất kép là: " + amount);
    }
}