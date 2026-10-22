import java.util.Scanner;
public class aja{
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    

System.out.print("nilai (0-100) :");
    int a = sc.nextInt();
    
if (a>=85){
  System.out.println("nilai huruf:A");
  System.out.println("status :lulus");

}else if (a>=70){
  System.out.println("nilai huruf:B");
  System.out.println("status :lulus");
}else if (a>=55){
  System.out.println("nilai huruf:C");
  System.out.println("status :lulus");
  
}else if (a>=40){
  System.out.println("nilai huruf:D");
  System.out.println("status :tidak lulus");
  
}else {
  System.out.println("nilai huruf:E");
  System.out.println("status :tidak lulus");
  
}
    
    
  }
}