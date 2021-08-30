public class aritmatika
{
	public static void main (String[] args)
	{
		int angka1, angka2, angka3, kali, bagi, tambah, kurang, modulus;
		
		angka1 = 10;
		angka2 = 8;
		angka3 = 5;
		
		kali = angka1 * angka2;
		bagi = angka1 / angka3;
		tambah = angka2 + angka1;
		kurang = angka2 - angka3;
		modulus = angka1 % angka3;
		
		System.out.println("hasil dari perkalian angka1 * angka2 :"+kali);
		System.out.println("hasil dari permbagian angka1 / angka3 :"+bagi);
		System.out.println("hasil dari penjumlahan angka2 + angka1 :"+tambah);
		System.out.println("hasil dari pengurangan angka2 - angka3 :"+kurang);
		System.out.println("hasil dari modulus angka1 % angka3 :"+modulus);
		
	}
}
