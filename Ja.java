import java.util.Scanner;
public class Ja{
public static void main(String[] args) {

Scanner /*nama*/scan = new Scanner(System.in);

  
System.out.println("nilai mu  :");
  int lati = /*nama*/scan.nextInt();

  if      (lati > 90) {System.out.println("A");}
  else if (lati > 80) {System.out.println("B");}
  else if (lati > 70) {System.out.println("C");}
  else if (lati < 70) {System.out.println("mengulang");}
  
}

  
}