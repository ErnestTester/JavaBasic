
import java.util.Scanner;

public class Diff21 {

    public static void main(String[] args)
    {
        System.out.println("Insert the x number;");
        Scanner sc = new Scanner(System.in);
        int intNum = sc.nextInt();

        System.out.println( diff21(intNum));
    }

    public static int diff21(int n)
    {
        int number;
        if(n >21)
        {
            number=Math.abs(n-21);
            number*=2;
            return number;
        }
        else
        {
            number=Math.abs(n-21);
            return number;
        }
    }
}
