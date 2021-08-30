import java.io.*;

public class contoh_If1
{
	public static void main (String[] args)
	{
		try
		{
			int i;
			
			BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
			
			System.out.print("input nilai : ");
			i = Integer.parseInt(input.readLine());
			
			if (i>=70)
			{
				System.out.println("selamat, anda LULUS");
			}
			else
				System.out.println("Maaf, anda GAGAL");
			
		}
		catch(Exception ie)
		{
			System.out.println("data error");
		}

	}
}