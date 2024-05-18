import java.util.Scanner;

public class missingChar {

    public static void main(String[] args) {
        System.out.println("Inserte la cadena");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("Inserte la posicion:");
        Scanner sc1 = new Scanner(System.in);
        int pos = sc1.nextInt();
        System.out.println(missingCharFind(str, pos));
    }

    public static String missingCharFind(String str, int n) {
        String strIni = str.substring(0, n);
        // System.out.println(strIni);
        int end=str.length();
        String strEnd = str.substring(n + 1,end);
        return strIni + strEnd;

    }

}


