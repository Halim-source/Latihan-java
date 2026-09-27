import java.util.Scanner;
public class lati{

public static void main(String[]args){
Scanner sc =new Scanner(System.in);

double idr =100000;
  double usd =17889.00;
  double cv =idr/usd;

  System.out.printf("%.2f usd\n",cv);

  double idr1 =20000;
  
  double cv1 =idr1/usd;

  System.out.printf("%.2f usd\n",cv1);
  
double idr2 =12345679;
  
  double cv2 =idr2/usd;

  System.out.printf("%.2f usd",cv2);
  
  

}
}