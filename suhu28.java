import java.util.Scanner;

public class suhu28 {
    public static void main(String[] args) {
         Scanner input28 = new Scanner (System.in);

         int suhu;
         char hujan;

         System.out.print("Masukkan suhu: ");
         suhu = input28.nextInt();
         System.out.print("Masukkan status: (hujan atau tidak)");
         hujan = input28.next().charAt(0);

         if (suhu > 27) {
            System.out.println("Memakai Dress");
         if (hujan == 'y' || hujan== 'Y') {
            System.out.println("Membawa Payung");

         }else {
            System.out.println("Memakai Sunscreen");
         }
    }else{
        System.out.println("Memakai Celana Panjang");
    }
    
}
}