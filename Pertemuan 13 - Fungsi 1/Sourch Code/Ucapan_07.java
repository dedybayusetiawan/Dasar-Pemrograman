import java.util.Scanner;
public class Ucapan_07 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan Nama orang yang ingin doberi ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        System.out.println("Namanya, " + namaOrang);
        return namaOrang;
    }
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank You "+nama+"\nMay the force be with you");
    }
}
