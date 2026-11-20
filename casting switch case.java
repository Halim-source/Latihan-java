import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double rating = sc.nextDouble();
        int kategori = (int) rating;
        
        if (rating < 1|| rating >= 4) {
            
        }
            switch (kategori) {
                case 1:
                    System.out.println("Rating: Buruk");
                    break;
                case 2:
                    System.out.println("Rating: Biasa");
                    break;
                case 3:
                    System.out.println("Rating: Bagus");
                    break;
                default:
                    System.out.println("Input tidak valid");
                    break;
            }
        }
        
      
    }

