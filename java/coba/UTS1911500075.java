import java.io.*;

class customer
{
	private int order;
	private int tlp;
	private String nama;
	private String nama1;
	private String nama2;
	private int porsi1;
	private int porsi2;
	private int jml1;
	private int jml2;
	
	public void setData(int order, String nama, int tlp, String nama1, String nama2)
	{
		this.order=order;
		this.nama=nama;
		this.tlp=tlp;
		this.nama1=nama1;
		this.nama2=nama2;		
	}
	public void setJumlah(int porsi1,int jml1, int porsi2, int jml2)
	{
		this.porsi1=porsi1;
		this.jml1=jml1;
		this.porsi2=porsi2;
		this.jml2=jml2;
	}
	public void hasil()
	{
		int akhir;
		int total1;
		int total2;
		total1=porsi1*jml1;
		total2=porsi2*jml2;
		akhir = total1+total2;

		System.out.println("\n cafe atma sukses ");
		System.out.println("------------------");
		System.out.println("kode customer : "+order);	
		System.out.println("nama customer : "+nama);
		System.out.println("telepon : "+tlp);
		System.out.println("");
		System.out.println("data pesanan");	
		System.out.println("makanan : ");
		System.out.println("nama : "+nama1);
		System.out.println("porsi : "+porsi1);
		System.out.println("harga : "+jml1);
		System.out.println("		sub total : Rp. "+total1);
		System.out.println("minuman : ");
		System.out.println("nama : "+nama2);
		System.out.println("porsi : "+porsi2);
		System.out.println("harga : "+jml2);
		System.out.println("		sub total : Rp. "+total2);
		System.out.println("		total pembelian : Rp. "+akhir);
	}
}
public class UTS1911500075
{
	public static void main (String[] args) throws Exception
	{
		String nm, nm1,nm2;
		int ordr,telp,pr1,jl1,pr2,jl2,ulg;
		boolean loop = true;
		
		customer cus = new customer();
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\n order customer ");
		System.out.println("----------------");
		System.out.print("input no order : "); ordr = Integer.parseInt(input.readLine());
		System.out.print("input nama : "); nm = input.readLine();
		System.out.print("input telp : "); telp = Integer.parseInt(input.readLine());
		System.out.println("");
		System.out.println(" data pesanan ");
		System.out.println("--------------");
		System.out.println("makanan : ");
		System.out.print("input nama : "); nm1 = input.readLine();
		System.out.print("input porsi : "); pr1 = Integer.parseInt(input.readLine());
		System.out.print("input harga : "); jl1 = Integer.parseInt(input.readLine());
		System.out.println("");
		System.out.println("minuman : ");
		System.out.print("input nama : "); nm2 = input.readLine();
		System.out.print("input porsi : "); pr2 = Integer.parseInt(input.readLine());
		System.out.print("input harga : "); jl2 = Integer.parseInt(input.readLine());
		System.out.println("");
		
		cus.setData(ordr,nm,telp,nm1,nm2);
		cus.setJumlah(pr1,jl1,pr2,jl2);
		cus.hasil();
		
		while(loop)
		{
			System.out.print("apakah anda ingin mengulang [1]/ keluar[100] : ");
			ulg = Integer.parseInt(input.readLine());
			
			if ((ulg == 1)&&(ulg != 100))
			{ 
				System.out.println("\n order customer ");
				System.out.println("----------------");
				System.out.print("input no order : "); ordr = Integer.parseInt(input.readLine());
				System.out.print("input nama : "); nm = input.readLine();
				System.out.print("input telp : "); telp = Integer.parseInt(input.readLine());
				System.out.println(" ");
				System.out.println(" data pesanan ");
				System.out.println("--------------");
				System.out.println("makanan : ");
				System.out.print("	input nama : "); nm1 = input.readLine();
				System.out.print("	input porsi : "); pr1 = Integer.parseInt(input.readLine());
				System.out.print("	input harga : "); jl1 = Integer.parseInt(input.readLine());
				System.out.println(" ");
				System.out.println("minuman : ");
				System.out.print("	input nama : "); nm2 = input.readLine();
				System.out.print("	input porsi : "); pr2 = Integer.parseInt(input.readLine());
				System.out.print("	input harga : "); jl2 = Integer.parseInt(input.readLine());	
				System.out.println("\n");
		
				cus.setData(ordr,nm,telp,nm1,nm2);
				cus.setJumlah(pr1,jl1,pr2,jl2);
				cus.hasil();
			}
			else if ((ulg == 100) && (ulg != 1))
			{
				System.out.println("keluar");
				loop = false;
			}
			else
			{
				System.out.println("data tidak sesuai kriteria");
				loop = false;
			}
		}
	}
}