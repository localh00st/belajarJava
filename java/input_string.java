import java.io.*;

public class input_string
{
	public static void main (String[] args)
	{
		try
		{
			String nama1, nama2;
			
			BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
			
			System.out.print("input nama : ");
			nama1 = input.readLine();
			System.out.print("input nama : ");
			nama2 = input.readLine();
			
			System.out.println("nama "+nama1+" dan "+ nama2+", salam kenal ");
			
		}
		catch(Exception ie)
		{
			System.out.println("data eror");
		}
	}
}