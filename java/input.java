import java.io.*;

public class input
{
	public static void main (String args[]) throws Exception
	{ 
		try
		{
			
			String nama ;
			int umur ;
			BufferedReader tulis = new BufferedReader (new InputStreamReader(System.in));
			
			System.out.print("masukan nama anda	: ");
			nama = tulis.readLine();
			System.out.print("masukan umur anda	: ");
			umur = Integer.parseInt(tulis.readLine());
			
			System.out.println("nama anda : "+nama);
			System.out.println("umur anda : "+umur+" tahun");	
		}
		catch (Exception ie)
		{
			System.out.println("data error");
		}
	}
	
}