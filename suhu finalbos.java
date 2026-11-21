import java.util.Scanner;

public class soal2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input suhu: ");
    int suhu = sc.nextInt();

    if (suhu < 0||suhu>50) {
      System.out.println("Suhu tidak valid");
    } else if (suhu>=0&&suhu <= 10) {
      System.out.println("Suhu dingin");
    } else if (suhu <= 20) {
      System.out.println("Suhu normal");
    } else if (suhu <= 30) {
      System.out.println("Suhu hangat");
    } else if (suhu <= 40) {
      System.out.println("Suhu panas");
    } else  {
      System.out.println("Suhu sangat panas");
    }
    sc.close();
  }
}
