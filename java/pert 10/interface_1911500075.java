interface cetak
{
	public void tampil();
}

class judul implements cetak
{
	public void tampil(String nama)
	{
		System.out.println("hai nama saya "+nama);
	}
}
public class interface_1911500075
{
	public static void main (String[] args)
	{
		judul jdl = new judul();
		
		jdl.tampil("jancok");
	}
}