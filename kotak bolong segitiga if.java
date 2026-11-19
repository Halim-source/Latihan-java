public class dja{
  public static void main(String[] args) {
    
    for(int i =1;i<=7;i++){  
      for(int j =1;j<=7;j++){
        if(j==i){
          break;
        }
        System.out.print(i+" ");
        }
      System.out.println();
      
      }
    System.out.println();
    
    for(int k =1;k<=7;k++){  
      for(int l =1;l<=7;l++){
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
