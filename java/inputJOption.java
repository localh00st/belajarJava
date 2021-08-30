import javax.swing.*;

public class inputJOption
{
	public static void main (String[] args) throws Exception
	{
		try
		{
			String nama;
			int umur;
			
			nama = JOptionPane.showInputDialog("masukan nama anda : ");
			umur = Integer.parseInt(JOptionPane.showInputDialog("masukan umur anda : "));
			
			System.out.println("nama anda : "+nama);
			System.out.println("umur anda :"+umur+" tahun");
		}
		catch(Exception ie)
		{
			System.out.println("data yng anda input salah");
		}
	}
}

