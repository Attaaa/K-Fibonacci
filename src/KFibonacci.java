import java.util.Scanner;

public class KFibonacci {

    int a;

    int FIB (int x, int y){

        if (x <= y){
            return 1;
        } else {
            for (int i = 1; i <= y ; i++) {
                a = a + FIB(x-i,y);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int k,n;

        Scanner in = new Scanner(System.in);

        System.out.print("Input N = ");
        n = in.nextInt();
        System.out.print("Input K = ");
        k = in.nextInt();

        KFibonacci M = new KFibonacci();

        System.out.println(M.FIB(n,k));
    }

}
