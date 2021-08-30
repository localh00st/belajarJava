import java.io.*;

class A
{
	protected String nama;
	protected String nmobat1;
	protected int jumlah1;
	protected String nmobat2;
	protected int jumlah2;
	
	public void setNama(String nama)
	{this.nama=nama;}
	public String getNama()
	{return (nama);}
	public void setNmobat1(String nmob1)
	{this.nmobat1=nmob1;}
	public String getNmobat1()
	{return (nmobat1);}
	public void setJumlah1(int jml1)
	{this.jumlah1=jml1;}
	public int getJumlah1()
	{return (jumlah1);}
	public void setNmobat2(String nmob2)
	{this.nmobat2=nmob2;}
	public String getNmobat2()
	{return (nmobat2);}
	public void setJumlah2(int jml2)
	{this.jumlah2=jml2;}
	public int getJumlah2()
	{return (jumlah2);}
	
	
}
class B extends A
{
	
	public void tampil()
	{
		int total;
		total = jumlah1+jumlah2;
	
		System.out.println("resep obat");
		System.out.println("----------");
		System.out.println("nama pasien : "+getNama());
		System.out.println("");
		System.out.println("data obat");
		System.out.println("nama obat : "+getNmobat1());
		System.out.println("jumlah : "+getJumlah1());
		System.out.println("nama obat : "+getNmobat2());
		System.out.println("jumlah : "+getJumlah2());
		System.out.println("total : "+total);
		
	}
	
}
public class inheritance_1911500075
{
	public static void main (String[] args) throws Exception
	{
		String nm,nmb1,nmb2;
		int jl1,jl2,ttl;
		
		B obj = new B();
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("input nama pasien : "); nm = input.readLine();
		System.out.print("input nama obat ke-1 : "); nmb1 = input.readLine();
		System.out.print("input jumlah obat ke-1 : "); jl1 = Integer.parseInt(input.readLine());
		System.out.print("input nama obat ke-2 : "); nmb2 = input.readLine();
		System.out.print("input jumlah obat ke-2 : "); jl2 = Integer.parseInt(input.readLine());
		
		obj.setNama(nm);
		obj.setNmobat1(nmb1);
		obj.setJumlah1(jl1);
		obj.setNmobat2(nmb2);
		obj.setJumlah2(jl2);
		obj.tampil();
		
	}
}

