public class Arithmetic_Operators {
    public static void main(String[] args)
    {
        //Declaration of multiple variables same type
        int a, b=10, c=5;
        a=b+c;
        System.out.println("Value of 'a' after '+' Arithmetic Operation is "+a);
        a=b-c;
        System.out.println("Value of 'a' after '-' Arithmetic Operation is "+a);
        a=b*c;
        System.out.println("Value of 'a' after '*' Arithmetic Operation is "+a);
        a=b/c;
        System.out.println("Value of 'a' after '/' Arithmetic Operation is "+a);
        a=b%c;
        System.out.println("Value of 'a' after '%' Arithmetic Operation is "+a);
        b++;
        System.out.println("Value of 'b' after '++' Arithmetic Operation is "+b);
        c--;
        System.out.println("Value of 'c' after '--' Arithmetic Operation is "+c);
    }
}
