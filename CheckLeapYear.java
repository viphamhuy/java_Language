import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập năm cần kiểm tra:  ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " là năm nhuận");
                } else {
                    System.out.println(year + " không là năm nhuận");
                }
            } else {
                System.out.println(year + " là năm nhuận");
            }
        } else {
            System.out.println(year + " không là năm nhuận");
        }
    }
}
