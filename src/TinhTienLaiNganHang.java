import java.util.Scanner;

public class TinhTienLaiNganHang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số tiền cho vay : ");
        double soTienVay = scanner.nextDouble();
        System.out.println("Tỉ lệ lãi suất theo tháng : ");
        double laiSuat = scanner.nextDouble() / 100;
        System.out.println("Số tháng cho vay : ");
        int soThangVay = scanner.nextInt();

        double tongTienLaiPhaiTra = 0;

        for(int i = 0; i < soThangVay; i++){
            tongTienLaiPhaiTra += (soTienVay + tongTienLaiPhaiTra) * laiSuat / 12;
        }

        System.out.println("Tổng số lãi phải trả : " + tongTienLaiPhaiTra);
    }
}
