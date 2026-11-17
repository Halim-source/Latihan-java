import java.util.Scanner;
public class dah{
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 int[] nilai = new int[5];
    System.out.print("masukkam indeks ke 0 ");
    nilai[0] =sc.nextInt();
    System.out.print("masukkam indeks ke 1 ");
    nilai[1] =sc.nextInt();
    System.out.print("masukkam indeks ke 2 ");
    nilai[2] =sc.nextInt();
    System.out.print("masukkam indeks ke 3 ");
    nilai[3] =sc.nextInt();
    System.out.print("masukkam indeks ke 4 ");
    nilai[4] =sc.nextInt();
    for(int i =0;i<=nilai.length-1;i++){
      
      System.out.print(nilai[i]);
      if(i<4){
      System.out.print(",");
      }
    }
    
  }
}