import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Width : ");
        width = sc.nextFloat();
        System.out.println("Height : ");
        height = sc.nextFloat();
        float area = width * height;
    }
}
