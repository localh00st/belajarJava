import java.io.*;

public class loopif2
{
	public static void main (String[] args) throws IOException
	{
		try
		{
		int a, b, c, d, e, jml, bayar1, bayar2, tr;
		boolean jwb = true;
		
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
		System.out.println("kembalian 		: Rp. "+bayar2);
		
		while(jwb)
		{
			
			System.out.print("\ntransaksi lagi ?? [1.ulang / 100.keluar] : ");
			tr = Integer.parseInt(input.readLine());
		
			if((tr == 1) && (tr != 100))
			{
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
				System.out.println("kembalian 		: Rp. "+bayar2);
				
			}
			else if ((tr == 100) && (tr != 1))
			{
				System.out.println("\nselesai");	
			}
			else
				System.out.println("data tidak sesuai kriteria");
				jwb = false;
			} 
		}
		catch (Exception ie)
		{
			System.out.println("data bukan angka");
		}
	}
}
