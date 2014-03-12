package gsrand;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AppWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField 	textfield_max;
	JTextField 	textfield_set1, textfield_set2, textfield_set3, textfield_set4, textfield_set5;

	JButton		button, button_exit;

	public AppWindow() {
		this.getContentPane().setLayout(null);

		this.initWindow();
	}

	protected void initWindow() 
	{
		// Instanzieren:
		textfield_max = new JTextField();
		textfield_set1 = new JTextField();
		textfield_set2 = new JTextField();
		textfield_set3 = new JTextField();
		textfield_set4 = new JTextField();
		textfield_set5 = new JTextField();

		// Hier auch gleich die Beschriftung des Buttons mit angeben:
		button = new JButton("Los");
		button_exit = new JButton("Ende");

		// Positionen festlegen
		textfield_max.setBounds(5,10,50,25);
		textfield_set1.setBounds(5,80,50,25);
		textfield_set2.setBounds(60,80,50,25);
		textfield_set3.setBounds(115,80,50,25);
		textfield_set4.setBounds(170,80,50,25);
		textfield_set5.setBounds(225,80,50,25);


		button.setBounds(300,10,100,30);
		button_exit.setBounds(300, 110, 100, 30);

		// Elemente dem Fenster hinzufügen:
		// (this ist ein Zeiger auf dieses Objekt, also das Fenster)
		this.getContentPane().add(textfield_max);
		this.getContentPane().add(textfield_set1);
		this.getContentPane().add(textfield_set2);
		this.getContentPane().add(textfield_set3);
		this.getContentPane().add(textfield_set4);
		this.getContentPane().add(textfield_set5);
		this.getContentPane().add(button);
		this.getContentPane().add(button_exit);

		JLabel label = new JLabel( "Lebe immer First-Class, sonst tun es deine Erben!" );
	    label.setForeground( Color.BLUE );

	    this.getContentPane().add( label );
		
		
		// Das kommt ganz am Ende:
		this.pack();

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gsrand.calcSet();
			}

		});

		button_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

	}
}
