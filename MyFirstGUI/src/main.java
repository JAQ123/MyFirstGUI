import javax.swing.JFrame;

public class main 
{
	public static void main (String[] args)
	{
		JFrame mainFrame = new JFrame();
		
		mainFrame.setSize(1280,720);
		
		mainFrame.setTitle("El GUI");
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyComponent carComponent = new MyComponent();
		mainFrame.add(carComponent);
		
		mainFrame.setVisible(true);
	}
}
