import java.io.*;

public class loop
{
	public static void main (String[] args) throws IOException
	{
		int a, b, c, d, e, t;
		
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("input angka ke-1 : ");
		a = Integer.parseInt(input.readLine());
		System.out.print("input angka ke-2 : ");
		b = Integer.parseInt(input.readLine());
		System.out.print("input angka ke-3 : ");
		c = Integer.parseInt(input.readLine());
		System.out.print("input angka ke-4 : ");
		d = Integer.parseInt(input.readLine());
		System.out.print("input angka ke-5 : ");
		e = Integer.parseInt(input.readLine());
		
		t = a+b+c+d+e;
		System.out.println("total nilai yang diinput : "+t+"\n");
		System.out.println("selesai");	
	}
	
}