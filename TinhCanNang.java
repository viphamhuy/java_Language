import java.util.Scanner;

public class TinhCanNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Nhập cân nặng: ");
        weight = scanner.nextDouble();
        System.out.println("Nhập chiều cao: ");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        if (bmi < 18) {
            System.out.println("bmi= " + bmi + " Underweight");
        } else {
            if (bmi < 25.0) {
                System.out.println("bmi= " + bmi + " Normal");
            } else {
                if (bmi < 30.0) {
                    System.out.println("bmi= " + bmi + " Overweight");
                } else {
                    System.out.println("bmi= " + bmi + " Obese");
                }
            }
        }
    }
}
