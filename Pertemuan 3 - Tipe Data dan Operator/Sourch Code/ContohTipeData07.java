public class ContohTipeData07 {
    public static void main(String[] args){
        char golonganDarah = 'B';
        byte jarak = (byte) 130;
        short jumlahPnddkDsun = 1025;
        float suhu = 60.50F;
        double berat = 0.5467812345;
        long saldo = 150000000;
        int angkaDesimal = 0x10;

        System.out.println("Golongan darah\t\t\t: " + (byte) golonganDarah);
        System.out.println("Jarak\t\t\t\t: " + jarak);
        System.out.println("Jumblah penduduk\t\t: " + jumlahPnddkDsun);
        System.out.println("Suhu\t\t\t\t: " + suhu);
        System.out.println("Berat\t\t\t\t: " + (float) berat);
        System.out.println("Saldo\t\t\t\t: " + saldo);
        System.out.println("Angka desimal\t\t\t: " + angkaDesimal);
    }
}