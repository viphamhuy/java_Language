import java.util.Scanner;
public class TienLai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money;
        int month;
        double interset_rate;
        System.out.println("Nhập số tiền gửi: ");
        money = scanner.nextDouble();
        System.out.println("Nhập số tháng gửi: ");
        month = scanner.nextInt();
        System.out.println("Nhập lãi suất: ");
        interset_rate = scanner.nextDouble();
        double total_interset=0;
        for(int i=0;i<month;i++){
            total_interset = money*(interset_rate/100)/12*month;
        }
        System.out.println("Số tiền lãi nhận được: " + total_interset);
    }
}
