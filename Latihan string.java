import java.util.Scanner;
public class Day77{
  public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    System.out.print("masukkan teks pertama:");
    String teks =sc.nextLine();
    System.out.print("masukkan teks kedua:");
    String teks1 =sc.nextLine();
    System.out.print("masukkan kata yg mau dicari pada kedua teks:");
    String S =sc.nextLine();
    System.out.println("teks1");
    System.out.println("length(jumlah karakter) ="+teks.length());
    System.out.println("toUpperCase(huruf besar) ="+teks.toUpperCase());
    System.out.println("toLowerCase(huruf kecil) ="+teks.toLowerCase());
    System.out.println("teks2");
    System.out.println("length(jumlah karakter) ="+teks1.length());
    System.out.println("toUpperCase(huruf besar) ="+teks1.toUpperCase());
    System.out.println("toLowerCase(huruf kecil) ="+teks1.toLowerCase());
    System.out.println("===============");

    System.out.println("equals(kedua teks sama persis:"+teks.equals(teks1));
    System.out.println("equalsIgnoreCase(kedua teks sama :"+teks.equalsIgnoreCase(teks1));
    System.out.println("kata yang dicari:"+(teks.contains(S)||teks1.contains(S)));
    System.out.println("apa teks satu atau dua kosong:"+(teks.isEmpty()||teks1.isEmpty()));
    System.out.println("===============");

       System.out.println("=====teks1=====");
        System.out.print("enter indeks awal substring: ");
        int awal = sc.nextInt();
        System.out.print("enter indeks akhir substring: ");
        int akhir = sc.nextInt();
        
        sc.nextLine();
        System.out.print("enter teks yang ingin diganti: ");
        String teksLama = sc.nextLine();
        System.out.print("enter teks pengganti: ");
        String teksbaru = sc.nextLine();
        
        System.out.println();
        if(awal >= 0 && akhir <= teks.length() && awal <= akhir) {
            System.out.println("substring = " + teks.substring(awal, akhir));
        }else{
            System.out.println("substring = indeks awal mulai dari 0 & indeks akhir tidak boleh lebih "+teks.length());
        }
        System.out.println("replace   = " + teks.replace(teksLama,teksbaru));
        System.out.println("trim      = " + teks.trim());
        System.out.println("=====teks2=====");
       System.out.print("enter indeks awal substring: ");
        int awal1 = sc.nextInt();
        System.out.print("enter indeks akhir substring: ");
        int akhir1 = sc.nextInt();
        
        sc.nextLine();
        System.out.print("enter teks yang ingin diganti: ");
        String teksLama1 = sc.nextLine();
        System.out.print("enter teks pengganti: ");
        String teksbaru1 = sc.nextLine();
        
        System.out.println();
        if(awal1 >= 0 && akhir1 <= teks1.length() && awal1 <= akhir1) {
            System.out.println("substring = " + teks1.substring(awal1, akhir1));
        }else{
            System.out.println("substring = indeks awal mulai dari 0 & indeks akhir tidak boleh lebih "+teks1.length());
        }
        System.out.println("replace   = " + teks1.replace(teksLama1,teksbaru1));
        System.out.println("trim      = " + teks1.trim());
  }
}