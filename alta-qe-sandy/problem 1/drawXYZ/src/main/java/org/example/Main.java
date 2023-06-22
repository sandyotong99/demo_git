import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String opsi;
        do {
            System.out.println("Masukkan angka : ");
            int angka = input.nextInt();
            baris(angka);
            System.out.println("Hitung lagi gak nih? (y/n) : ");
            opsi = input.next();
        } while (opsi.equalsIgnoreCase("y"));
        System.out.println("                    *                    ");
        System.out.println("                *  Good *                ");
        System.out.println("              *    Bye    *               ");
        System.out.println("               *   See   *                ");
        System.out.println("                 * You *                  ");
        System.out.println("                    *                     ");
    }

    private static void baris(int angka) {

        int huruf = 1;
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= angka; j++) {
                System.out.print(jawaban(huruf) + " ");
                huruf++;
            }System.out.println();
            System.out.println("===============================");
        }
    }

    private static char jawaban(int huruf) {
        char result;
        if (huruf % 3 == 0) {
            result = 'X';
        } else if (huruf % 2 == 0) {
            result = 'Z';
        } else {
            result = 'Y';
        }
        return result;
    }
}
