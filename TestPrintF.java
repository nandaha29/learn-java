import java.util.Scanner; // mengimpor Scanner ke program

public class TugasPrintF {
    public static void main(String[] args) {
        // deklarasi variabel
        String nama, asalKota;
        long nim;

        // membuat scanner baru
        Scanner inputnya = new Scanner(System.in);

        System.out.print("Halo, dengan siapa disana? ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = inputnya.nextLine();
        System.out.print("Asal mana nih? ");
        asalKota = inputnya.nextLine();
        System.out.print("NIM nya berapa? ");
        nim = inputnya.nextLong();

        System.out.println("datamu masuk yey!");
        System.out.println("...");

        System.out.println("================================================");
        System.out.printf("||%-15s|%-15S|%-12S||\n", "NIM", "NAMA PANGGILAN", "ASAL KOTA");
        System.out.println("================================================");
        System.out.printf("||%-15d|%-15S|%-12S||\n", nim, nama, asalKota);
        System.out.println("================================================");

    }
}
/* Penjelasan [%-15d]
* [%] -> manggil formatnya
* [-15] -> max 15 huruf didalam format
* [d] -> untuk format decimal
* [S] -> untuk format kapital
* [s] -> untuk format x kapital
* printf -> untuk system formatnya java
 * */
