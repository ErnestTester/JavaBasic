public class Array_Example2
{

    public static void main(String[] args)
    {
        String []sMake={"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};

        int iLength;
        iLength=sMake.length;
        System.out.println("The length of the Array is: "+ iLength);
        System.out.println("sMake: " + sMake[1]);

        for(int i = 0;i<=iLength-1;i++){
            System.out.println("The value stored at position "+i+" in aMake array is ==> " + sMake[i]);
        }
    }


}
