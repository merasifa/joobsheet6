import java.util.Scanner;

public class buku28 {
    public static void main(String[] args) {
        Scanner input28 = new Scanner (System.in);
        // mendeklarasikan variabel yang dibutuhkan
        int harga, jumlahBuku, total;
        double diskon;
        String jenisBuku;

        System.out.print("Masukkan jenis buku: "); // untuk menampilkan pesan "masukkan jenis buku"
        jenisBuku = input28.nextLine(); // menginputkan jenis buku
        System.out.print("Masukkan harga buku: "); // untuk menampilkan pesan "masukkan harga buku"
        harga = input28.nextInt(); // menginputkan harga buku
        System.out.print("Masukkan jumlah buku: "); // untuk menampilkan pesan "masukkan jumlah buku"
        jumlahBuku = input28.nextInt(); // menginputkan jumlah buku

        if(jenisBuku.equalsIgnoreCase("kamus")) { // jika jenis buku yang diinputkan adalah kamus
            if(jumlahBuku > 2){ // dan jika jumlahnya lebih dari 2 maka mendapatkan diskon 0.12
                diskon = 0.12;
            }else{              // dan jika jumlahnya kurang dari 2 maka mendapatkan diskon 0.1
                diskon = 0.1;
            
            } 

         }else if(jenisBuku.equalsIgnoreCase("novel")) { // jika jenis buku yang diinputkan adalah novel
            if(jumlahBuku  > 3){ // jika jumlahnya lebih dari 3 maka mendapatkan diskon 0.09
                diskon = 0.09;
            }else{ // jika jumlahnya kurang dari 3 maka mendapatkan diskon 0.08
                diskon = 0.08;

            }

         }else if (jumlahBuku >3){ // jika jenis buku yang diinputkan bukan kamus dan novel dan pembeliannya lebih dari 3
                    diskon = 0.05; // maka mendapat diskon 0.05
         } else //jika jenis buku yang diinputkan bukan kamus dan novel dan pembeliannya kurang dari 3
            diskon = 0; // maka mendapat diskon 0

            total = (int) (jumlahBuku * harga - (diskon *jumlahBuku * harga)); // perhitungan

            System.out.println("Jumlah Diskon = " + diskon *jumlahBuku * harga);
            System.out.println("Total yang harus dibayarkan = " + total);

    }
}
