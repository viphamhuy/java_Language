import java.util.Scanner;

public class In100SNT {
    boolean checkPrime(int N) {
        if (N < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    return false;
                }
            }
        }
        return true;

    }

    void displayList(int number) {
        for (int N = 2; N <= number;N++) {
            if(checkPrime(N)){
                System.out.printf("%d ,",N);
            }

        }
    }

    public static void main(String[] args) {
        In100SNT x = new In100SNT();
        x.displayList(100);
        System.out.println(x);
    }
}
