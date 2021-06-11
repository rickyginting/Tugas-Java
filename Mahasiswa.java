import java.util.Scanner;
public class Mahasiswa {

		Scanner input = new Scanner (System.in);
		public class BiodataMahsisa{
			private String nama;
			private String sms;
			private String mk;
			private int nim;
			private int nilai;
			
			public String GetNama(){
				return this.nama;
			}
			public String GetSms(){
				return this.sms;
			}
			public String GetMk(){
				return this.mk;
			}
			public int GetNim(){
				return this.nim;
			}
			public int GetNilai(){
				return this.nilai;
			}
			
			public void setNama(String nama){
				this.nama=nama;
				}
			public void setSms(String sms){
				this.sms=sms;
				}
			public void setMk(String mk){
				this.mk=mk;
				}
			public void setNim(int nim){
				this.nim=nim;
				}
			public void setNilai(int nilai){
				this.nilai=nilai;
				}
			}
			public static void main (String[]args){
				Mahasiswa mhs = new Mahasiswa();
				BiodataMahsisa datamhs = mhs.new BiodataMahsisa();
				
				System.out.println ("==================================");
				System.out.println("Masukkan Biodata Mahasiswa");
				
				System.out.print("Masukkan Nama Anda : ");
				String data_nama = mhs.input.next ();
				
				System.out.print("Masukkan Semester Anda : ");
				String data_sms = mhs.input.next();
				System.out.print("Masukkan Matakuliah Anda : ");
				String data_mk = mhs.input.next();
				System.out.print("Masukkan NIM Anda : ");
				int data_nim = mhs.input.nextInt();
				System.out.print("Masukkan Nilai Anda : ");
				int data_nilai = mhs.input.	nextInt();
				
				datamhs.setNama(data_nama);
				datamhs.setSms(data_sms);
				datamhs.setMk(data_mk);
				datamhs.setNim(data_nim);
				datamhs.setNilai(data_nilai);
				
				System.out.println("=====================================");
				System.out.println("Rekaman Data Mahasiswa");
				System.out.println("=====================================");
			
				System.out.println("Nama Anda	: "+datamhs.GetNama());
				System.out.println("Semester	: "+datamhs.GetSms());
				System.out.println("Matakuliah	: "+datamhs.GetMk());
				System.out.println("Nim Anda	: "+datamhs.GetNim());
				System.out.println("Nilai Anda	: "+datamhs.GetNilai());
		}
		
	}