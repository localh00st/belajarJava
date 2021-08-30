import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class kalkulator extends JFrame implements ActionListener
{
	private Container konten = new Container();
	private JPanel panel = new JPanel();
	private JButton tambah = new JButton("+");
	private	JButton kurang = new JButton("-");
	private JButton kali = new JButton("*");
	private JButton bagi = new JButton("/");
	private JButton satu  = new JButton("1");
	private JButton dua = new JButton("2");
	private JButton tiga= new JButton("3");
	private JButton empat = new JButton("4");
	private JButton lima = new JButton("5");
	private JButton enam = new JButton("6");
	private JButton tujuh = new JButton("7");
	private JButton delapan = new JButton("8");
	private JButton sembilan = new JButton("9");
	private JButton nol = new JButton("0");
	private JButton hasil = new JButton("=");
	private JTextField input = new JTextField("");
	
	kalkulator()
	{
		super("kalkulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(400,200);
		setSize(480,360);
		setResizable(false);
		
		konten = getContentPane();
		konten.setLayout(new GridLayout(4,5));
				
		konten.add(input);
		konten.add(tambah);
		konten.add(kali);
		konten.add(kurang);
		konten.add(bagi);
		
		konten.add(satu);
		konten.add(dua);
		konten.add(tiga);
		konten.add(empat);
		konten.add(lima);
		konten.add(enam);
		konten.add(tujuh);
		konten.add(delapan);
		konten.add(sembilan);
		konten.add(nol);
		konten.add(hasil);		
		
		hasil.addActionListener(this);
		show();
	}
	public void actionPerformed(ActionEvent AE)
	{
		if(AE.getSource()==hasil)
		{
			String tampil="";
			int satu1,dua2,tiga3,empat4,lima5,enam,tujuh7,delapan8,
				sembilan9,nol0,kl,bg,tb,kr,total;
				
				satu1 = Integer.parseInt(input.getText());
				dua2 = Integer.parseInt(input.getText());
				
				if(satu.isSelected())
				{total = Integer.parseInt(satu.getText());}
				else if(dua.isSelected())
				{total = Integer.parseInt(dua.getText());}
				else
				{total = 0;}
				
				//total =
		}
	}
}
public class test
{
	public static void main (String[] args) 
	{
		new kalkulator();
	}
}