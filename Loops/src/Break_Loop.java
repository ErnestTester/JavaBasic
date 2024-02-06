public class Break_Loop {

    public static void main(String[] args) {

        for(int i=0; i <=10; i++)
        {
            if(i==6)
            {
                break;
            }
            System.out.println("Iteration :" + i);
        }
        System.out.println("You  have exited the loop.");
    }
}
