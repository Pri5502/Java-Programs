import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CardLayoutExample extends JFrame implements ActionListener
{
	CardLayout card;
	JButton b1,b2,b3,b4;
	Container c;
	ImageIcon im,im2,im3,im4;
	CardLayoutExample()
	{
		c=getContentPane();
		im=new ImageIcon();
		card=new CardLayout(40,30);
		c.setLayout(card);
		im=new ImageIcon("shr1.gif");
		im2=new ImageIcon("shr2.gif");
		im3=new ImageIcon("shr3.gif");
		im4=new ImageIcon("shr4.gif");
		b1=new JButton(im);
		b2=new JButton(im2);
		b3=new JButton(im3);
		b4=new JButton(im4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
	}
	public void actionPerformed(ActionEvent ae)
	{
		card.next(c);
	}
	public static void main(String args[])
	{
		CardLayoutExample c1=new CardLayoutExample();
		c1.setSize(400,400);
		c1.setVisible(true);
		c1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}	

}