import java.util.Scanner;

public class InputArray {

    public static void main(String[] args)
    {

        Scanner scan=new Scanner(System.in);

        int []arr=new int[5];

        System.out.println("Default values of the array");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i] + "\t");
        }

        System.out.println("Enter " + arr.length + " integer values");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=scan.nextInt();
        }

        System.out.println("Array has been completed");

        System.out.println("The array elements are:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + "\t");
        }

    }
}
