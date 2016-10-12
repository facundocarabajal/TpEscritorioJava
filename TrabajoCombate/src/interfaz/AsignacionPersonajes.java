package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.Box;
import java.awt.Font;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class AsignacionPersonajes extends JFrame 
{
	///////////////////////////GETTERS SETTERS///////////////////////////

	public static int getEnergia()
	{
		return energia;
	}

	public static void setEnergia(int energia)
	{
		AsignacionPersonajes.energia = energia;
	}

	public static int getDefensa() 
	{
		return defensa;
	}

	public static void setDefensa(int defensa) 
	{
		AsignacionPersonajes.defensa = defensa;
	}

	public static int getEvasion() 
	{
		return evasion;
	}

	public static void setEvasion(int evasion) 
	{
		AsignacionPersonajes.evasion = evasion;
	}

	public static String getNombre() 
	{
		return nombre;
	}

	public static void setNombre(String nombre)
	{
		AsignacionPersonajes.nombre = nombre;
	}
	//////////////////////////////VARIABLES /////////////////////////////////
	private JPanel contentPane;
	private JTextField txtEnergia;
	static int energia= 0;
	private JTextField txtDefensa;
	static int defensa= 0;
	private JTextField txtEvasion;
	static int evasion= 0;
	private JTextField txtNombre;
	static String nombre = new String();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					AsignacionPersonajes frame = new AsignacionPersonajes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}//FIN MAIN

	/**
	 * Create the frame.
	 */
	public AsignacionPersonajes() 
	{
		
		
		setTitle("Turned Based Combat !");
		setIconImage(Toolkit.getDefaultToolkit().getImage(AsignacionPersonajes.class.getResource("/GUI/foto.png")));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JLabel lblP1 = new JLabel();
		lblP1.setIcon(new ImageIcon(AsignacionPersonajes.class.getResource("/GUI/PersonajesTBC/CaveMan.png")));
		
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				MyDataAcces conexion = new MyDataAcces();
				 System.out.println("Agregando Personaje");
				 
				 
				
			}
		});
		btnContinuar.setIcon(new ImageIcon(AsignacionPersonajes.class.getResource("/GUI/fecha.png")));
		
		JLabel lbNombre = new JLabel("Nombre:");
		
		JLabel lblEnergia = new JLabel("Energia:");
		
		JLabel lblDefensa = new JLabel("Defensa:");
		
		JLabel lblEvasion = new JLabel("Evasion:");
		
		JLabel lblPuntos = new JLabel("Puntos Totales:");
		
		
		txtNombre = new JTextField();
		txtNombre.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				nombre = txtNombre.getText();
				System.out.println(nombre);
			}
		});
		txtNombre.setColumns(10);
		
		txtEnergia = new JTextField();
		txtEnergia.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String energia =new String();
			}
		});
		txtEnergia.setColumns(10);
		
		txtDefensa = new JTextField();
		txtDefensa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String defensa =new String();
			}
		});
		txtDefensa.setColumns(10);
		
		txtEvasion = new JTextField();
		txtEvasion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String evasion =new String();
			}
		});
		txtEvasion.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		
		txtNombre = new JTextField();
		txtNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String nombre = new String ();
			}
		});
		
		txtNombre.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblEnergia)
						.addComponent(lblNombre)
						.addComponent(lblDefensa)
						.addComponent(lblEvasion))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtDefensa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnContinuar)
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(txtEvasion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(59)
											.addComponent(lblNombre))
										.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtEnergia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblP1)
										.addComponent(txtNombre, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))))
							.addGap(18))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(44)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNombre))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtEnergia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEnergia))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtDefensa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDefensa)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addComponent(lblP1)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(73)
							.addComponent(btnContinuar))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtEvasion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEvasion)
								.addComponent(lblNombre)
								.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(15))
		);
		contentPane.setLayout(gl_contentPane);
	}// FIN FRAME
}//FIN CLASS
