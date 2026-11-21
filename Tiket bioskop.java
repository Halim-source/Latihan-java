import java.util.*;
public class js{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("===tiket bioskop===");
System.out.println("1.reguler:rp35000");
System.out.println("2.premium:rp75000");
System.out.println("3.vip    :rp100000");
System.out.println("0.selesa ");
    int pilih,tiket;
    int reguler =35000;
    int premium =75000;
    int vip =100000;
    do{
      System.out.println("enter pilihan");
      pilih =sc.nextInt();
      if(pilih==0){
        System.out.print("selsai");break;
      }
      System.out.println("enter jumla tiket");
      tiket =sc.nextInt();
     switch(pilih){
       case 1:
         System.out.println("pilihan "+pilih);
         System.out.println("jumlah tiket "+tiket);
       System.out.println("subtotal:"+tiket*reguler);break;
       case 2:
         System.out.println("pilihan "+pilih);
         System.out.println("jumlah tiket "+tiket);
       System.out.println("subtotal:"+tiket*premium);break;
       case 3:
         System.out.println("pilihan "+pilih);
         System.out.println("jumlah tiket "+tiket);
       System.out.println("subtotal:"+tiket*vip);break;
         
     }
    }while(true);
}
}