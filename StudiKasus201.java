import java.util.Scanner;

public class StudiKasus201 {
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa: ");
        String namaMahasiswa = input.nextLine();
        System.out.print("Jenis lomba (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisLomba = input.nextLine().trim().toUpperCase();
        boolean lomba = jenisLomba.equals("BELMAWA") || jenisLomba.equals("BAKORMA") || jenisLomba.equals("MANDIRI");
        boolean pkm = jenisLomba.equals("PKM");
        if (lomba || pkm) {
            System.out.print("Jumlah dokumen: ");
            int dokumen = input.nextInt();
            int peringkat = 0;
            int lolos = 0;
            if (lomba) {
                System.out.print("Peringkat juara  : ");
                peringkat = input.nextInt();
                if (peringkat >= 1 && peringkat <= 3) {
                    if (dokumen == 4) {
                        System.out.println("Status : Memenuhi ketentuan. Dana penghargaan diberikan.");
                    } else {
                        System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                    }
                } else {
                    System.out.println("Status : Bukan Juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
                }
            } else if (pkm) {
                System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
                lolos = input.nextInt();
                if (lolos == 1) {
                    if (dokumen == 4) {
                        System.out.println("Status : Memenuhi ketentuan. Dana penghargaan diberikan.");
                    } else {
                        System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                    }
                } else {
                    System.out.println("Status : PKM tidak lolos pendanaan. Dana penghargaan tidak diberikan.");
                }
            }
        } else {
            System.out.println("Status : Kegiatan kategori Lainnya tidak memperoleh dana penghargaan.");
        }
        input.close();
    }
}