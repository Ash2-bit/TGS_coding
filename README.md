# TGS_coding
Soal 1
Penjeleasan untuk kode soal 1 :


public class task1 {
    public static void main (String[]args)
}

Kode ini merupakan  kerangka dasar dari sebuah kelas Java dengan nama "task1". Dalam kode  tersebut, terdapat method `main` yang merupakan entry point untuk program Java. Fungsi dari kode ini  sebagai tempat dimulainya eksekusi program di Java. Ketika program dijalankan, method `main` akan dieksekusi.oleh. fungsi utama dari kode tersebut adalah sebagai titik awal eksekusi program Java dan sebagai tempat untuk menuliskan logika atau instruksi yang ingin dijalankan oleh program.


for (int i = 0; i <= 100 ; i++) {
    if (i>=10){
        System.out.println("AJIS SAPUTRA HIDAYAH");
    }
    else {
        System.out.print(i);
    }
}
-kode  `for (int i = 0; i <= 100; i++)` adalah deklarasi perulangan `for`. Pada kode saya menggunakan  variabel `i` sebagai penghitung perulangan. Perulangan ini akan berjalan dari `i = 0` hingga `i <= 100`, dan setiap kali perulangan dilakukan, nilai `i` akan bertambah 1 (`i++`).
- Di dalam perulangan, kita memiliki struktur `if-else`. Jika nilai `i` lebih besar atau sama dengan 10, maka pesan "AJIS SAPUTRA HIDAYAH" akan dicetak menggunakan `System.out.println()`. Jika tidak, yaitu saat `i` kurang dari 10, maka nilai `i` akan dicetak menggunakan `System.out.print()` tanpa karakter baris baru.
- Selama perulangan berjalan, pesan "AJIS SAPUTRA HIDAYAH" akan terus dicetak setiap kali nilai `i` lebih besar atau sama dengan 10. Sebelum mencapai nilai 10, nilai `i` akan dicetak secara berurutan mulai dari 0.
Jadi, kesimpulan fungsi dari kode ini adalah untuk melakukan perulangan dari 0 hingga 100, dan mencetak angka dari 0 sampai 9 serta mencetak sebuah pesan "AJIS SAPUTRA HIDAYAH" mulai dari angka 10 dan seterusnya.



Soal 2
Penjeleasan untuk kode soal 2 :
public class task1 {
    public static void main (String[]args)
}

Kode ini merupakan  kerangka dasar dari sebuah kelas Java dengan nama "task1". Dalam kode  tersebut, terdapat method `main` yang merupakan entry point untuk program Java. Fungsi dari kode ini  sebagai tempat dimulainya eksekusi program di Java. Ketika program dijalankan, method `main` akan dieksekusi.oleh. fungsi utama dari kode tersebut adalah sebagai titik awal eksekusi program Java dan sebagai tempat untuk menuliskan logika atau instruksi yang ingin dijalankan oleh program.


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

- `try (Scanner scanner = new Scanner(System.in))` adalah blok `try` dengan  menggunakan statement `Scanner` untuk membaca input dari pengguna. Statement `Scanner` ini akan menginisialisasi objek `scanner` yang digunakan untuk membaca angka yang dimasukkan oleh pengguna melalui console.
- Di dalam blok `try`, kita memiliki perulangan `while` dengan kondisi `while (true)`, yang berarti perulangan ini akan terus berjalan selama kondisinya benar atau tidak ada statement `break` yang dieksekusi.
- Dalam setiap iterasi perulangan, kita meminta pengguna untuk memasukkan sebuah angka dengan menggunakan `System.out.print()`, dan kemudian menggunakan `scanner.nextInt()` untuk membaca angka yang dimasukkan oleh pengguna.
- Setelah mendapatkan angka, selanjutnya akan melakukan pengecekan dengan menggunakan struktur `if-else`. Jika angka yang dimasukkan adalah 0, maka pesan "Perulangan telah dihentikan." akan dicetak dan perulangan akan dihentikan dengan statement `break`.
- Jika angka yang dimasukkan adalah genap (habis dibagi dua), maka pesan "Angka yang dimasukkan adalah angka genap." akan dicetak.
- Jika angka yang dimasukkan adalah ganjil (tidak habis dibagi dua), maka pesan "Angka yang dimasukkan adalah angka ganjil." akan dicetak.
- Setelah perulangan selesai, kita menggunakan `scanner.close()` untuk menutup objek scanner dan tidak lagi membaca input.

Jadi, kesimpulan dari pembuatan kode tersebut adalah agar pengguna dapat memasukkan angka dan kemudian akan diberikan respons sesuai dengan jenis angka yang dimasukkan (genap atau ganjil). Perulangan akan berlanjut hingga pengguna memasukkan angka 0, di mana perulangan akan dihentikan.

Soal 3
Penjeleasan untuk kode soal 3 :

public class task1 {
    public static void main (String[]args)

}
Kode ini merupakan  kerangka dasar dari sebuah kelas Java dengan nama "task1". Dalam kode  tersebut, terdapat method `main` yang merupakan entry point untuk program Java. Fungsi dari kode ini  sebagai tempat dimulainya eksekusi program di Java. Ketika program dijalankan, method `main` akan dieksekusi.oleh. fungsi utama dari kode tersebut adalah sebagai titik awal eksekusi program Java dan sebagai tempat untuk menuliskan logika atau instruksi yang ingin dijalankan oleh program.
Scanner sc = new Scanner(System.in);

System.out.print("Tanggal : ");
int tanggal = sc.nextInt();
System.out.print("Bulan : ");
int bulan = sc.nextInt();


String zodiak = "";

if ((bulan == 3 && tanggal >= 21) || (bulan == 4 && tanggal <= 19)) {
    zodiak = "ARIES";
}
else if ((bulan == 4 && tanggal >= 20) || (bulan == 5 && tanggal <= 20)) {
    zodiak = "TAURUS";
}

- kode `Scanner sc = new Scanner(System.in)` digunakan untuk membuat objek `Scanner` yang akan digunakan untuk membaca input dari pengguna melalui console.
-  Selanjutnya, kode `System.out.print()` untuk memberikan pesan kepada pengguna untuk memasukkan tanggal dan bulan.
-kode `int tanggal = sc.nextInt()` digunakan untuk membaca angka yang dimasukkan oleh pengguna sebagai tanggal.dan `int bulan = sc.nextInt()` digunakan sebagai bulan.
- Setelah itu, kita mendeklarasikan variabel `zodiak` dengan tipe data `String` dan menginisialisasinya dengan string kosong (`""`).
- Di dalam struktur `if-else`, kita melakukan pengecekan terhadap kombinasi tanggal dan bulan untuk menentukan zodiaknya. Misalnya, jika bulan adalah Maret (`3`) dan tanggal lebih besar atau sama dengan `21`, atau bulan adalah April (`4`) dan tanggal kurang dari atau sama dengan `19`, maka nilai variabel `zodiak` akan diubah menjadi "ARIES".Demikian pula, jika bulan adalah April (`4`) dan tanggal lebih besar atau sama dengan `20`, atau bulan adalah Mei (`5`) dan tanggal kurang dari atau sama dengan `20`, maka nilai variabel `zodiak` akan diubah menjadi "TAURUS". Dan seterusnya.
Jadi, fungsi  utama dari pembuatan kode ini adalah untuk membaca input tanggal dan bulan dari pengguna, dan berdasarkan nilainya nanti digunakan untuk, menentukan zodiak yang sesuai.



Soal 4
Penjeleasan untuk kode soal 4 :

public class task1 {
    public static void main (String[]args)

}

Kode ini merupakan  kerangka dasar dari sebuah kelas Java dengan nama "task1". Dalam kode  tersebut, terdapat method `main` yang merupakan entry point untuk program Java. Fungsi dari kode ini  sebagai tempat dimulainya eksekusi program di Java. Ketika program dijalankan, method `main` akan dieksekusi.oleh. fungsi utama dari kode tersebut adalah sebagai titik awal eksekusi program Java dan sebagai tempat untuk menuliskan logika atau instruksi yang ingin dijalankan oleh program.

String[] namaHari = {"Senin", "Selasa", "Rabu","Kamis", "Jumat", "Sabtu","Minggu"};


System.out.println("\nNama-nama Hari: ");
for (int i = 0; i < namaHari.length; i++) {
    System.out.println(namaHari[i]);
}
- kode `String[] namaHari` adalah deklarasi variabel dengan tipe data array `String`. Variabel ini digunakan untuk menyimpan daftar nama hari.
- Di dalam tanda kurung kurawal `{}`, pada kode menginisialisasi isi dari array `namaHari` dengan nama-nama hari, yaitu "Senin", "Selasa", "Rabu","Kamis", "Jumat", "Sabtu", dan "Minggu".
- Kemudian, pada kode menggunakan `System.out.println()` untuk mencetak pesan "Nama-nama Hari: " ke console.
- Dan perulangan `for` untuk mengakses setiap elemen di dalam array `namaHari`.
- Pada setiap iterasi perulangan, akan mencetak elemen array `namaHari[i]` menggunakan `System.out.println()`.
- Perulangan akan berhenti saat variabel `i` mencapai nilai sebanyak elemen yang ada dalam array `namaHari`, yang dalam hal ini adalah `namaHari.length`.
Jadi, fungsi utama dari kode ini adalah untuk menyimpan daftar nama hari dalam sebuah array, dan kemudian mencetak semua nama hari tersebut satu per satu menggunakan perulangan `for`.
