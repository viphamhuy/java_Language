import java.util.Scanner;
public class HelloDislay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Hello: " + name);
    }
}
