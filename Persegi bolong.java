import java.util.*;
public class js{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.print("enter panjang persegi:");
    int p =sc.nextInt();
    if(p<=0){
      System.out.println("p tidal boleh 0");
    }else{
      for(int i =1;i<=p;i++){
        for(int j =1;j<=p;j++){
          System.out.print(i+" ");
        }
        System.out.println();
      }
    }
    System.out.println("\npersgi p bolong\n");
    
    for(int i =1;i<=p;i++){
        for(int j =1;j<=p;j++){
          if(i==1||i==p||j==1||j==p){
            System.out.print(i+" ");
          }else{
            System.out.print("  ");
          }
        }
        System.out.println();
    
  }
}
}