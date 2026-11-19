import java.util.Scanner;
public class icl{
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
int total =0;
    int n =sc.nextInt();
    for(int i =1;i<=n;i++){
      total +=i;
    }
      System.out.print(total);
    
  }
}