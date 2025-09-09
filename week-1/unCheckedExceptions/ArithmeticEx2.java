import  java.util.Scanner;
public class ArithmeticEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numerator:");
        int n = sc.nextInt();

        System.out.println("Enter the Denominator:");
        int d = sc.nextInt();
        try{
        int ans = n/d;
        System.out.println("Result is:"+ans);
    }catch(ArithmeticException ae){
        System.out.println("Can't divide by zero:"+ae);
    }

}
}
