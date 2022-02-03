import java.awt.*;
import java.applet.*;
public class doremon extends Applet
{
	Font obj=new Font("Algerian",Font.BOLD,30);
	public void init()
	{
		setBackground(Color.pink);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillOval(202,205,185,195);	
		g.setColor(Color.black);
		g.drawOval(202,205,185,195);
		
		g.setColor(Color.blue);
		int x1[]={250,220,225,250,250,350,350,375,380,350};
		int y1[]={375,460,470,450,510,510,450,470,460,375};
		int n1=10;
		g.fillPolygon(x1,y1,n1);
				
		//white round
		g.setColor(Color.white);
		g.fillOval(212,230,165,165);
		g.setColor(Color.black);
		g.drawLine(250,450,250,410);
		g.drawLine(347,450,347,410);
		
		//hands
		g.setColor(Color.white);
		g.fillOval(208,440,30,30);
		g.fillOval(363,440,30,30);
		g.setColor(Color.black);
		g.drawOval(208,440,30,30);
		g.drawOval(363,440,30,30);

		//pocket
		g.setColor(Color.white);
		g.fillOval(251,385,95,110); 
		g.setColor(Color.black);  
		g.drawArc(257,390,80,90,180,180);
		g.drawLine(257,432,337,432);

		//belt
		g.setColor(Color.red);
		g.fillRect(246,385,105,7);
		g.setColor(Color.yellow);
		g.fillOval(287,389,25,25);
		g.setColor(Color.black);
		g.drawLine(291,395,308,395);	
		g.drawLine(291,398,308,398);	
		g.fillOval(297,400,5,5);

		//legs
		g.setColor(Color.black);
		g.drawLine(300,500,300,510);
		g.setColor(Color.white);	
		g.fillRoundRect(243,500,60,25,90,90);	
		g.fillRoundRect(303,500,60,25,90,90);
		g.setColor(Color.black);	
		g.drawRoundRect(243,500,60,25,90,90);	
		g.drawRoundRect(303,500,60,25,90,90);

		//eyes
		g.setColor(Color.white);
		g.fillOval(255,210,40,50);
		g.setColor(Color.black);
		g.drawOval(255,210,40,50);
		g.setColor(Color.white);
		g.fillOval(295,210,40,50);
		g.setColor(Color.black);
		g.drawOval(295,210,40,50);
		
		g.setColor(Color.black);
		g.fillOval(270,230,10,15);
		g.setColor(Color.white);
		
		g.setColor(Color.black);
		g.fillOval(310,230,10,15);
		g.setColor(Color.white);
		
		//nose
		g.setColor(Color.red);
		g.fillOval(282,253,25,25);
		g.setColor(Color.black);
		g.drawLine(293,277,293,289);
		g.setColor(Color.white);
		g.fillOval(285,258,10,10);
		
		//mishya
		g.setColor(Color.black);
		g.drawLine(265,261,240,256);
		g.drawLine(265,266,240,266);
		g.drawLine(265,272,240,276);
		g.drawLine(325,261,345,256);
		g.drawLine(325,266,345,266);
		g.drawLine(325,272,345,276);
		
		//mouth
		g.setColor(Color.red);
		g.fillArc(235,230,120,125,180,180);
		g.setColor(Color.black);
		
		g.setFont(obj);
		g.drawString("Woow!!!   DoraCakes!!!!", 60,60);
		
	}
}
/*
<applet code=doremon.class
	width=900 height=900>
</applet>
*/