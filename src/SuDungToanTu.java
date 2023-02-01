import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Chieu rong : ");
        width = scanner.nextFloat();
        System.out.println("Nhap Chieu Cao : ");
        height = scanner.nextFloat();
        float area = width*height;
        System.out.println("Dien Tich : " + area);
    }
}
