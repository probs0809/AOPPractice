import java.util.Scanner;

public class HandlerMain{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter numerator: ");
        int numerator = s.nextInt();
        System.out.println("Enter Denominator: ");
        int denominator = s.nextInt();
        try{
            System.out.println("Result: " + numerator/denominator);
        }catch(ArithmeticException e){

        }
    }
}