import java.util.Scanner;

public class Day74{
  public static void main(String[]args){

Scanner sc =new Scanner(System.in);
    String teks;
    do{
    System.out.println("ketik 1 untuk mengakhiri");
    System.out.println("masukkan teks =");
      teks =sc.nextLine();
  
switch(teks){
  case "1":
    System.out.println("program selesai");break;
default :
  System.out.println("jumlah huruf ="+teks.length());
  System.out.println("huruf besar  ="+teks.toUpperCase());
  System.out.println("huruf kecil  ="+teks.toLowerCase());break;
}
      System.out.println();
    }  while(!teks.equals("1"));
    
    
  }
}