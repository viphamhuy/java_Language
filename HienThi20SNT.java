public class HienThi20SNT {
    boolean checkPrime(int N){
        if(N<2){
            return false;
        }
        else {
            for(int i=2;i<=Math.sqrt(N);i++){
                if(N%i==0)
                {
                    return  false;
                }
            }
        }
        return true;
    }
    void displayList(int number){
        int N=2;
        for(int count=1;count<=number;)
        {
            if(checkPrime(N)){
                System.out.printf("%d ,",N);
                count++;
            }
            N++;
        }
    }
    public static void main(String[] args) {
        HienThi20SNT x = new HienThi20SNT();
        x.displayList(20);
        System.out.println(x);
    }
}
