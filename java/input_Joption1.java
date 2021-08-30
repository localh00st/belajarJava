import javax.swing.*;

public class input_Joption1
{
	public static void main (String[] args) throws Exception
	{
		try
		{
			int a, b, c, tambah;
		
			a = Integer.parseInt(JOptionPane.showInputDialog("input angka 1 : "));
			b = Integer.parseInt(JOptionPane.showInputDialog("input angka 2 : "));
			c = Integer.parseInt(JOptionPane.showInputDialog("input angka 3 : "));
			
			tambah = a + b + c;
			JOptionPane.showMessageDialog(null, "total angka yang diinput " +tambah);

			
		}
		catch(Exception ie)
		{
			System.out.println("data yng anda input salah");
		}
	}
}
