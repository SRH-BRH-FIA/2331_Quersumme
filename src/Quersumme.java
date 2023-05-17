import java.util.Scanner;

public class Quersumme {
    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);
        System.out.print("Bitte Zahl eingeben: ");
        int zahl = eingabe.nextInt();

        int quersumme = 0;
        while (zahl > 0) {
            int ziffer = zahl % 10;
            zahl = zahl / 10;
            quersumme += ziffer;
            System.out.print(ziffer);
            if (zahl > 0) System.out.print(" + ");
        }

        System.out.println(" = " + quersumme);
    }
}
