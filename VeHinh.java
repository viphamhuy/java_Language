import java.util.Scanner;
public class VeHinh {


    public static void main(String[] args) {

        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        while (true){
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    for(int i=1;i<4;i++) {
                        for (int j = 1; j <8; j++) {
                            System.out.printf("*");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 2:
                    for(int i=1;i<6;i++){
                        for(int j=1;j<=i;j++){
                            System.out.printf("*");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 3:
                    for(int i=1;i<6;i++){
                        for(int j=5;j>=i;j--){
                            System.out.printf("*");
                        }
                        System.out.printf("\n");
                    }
                    break;

            }
        }
    }
}
