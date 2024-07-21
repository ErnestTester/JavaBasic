import javax.sound.midi.Soundbank;

public class Array1 {
    public static void main(String[] args) {

        //defining  array
        int [] a={10,20,30,40,50};

        //display the size of the array
        System.out.println("Size = " +a.length);
        System.out.println("The code!...");
        System.out.println("Ernesto Olaez");
        System.out.println("Array elements:");
        for(int i=0;  i<a.length; i++)
        {
            System.out.println(a[i] + "\t");
        }
    }
}
