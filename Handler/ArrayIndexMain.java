import java.util.Scanner;
public class ArrayIndexMain{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Index: ");
        int i = s.nextInt();
        try{
            System.out.println("The no is " + arr[i]);
        }catch(ArrayIndexOutOfBoundsException e){

        }

    }
}