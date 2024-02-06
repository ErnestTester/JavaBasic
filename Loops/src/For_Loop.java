public class For_Loop {

    public static void main(String[] args) {
        for (int Increment=0; Increment<=5; Increment++)
        {
            System.out.println("Count is: "+ Increment);
        }


        System.out.println("***NEXT COUNT***");

        for (int Decrement=5; Decrement>=0; Decrement--)
        {
            System.out.println("Count is: "+ Decrement);
        }

        System.out.println("***NEXT COUNT***");

        for (int Increment=0; Increment<=10; Increment+=2)
        {
            System.out.println("Count is: "+ Increment);
        }
    }
}
