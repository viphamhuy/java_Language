import java.util.Scanner;
public class UCLN {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        a = scanner.nextInt();
        System.out.println("Nhập b: ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0||b==0)
            System.out.println("Không có ước chung");
        while (a!=b){
            if(a>b){
                a = a-b;
            }
            else {
                b = b-a;
            }
        }
        System.out.println("Ước chung lớn nhất của a&b là: "+a);
    }
}
