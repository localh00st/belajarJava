import java.io.*;

class mhs
{
	void identt(String nm, String nim, String almt)
	{
		System.out.println("hasil input");
		System.out.println(" nama anda : "+nm);
		System.out.println(" nim anda : "+nim);
		System.out.println(" alamat anda : "+almt);
	}
}

public class oop
{
	public static void main (String[] args) throws Exception
	{
		String nama, Nim, alamat;
		mhs a = new mhs();
			
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("input nama anda : "); nama = input.readLine();
		System.out.print("input nim anda : "); Nim = input.readLine();
		System.out.print("input alamat anda : "); alamat = input.readLine();
		
		System.out.println();
		
		a.identt(nama, Nim, alamat);
		
	}
}