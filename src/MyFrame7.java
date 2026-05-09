import java.awt.FlowLayout;
import java.awt.event.*; 
import javax.swing.*; 

public class MyFrame7 extends JFrame implements ActionListener{

	JMenuBar meunBar; 
	JMenu fileMenu; 
	JMenu editMenu; 
	JMenu helpMenu; 
	JMenuItem loadItem; 
	JMenuItem saveItem; 
	JMenuItem exitItem; 
	ImageIcon loadIcon; 
	ImageIcon saveIcon;
	ImageIcon exitIcon; 
	
	MyFrame7(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		loadIcon = new ImageIcon("load.png");
		saveIcon = new ImageIcon("save.png");
		exitIcon = new ImageIcon("exit.png");
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit"); 
		JMenu helpMenu = new JMenu("Help"); 
		
		JMenuItem loadItem = new JMenuItem("Load");
		JMenuItem saveItem = new JMenuItem("Save");
		JMenuItem exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		fileMenu.setMnemonic(KeyEvent.VK_F);//Alt + f for file
		editMenu.setMnemonic(KeyEvent.VK_E);//Alt + e for edit
		helpMenu.setMnemonic(KeyEvent.VK_H);//Alt + h for help
		loadItem.setMnemonic(KeyEvent.VK_L);//l for load
		saveItem.setMnemonic(KeyEvent.VK_S);//s for save
		exitItem.setMnemonic(KeyEvent.VK_E);//e for exit
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		fileMenu.add(loadItem); 
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu); 
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar); 
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==loadItem)
		{
			System.out.println("You loaded a file"); //8:25:31
		}
		if(e.getSource()==saveItem)
		{
			System.out.println("You saved a file"); 
		}
		if(e.getSource()==exitItem)
		{
			System.exit(0); 
		}
		
	}

}
