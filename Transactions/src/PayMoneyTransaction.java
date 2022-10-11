import java.lang.*;
import java.util.Scanner;

public class PayMoneyTransaction{
    public static void Currency(int amount)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the currency denominations");
        int size = sc.nextInt();
        int[] noteCounter = new int[size];
        System.out.println("Enter the currency denomination value");
        int[] notes = new int[size];
        for(int i=0; i<size; i++)
        {
            notes[i]=sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }
        System.out.println("Currency Count ->");
        for (int i = 0; i < size; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i]);
            }
        }
    }
    public static void main(String argc[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to pay");
        int amount = sc.nextInt();
        Currency(amount);
    }
}