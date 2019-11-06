import java.util.Scanner;

public class TinhNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tháng: ");
        int month = scanner.nextInt();
        String string;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                string = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                string="30";
                break;
            case 2:
                string="28 or 29";
                break;
            default:
                string = "";
        }
        if(string!=""){
            System.out.printf("tháng %d có %s ngày",month,string);
        }
        else {
            System.out.print("Lỗi!!");
        }
    }
}
