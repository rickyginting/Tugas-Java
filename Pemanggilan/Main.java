public class Main {

	 public static void main(String[] args) {
		kendaraan objek;
		mobil mobi1= new mobil ("Toyota Avanza","MRV");
		mobil mobi2 = new mobil ("Toyota Vios","Sedan");
		mobil mobi3 = new mobil ("Toyota Rush","SUV");
		mobil mobi4 = new mobil ("Toyota Hilux","Double Cabin");
		pesawat psw	= new pesawat ("Boeing 777","Pesawat Komersil");
		kapal kpl  = new kapal("Titanic","Kapal Pesiar");
		
		objek = mobi1;
		objek.information();
		objek = mobi2;
		objek.information();
		objek = mobi3;
		objek.information();
		objek = mobi4;
		objek.information();
		objek = psw;
		objek.information();
		objek = kpl;
		objek.information();
	}
}