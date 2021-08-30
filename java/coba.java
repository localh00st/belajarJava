class mahasiswa
{
	void hello(String oki)
	{
		System.out.println("hai "+oki);
		System.out.println("salken");
	}
}

public class coba
{
	public static void main (String[] args) 
	{
		mahasiswa a = new mahasiswa();
		
		a.hello("oki");
	}
}
