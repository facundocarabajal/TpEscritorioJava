package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ElegirPersonaje extends JFrame 
{
	
public JLabel elejido;

	public JLabel getElejido() 
{
	return this.elejido;
}

public void setElejido(JLabel elejido) 
{
	this.elejido = elejido;
}



	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElegirPersonaje frame = new ElegirPersonaje();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		class MenuPersonajes
{
			ElegirPersonaje a = new ElegirPersonaje();
	JLabel elegido =a.getElejido();
		
}
	}

	/**
	 * Create the frame.
	 */
	public ElegirPersonaje() {
		setTitle("Elija un personaje");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ElegirPersonaje.class.getResource("/GUI/foto.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel l1 = new JLabel("");
		l1.setIcon(new ImageIcon(ElegirPersonaje.class.getResource("/GUI/PersonajesTBC/CaveMan.png")));
		
		JLabel l2 = new JLabel("");
		l2.setIcon(new ImageIcon(ElegirPersonaje.class.getResource("/GUI/PersonajesTBC/Frank.png")));
		
		JLabel l3 = new JLabel("");
		l3.setIcon(new ImageIcon(ElegirPersonaje.class.getResource("/GUI/PersonajesTBC/HarryP.png")));
		
		JLabel l4 = new JLabel("");
		l4.setIcon(new ImageIcon(ElegirPersonaje.class.getResource("/GUI/PersonajesTBC/Mago.png")));
		
		
		
/*-----------------------------elije y pasa a asignar puntos-------------------------*/		
 	
		JRadioButton e1 = new JRadioButton("");		
		e1.addActionListener(new ActionListener() {
			
			//private JLabel elegido;
			public void actionPerformed(ActionEvent e)
			{
				JLabel elegido =l1;
				setElejido(l1);
			
					
			}
		});
		
		JRadioButton e2 = new JRadioButton("");
		e2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				JLabel elegido =l2;
			}
		});
		
		JRadioButton e3 = new JRadioButton("");
		e3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				JLabel elegido =l3;
			}
		});
		
		JRadioButton e4 = new JRadioButton("");
		e4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				JLabel elegido =l2;
			}
		});
		
		JButton btnElegir = new JButton("Elegir");
		btnElegir.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				AsignacionPersonajes.main(null);
							
			}
		});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(l1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(l2))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(49)
							.addComponent(e1)
							.addGap(84)
							.addComponent(e2)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(l3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(l4))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(45)
							.addComponent(e3)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(e4)
							.addGap(40))))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(329, Short.MAX_VALUE)
					.addComponent(btnElegir)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(l1)
						.addComponent(l2)
						.addComponent(l3)
						.addComponent(l4))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(e1)
						.addComponent(e2)
						.addComponent(e3)
						.addComponent(e4))
					.addPreferredGap(ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
					.addComponent(btnElegir)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
