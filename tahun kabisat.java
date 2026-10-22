import java.util.Scanner;
public class main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("tahun :");
    int a = sc.nextInt();

    int b =a%4==0;

    System.out.print("tahun "+a+"adalah tahun kabisat");
    int c =a%100==1;
    System.out.print("tahun "+a+"adalah bukan tahun kabisat");


    
  }
}