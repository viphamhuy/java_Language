import java.util.Scanner;
public class DoiTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so tien USD: ");
        double vnd=23000;
        double usd;
        usd = sc.nextDouble();
        double quydoi= usd * vnd;
        System.out.println("SO tien la: "+quydoi +" vnd");
    }
}
