public class FungsiStatic{

	void makan(String makanan){
		System.out.println("Hi!");
		System.out.println("Saya sedang makan " + makanan);
	}

	static void minum(String minuman){
		System.out.println("saya sedang minum " + minuman);
	}

	public static void main(String[] args){
		minum("Kopi");
		FungsiStatic saya =  new FungsiStatic();
		saya.makan("Nasi Goreng");
	}
}