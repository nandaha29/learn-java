import java.util.Scanner;  // Import the Scanner class

class KasirTiket {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Selamat Datang di Program Pembelian Tiket PSCS.");
        double hargaTiket =  150000f;
        int pesen ;
        System.out.printf("Harga tiket per orangnya Rp%,.2f\n" , hargaTiket );
        System.out.print("Kamu mau pesen berapa tiket? " );  // Output user input

        pesen = myObj.nextInt();  // Read user input

        double totalBeli = pesen * hargaTiket;
        System.out.printf("Jadi total harga tiket yang kamu beli adalah Rp%,.2f\n" , totalBeli );  // Output user input
        System.out.println("Terima kasih, sudah menggunakan layanan kami.");
    }
}
