import java.util.Scanner;

public class PowerModules {
    static int powermod(int A,int B,int C){
        A=A%C;
        int result=1;
        for (int i=1;i<=B;i++){
            result=(result*A)%C;
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number_A=scan.nextInt();
        int number_B= scan.nextInt();
        int number_C= scan.nextInt();
        System.out.println(powermod(number_A,number_B,number_C));
    }
}
