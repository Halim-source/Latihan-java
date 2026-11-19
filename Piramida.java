public class dja {
  public static void main(String[] args) {
    
    for (int i = 1; i <= 7; i++) {
      // j jalan mundur dari 7 ke 1
      for (int j = 7; j >= 1; j--) {
        if (j > i) {
          System.out.print(" "); // Kalau j lebih besar dari i, kasih spasi
        } else {
          System.out.print(i + " "); // Kalau sudah sama/lebih kecil, cetak angka
        }
      }
      System.out.println();
    }
  }
}
