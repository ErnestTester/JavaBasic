public class InsertString {
    public static void main(String[] args)
    {
        // Get the Strings
        String s1 = "This is a example of java programming!";
        String s2 = "Class ";
        int index = 4;

        System.out.println("Original String: " + s1);
        System.out.println("String to be inserted: " + s2);
        System.out.println("String to be inserted at index: " + index);
        System.out.println("Modified String: " + insertString(s1, s2, index));
    }

    public static String insertString(String s1, String s2, int index)
    {
        // Create a new string
        String newString = new String();

        for (int i = 0; i < s1.length(); i++) {

            // Insert the original string character
            // into the new string
            newString += s1.charAt(i);

            if (i == index) {

                // Insert the string to be inserted
                // into the new string
                newString += s2;
            }
        }

        // return the modified String
        return newString;
    }
}
