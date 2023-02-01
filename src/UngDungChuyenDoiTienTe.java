import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi Ban Nhap So Tien USD : ");
        double USD = scanner.nextDouble();
        double VND = USD*23000;
        System.out.print("Ket Qua La : "+VND+" VND");
    }
}
