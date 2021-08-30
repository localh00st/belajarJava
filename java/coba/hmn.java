import java.io.*;

public class hmn
{
	public static void main (String[] args) throws Exception
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String nm;
		System.out.print("masukan nama :");
		nm= input.readLine();
		
		System.out.println("\nNamamu :"+nm);
	}
}