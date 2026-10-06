import java.util.Scanner;
    public class StudiKasus101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaPerCup = 18000;
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;
        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = input.nextInt();
        System.out.print("Masukkan jumlah uang yang dibayarkan: ");
        uangBayar = input.nextInt();
        totalHarga = hargaPerCup * jumlahCup;
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        } else {
            diskon = 0;
        }
        totalBayar = totalHarga - diskon;
        System.out.println("Total harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total bayar: " + totalBayar);        
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang yang dibayarkan kurang sebesar: " + kurang);
        }
    }    
}