public class While_Loop {
    public static void main(String[] args) {
        {
            int Count=0;
            while(Count <25)
            {
                Count +=5;
                System.out.println("Count value: "+Count);
            }

            System.out.println("NEXT ITERATION");
            int CountOnce=25;
            while(CountOnce <25)
            {
                CountOnce +=5;
                System.out.println("Count value: "+CountOnce);
            }
        }

    }
}
