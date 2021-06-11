public class mobil extends kendaraan {
	private String nama;
	private String jenis;
	
	public mobil (String nama){
		super("Mobil");
		this.nama = nama;
		jenis = "belum terindetifikasi";
	}
	public mobil (String nama. String jenis){
		super("Mobil");
		this.nama = nama;
		this.jenis = jenis;
	}
	public void information(){
		System.out.println("Nama mobil adalah"+ nama);
		System.out.println("Jenis mobil adalah"+ jenis);
	}
}