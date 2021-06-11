// mengimpor Scanner ke program

import java.util.Scanner;

public class DataMahasiswa {

public static void main(String[] args) {

// deklarasi variabel

String nama, alamat, prodi;

int usia;

// membuat scanner baru

Scanner keyboard = new Scanner(System.in);
// Tampilkan output ke user

System.out.println("Pendataan Mahasiswa STMIK Pelita Nusantara");

System.out.print("Nama Mahasiswa: ");

// menggunakan scanner dan menyimpan apa yang diketik di variabel


nama = keyboard.nextLine();

System.out.print("Alamat: ");

alamat = keyboard.nextLine();

System.out.print("Program Studi: ");

prodi = keyboard.nextLine();

System.out.print("Usia: ");

usia = keyboard.nextInt();
// Menampilkan apa yang sudah simpan di variabel

System.out.println("--------------------");

System.out.println("Nama Mahasiswa: " + nama);

System.out.println("Alamat: " + alamat);

System.out.println("Program Studi: " + prodi);

System.out.println("Usia: " + usia + " tahun");

}

}