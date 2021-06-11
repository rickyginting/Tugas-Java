public class BangunRuang{
	public static void main(String[] args){
		int s = 12;
		int luas = luasKubus(s);

		System.out.println(luas);
	}

	static int luasPersegi(int sisi){
		return sisi * sisi;
	}

	static int luasKubus(int sisi){
		return 6 * luasPersegi(sisi);
	}
}