import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = input.nextInt();

        int[] angka = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        int terkecil = angka[0];
        for (int i = 1; i < jumlah; i++) {
            if (angka[i] < terkecil) {
                terkecil = angka[i];
            }
        }

        System.out.println("Nilai terkecil dalam array: " + terkecil);

        input.close();
    }
}