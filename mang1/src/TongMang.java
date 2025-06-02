import java.util.Scanner;

public class TongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Nhập mảng
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Tính tổng
        int tong = 0;
        for (int num : arr) {
            tong += num;
        }

        System.out.println("Tổng các phần tử là: " + tong);
    }
}
