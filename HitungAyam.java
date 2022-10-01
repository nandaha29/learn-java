import java.util.Scanner;

public class HitungAyam {
    public static void main(String[] args){
        Scanner inputnya = new Scanner(System.in);
        String nama;
        int jkandang, jayam;

        System.out.println("Selamat Datang di program perhitungan ayam!");
        System.out.print("Namamu siapa? ");
        nama = inputnya.nextLine();
        System.out.print("Kandangmu ada berapa? ");
        jkandang = inputnya.nextInt();
        System.out.print("Punya ayam berapa ni? ");
        jayam = inputnya.nextInt();

        int totalAyam = jkandang * jayam;

        System.out.println("Jadi, total ayam milik saudara/i " + nama + " adalah " + totalAyam + " ekor.");

    }
}
