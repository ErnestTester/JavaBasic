public class SleepIn
{
    public static void main(String[] args)
    {
        System.out.println("Sleep");
        System.out.println(SleepIn(true, true));
    }

    public static boolean SleepIn(boolean weekday, boolean vacation)
    {
        if((!weekday)||( vacation)) //This sentence !weekend is equals to Weekend==false
        {
            return  true;
        }
        else
        {
            return  false;
        }
    }
}
