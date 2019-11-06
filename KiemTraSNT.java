import java.util.Scanner;

public class KiemTraSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần kiểm tra: ");
        int prime = scanner.nextInt();
        if (prime < 2) {
            System.out.println(prime + " không là số nguyên tố");
        } else {
            int i = 2;
            boolean check = true;
            for (; i <= Math.sqrt(prime); i++) {
                if (prime % i == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.println(prime + " là số nguyên tố");
            } else {
                System.out.println(prime + " không là số nguyên tố");
            }
        }
    }
}
