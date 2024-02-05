public class Assignment_Operators {

    static int speed=80; //speed variable gets the value of 80
    static int distance = 20; // distance variable gets the value 20
    static int time = 10; // time variable gets the value 10
    static String name = "JAVA"; // name variable gets the value ToolsQA
    static boolean isGood = true; // isGood variable gets the value true
    public static void main(String[] args) {

        System.out.println("Value stored in the speed variable is : " + speed);
        System.out.println("Value stored in the distance variable is : " + distance);
        System.out.println("Value stored in the time variable is : " + time);
        System.out.println("Value stored in the name variable is : " + name);
        System.out.println("Value stored in the isGood variable is : " + isGood);

        System.out.println();
        System.out.println("****Over witten values****");
        speed=100;
        time=distance;
        name="ForumSQA";
        isGood=false;
        System.out.println("Value stored in value is:"+ speed);
        System.out.println("Value stored in distance is"+ distance);
        System.out.println("Value stored in time is:"+ time);
        System.out.println("Value stored in name is:"+ name);
        System.out.println("Value stored in isGood is:"+isGood);

    }
}
