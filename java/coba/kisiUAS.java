import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class utama extends JFrame implements ActionListener
{
	private Container konten = new Container();
	private JLabel lblNimSatu = new JLabel("angka 1");
	private JLabel lblNimDua = new JLabel("angka 2");
	private JLabel lblNimTiga = new JLabel("angka 3");
	private JTextField txtNimSatu= new JTextField("");
	private JRadioButton rdNimSatu = new JRadioButton("4");
	private JRadioButton rdNimDua = new JRadioButton("6");
	private JComboBox cmbAngka;
	private String Angka[]={"8","10"};
	private JButton btnCetak = new JButton("CETAK");
	private ButtonGroup group1 = new ButtonGroup();
	
	utama()
	{
		super("uas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(100,200);
		//setResizable(false);
		setSize(150,180);
		cmbAngka = new JComboBox(Angka);
		cmbAngka.setMaximumRowCount(2);
		konten = getContentPane();
		konten.setLayout(new GridLayout(5,2));
		konten.add(lblNimSatu);
		konten.add(txtNimSatu);
		
		konten.add(lblNimDua);
		konten.add(rdNimSatu);
		konten.add(new JLabel());
		konten.add(rdNimDua);
		
		konten.add(lblNimTiga);
		konten.add(cmbAngka);
		konten.add(btnCetak);
		
		group1.add(rdNimSatu);
		group1.add(rdNimDua);
		btnCetak.addActionListener(this);
		show();
	}
	public void actionPerformed (ActionEvent AE)
	{
		if(AE.getSource()==btnCetak)
		{
			String tampil="";
			int angka1,angka2,angka3,total;
			angka1 = Integer.parseInt(txtNimSatu.getText());
			angka3 = Integer.parseInt(""+cmbAngka.getSelectedItem());
			
			if(rdNimSatu.isSelected())
			{angka2 = Integer.parseInt(rdNimSatu.getText());}
			else if(rdNimDua.isSelected())
			{angka2 = Integer.parseInt(rdNimDua.getText());}
			else
			{angka2=0;}
			
			total = angka1+angka2+angka3;
			tampil+="hasil \n\n";
			tampil+="angka yng diinput : \n";
			tampil+="angka 1 : "+txtNimSatu.getText()+"\n";
			tampil+="angka 2 : "+angka2+"\n";
			tampil+="angka 3 : "+cmbAngka.getSelectedItem()+"\n";
			tampil+="total		:"+total+"\n";
			
			JOptionPane.showMessageDialog(null,tampil,"pembelian",
			JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
public class kisiUAS
{
	public static void main (String[] args) 
	{
		new utama();
	}
}