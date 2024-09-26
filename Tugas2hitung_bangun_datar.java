import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("Masukkan pilihan anda: ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                inputPersegi(input);
                break;
            case 2:
                inputPersegiPanjang(input);
                break;
            case 3:
                inputLingkaran(input);
                break;
            default:
                System.out.println("Pilih 1/2/3");
        }
    }

    public static void inputPersegi(Scanner input) {
        System.out.println("Masukkan panjang sisi : ");
        double sisi = input.nextDouble();

        double luas = menghitungLuasPersegi(sisi);
        double keliling = menghitungKelilingPersegi(sisi);

        System.out.println("Luas Persegi : " + luas);
        System.out.println("Luas Keliling : " + keliling);
    }
    public static double menghitungLuasPersegi(double sisi) {
        return sisi * sisi;
    }
    public static double menghitungKelilingPersegi(double sisi) {
        return 4 * sisi;
    }

    public static void inputPersegiPanjang(Scanner input) {
        System.out.println("Masukkan panjang : ");
        double panjang = input.nextDouble();
        System.out.println("Masukkan lebar : ");
        double lebar = input.nextDouble();

        double luas = menghitungLuasPersegiPanjang(panjang, lebar);
        double keliling = menghitungKelilingPersegiPanjang(panjang, lebar);

        System.out.println("Luas Persegi Panjang : " + luas);
        System.out.println("Keliling Persegi Panjang : " + keliling);
    }
    public static double menghitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }
    public static double menghitungKelilingPersegiPanjang(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    public static void inputLingkaran(Scanner input) {
        System.out.println("Masukkan jari-jari : ");
        double jariJari = input.nextDouble();

        double luas = menghitungLuasLingkaran(jariJari);
        double keliling = menghitungKelilingLingkaran(jariJari);

        System.out.println("Luas Lingkaran : " + luas);
        System.out.println("Keliling Lingkaran : " + keliling);
    }
    public static double menghitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }
    public static double menghitungKelilingLingkaran(double jariJari) {
        return 2 * Math.PI * jariJari;
    }
}