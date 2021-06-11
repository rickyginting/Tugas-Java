public class Barang {
    String nama;
    int kuantitas;
    int harga;

    Barang(String n1, int k1, int h1){
    nama = n1;
    kuantitas = k1;
    harga = h1;
    }

    Barang(String n2, int h2){
    nama = n2;
    harga = h2;
    kuantitas = harga/10;
    }

    void tampil(){
    System.out.println("Nama Barang adalah "+ nama);
    System.out.println(" Kuantitas Barang adalah "+ kuantitas);
    System.out.println(" Harga Barang adalah :"+ harga);
    }

    public static void main (String[] args){
    Barang produk;
    produk = new Barang ("Buku", 20, 7000);
    produk.tampil();
    System.out.println("");
    produk = new Barang ("Pensil", 4000);
    produk.tampil();
    }
}