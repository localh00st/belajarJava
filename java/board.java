import java.io.*;

public class board
{
	public static void main (String[] args) throws IOException
	{
		int a, b, c, d, e, jml, bayar1, bayar2;
		
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("input harga barang ke-1 : Rp. ");
		a = Integer.parseInt(input.readLine());
		System.out.print("input harga barang ke-2 : Rp. ");
		b = Integer.parseInt(input.readLine());
		System.out.print("input harga barang ke-3 : Rp. ");
		c = Integer.parseInt(input.readLine());
		System.out.print("input harga barang ke-4 : Rp. ");
		d = Integer.parseInt(input.readLine());
		System.out.print("input harga barang ke-5 : Rp. ");
		e = Integer.parseInt(input.readLine());
		
		jml = a+b+c+d+e;
		System.out.println("total harga 	: Rp. "+jml);
		
		System.out.print("jumlah bayar 	: Rp. ");
		bayar1 = Integer.parseInt(input.readLine());
		
		bayar2 = bayar1-jml;
		System.out.println("kembalian 		: Rp. "+bayar2+"\n");
		
		System.out.println("terimakasih atas kunjungannya ");		
	}
}
