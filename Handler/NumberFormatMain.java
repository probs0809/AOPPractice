import java.util.Scanner;

public class NumberFormatMain{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number: ");
        String number = s.nextLine();
        try{
            int a = Integer.parseInt(number);
        }catch(NumberFormatException e){

        }
    }
}