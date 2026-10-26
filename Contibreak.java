import java.util.Scanner;

public class Day55{
  
public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.print("batas perulangan >7 =");
  int bts = sc.nextInt();
  
    for (int i = 1; i <= bts; i++) {
      
        if (i == 3) continue;
        if (i == 5) continue;
        if (i == 7) continue;
      
        if (i >bts) break;
        
        System.out.println(i);
    }
    return;
}
}