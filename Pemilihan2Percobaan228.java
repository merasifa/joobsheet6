/**
 * Pemilihan2Percobaan228
 */
import java.util.Scanner;
public class Pemilihan2Percobaan228 {

    public static void main(String[] args) {
        Scanner input28 = new Scanner (System.in);
        float sudut1, sudut2, sudut3, totalSudut;

        System.out.print("Masukkan sudut 1 : ");
        sudut1 = input28.nextFloat();
        System.out.print("Masukkan sudut 2 : ");
        sudut2 = input28.nextFloat();
        System.out.print("Masukkan sudut 3 : ");
        sudut3 = input28.nextFloat();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 ==90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        } else
            System.out.println("Bukan Segitiga");
        }
    }
