import java.util.Scanner;
public class BiodataMahasiswa{
public static void main(String[] args) {
String nama, semester, matakuliah;
int nim, nilai;
Scanner keyboard = new Scanner(System.in);
System.out.println("MASUKAN BIODATA MAHASISWA");
System.out.print("MASUKAN NAMA MAHASISWA: ");
nama = keyboard.nextLine();
System.out.print("MASUKAN SEMSESTER ANDA : ");
semester = keyboard.nextLine();
System.out.print("MASUKAN MATA KULIAH ANDA: ");
matakuliah = keyboard.nextLine();
System.out.print("MASUKAN NIM ANDA : ");
nim = keyboard.nextInt();
System.out.print("MASUKAN NILAI ANDA : ");
nilai = keyboard.nextInt();

System.out.println("--------------------");
System.out.println("Nama Mahasiswa: " + nama);
System.out.println("Nim: " + nim);
System.out.println("Semester " + semester);
System.out.println("Mata Kuliah: " + matakuliah);
System.out.println("Nilai Anda " + nilai);
}

}