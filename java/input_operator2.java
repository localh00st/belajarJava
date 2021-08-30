import java.io.*;

public class input_operator2
{
	public static void main (String[] args) throws Exception
	{
		try
		{
			int p, l, luas, kell;
			BufferedReader tulis = new BufferedReader (new InputStreamReader(System.in));
			
			System.out.println("	menghitung luas persegi	panjang		\n");
			
			System.out.print("masukan panjang	: ");
			p = Integer.parseInt(tulis.readLine());
			System.out.print("masukan luas	: ");
			l = Integer.parseInt(tulis.readLine());
			
			System.out.println("	HASIL	");
			
			luas = p*l;
			System.out.println("hasil luas : "+luas);
			kell = 2 *(p + l);
			System.out.println("hasil keliling : "+kell);
			
		}
		catch(Exception ie)
		{
			System.out.println("data error");
		}
	}
}