import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		// System.in
		// System.out
		// System.err
		// java.io osztályon keresztül
		bevitel();
		
		// GUI új szálként
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				AblakFgv Ablak = new AblakFgv();
				Ablak.kirak();
			}
		});
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				SajatAblak Ablak = new SajatAblak();
				Ablak.SajatAblak();
			}
		});
		
		kirak2();
	}
	
	public static void bevitel() {
		int a;
		double b;
		String s;
		Scanner be = new Scanner(System.in);
		System.out.println("Kérek egy egész számot: ");
		a = be.nextInt();
		System.out.println("Kérek egy tört számot: ");
		b = be.nextDouble();
		System.out.println("Kérek egy stringet: ");
		s = be.next();
		System.out.println("A beolvasott egész szám: " + a);
		System.out.println("A beolvasott tört szám: " + b);
		System.out.println("A beolvasott string: " + s);
	}
	
	public static void kirak2() {
		JFrame Ablak = new JFrame("Ablak");
		Ablak.setSize(800, 600);
		JLabel Cimke = new JLabel("Hello Java!");
		Cimke.setForeground(Color.BLUE);
		Cimke.setHorizontalAlignment(JLabel.CENTER);
		Cimke.setFont(new Font("Liberation Sans", Font.ITALIC, 100));
		Ablak.add(Cimke);
		Ablak.setVisible(true);
	}
}
