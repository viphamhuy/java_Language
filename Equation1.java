import java.util.Scanner;

public class Equation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Phương trình có 1 nghiệm x = %f!\n", answer);
        } else {
            if (b == 0) {
                System.out.printf("Phương trình có vô số nghiệm x!");
            } else {
                System.out.printf("Phương trình vô nghiệm");
            }
        }
    }
}
