public class Continue_Loop {

    public static void main(String[] args) {

        for(int i=0; i <=10; i++)
        {
            if(i==3)
            {
                continue;
            }
            System.out.println("Iteration :" + i);
        }

        System.out.println("NEXT LOOP");
        for(int i=0; i <=10; i++)
        {
            if(i==3)
            {
                System.out.println("Iteration :" + i);
                continue;
            }

        }
    }
}
