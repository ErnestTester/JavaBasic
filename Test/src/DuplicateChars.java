public class DuplicateChars {

    public static void main(String[] args)
    {

        String s1="Amma";
        String s2=new String();
        int j=0;

        for(int i=0; i<s1.length(); i++)
        {
            if(i==0)
            {
                s2=s2+s1.charAt(0);
            }
            for(int k=0; k<s2.length(); k++)
            {
                if(s1.charAt(i)!=s2.charAt(j))
                {
                    s2=s2+s1.charAt(i);
                    j++;
                    continue;
                }
            }

        }

        System.out.println("String:"+s2);

    }
}
