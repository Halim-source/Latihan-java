import java.util.*;
public class latihan {
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    for (int i = 1; i<=7;i++){
   for (int j = 1;j <=7;j++){
    
      if(i==7||j==7||j==7-i+1){
        System.out.print(i+" ");
      }else{
        System.out.print("  ");
      }
   
    }
   System.out.println();
    }
    System.out.println();
      for (int i = 1; i<=7;i++){
   for (int j = 1;j <=7;j++){
      if(j==1||i==7||j==i){
        System.out.print(i+" ");
      }else{
        System.out.print("  ");
      }
   }
   System.out.println();
  }
    System.out.println();
 for (int i = 1; i<=7;i++){
   for (int j = 1;j <=7;j++){
     if(j==1||i==1||j==8-i){
       System.out.print(i+" ");
     }else{
       System.out.print("  ");
     }
   }
   System.out.println();
 }
System.out.println();
    
    for (int k = 1; k<=7;k++){
   for (int l = 1;l <=7;l++){
    if(k==1||k==7||l==1||l==7){
      System.out.print(l+" ");
    }else{
      System.out.print("  ");
    }
   }
   System.out.println();
 }

      
  
    }
  }

