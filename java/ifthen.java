import java.io.*;

public class ifthen
{
	public static void main (String[] args)
	{
		try
		{
		
		int angka;
		
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("input sebuah angka : ");
		angka = Integer.parseInt(input.readLine());
		
		if	(angka > 5)
		{
			System.out.println("angka yng diinput > 5 ");
		}
		
		System.out.println("selesai");
		
		}
		
		catch(Exception ie)
		{
			System.out.println("data yng diinput salah");
		}
	}
}