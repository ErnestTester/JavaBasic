import java.util.Scanner;

public class loneTeen {

    public static void main(String[] args)
    {
        System.out.println("Insert number 1");
        Scanner sc1=new Scanner(System.in) ;
        int x=sc1.nextInt();

        System.out.println("Insert number 2");
        Scanner sc2=new Scanner(System.in) ;
       int y= sc2.nextInt();
/*
        System.out.println("Insert number 3");
        Scanner sc3=new Scanner(System.in) ;
        int z=sc3.nextInt();*/

        System.out.println(Teen(x,y));

    }

    public  static boolean Teen(int a, int b)
    {
        if((a>=13)||(a<=19) && (b>=13)||(b<=19))
        {
            return  true;
        }
        else
        {
            return  false;
        }


    }
}

