import java.util.Scanner;

public class Soal2 {
    public static void  main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            int angka;

            while (true) {
                System.out.print("Masukkan sebuah angka: ");
                angka = scanner.nextInt();

                if (angka == 0) {
                    System.out.println("Perulangan telah dihentikan.");
                    break;
                } else if (angka % 2 == 0) {
                    System.out.println("Angka yang dimasukkan adalah angka genap.");
                } else {
                    System.out.println("Angka yang dimasukkan adalah angka ganjil.");
                }
            }

            scanner.close();
        }
    }
}

