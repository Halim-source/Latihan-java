import java.util.Scanner;
public class Day51{
  public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
    System.out.print("jumlah pesan yang mau di buat =");
    int a = sc.nextInt();
    System.out.print("mulai cetak dari angka apa");
    int b =sc.nextInt();
    while (b<=a){
      System.out.println("pesan ke -"+b);
      b++;
    }
    


    
  }
}