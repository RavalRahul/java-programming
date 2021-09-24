import java.awt.*;
import java.applet.*;

public class demo extends Applet {

	public void init() {
	}

	public void centerString(Graphics g)
	{
		int x = getSize().width;
		int y = getSize().height;

		int c1 = x/2;
		int c2 = y/2;

		g.drawString("applet", c1, c2 );
	}

	public void paint(Graphics g) {

		centerString(g);

	}
}


/* 
<applet code="demo.class" width="300" height="300"> 
</applet> 
*/  