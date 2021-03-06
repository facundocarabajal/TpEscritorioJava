package interfaz;

//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.Image;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.*;

public class Juego extends JFrame 
{
	
private JLabel lblfoto;

	private JPanel contentPane;
		/**
	 * Launch the application. facundocarabajal
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego frame = new Juego();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Juego() 
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\lucia\\Pictures\\foto.png"));
		setTitle("Turned Based Combat !");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		/////////////////////INSTRUCCIONES////////////////////////
		JButton btnInstrucciones = new JButton("Instrucciones");
		btnInstrucciones.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		btnInstrucciones.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				Instrucciones.main(null);
			}
		});
		/////////////////////SALIR////////////////////////
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSalir.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Integer b;
			
				b=JOptionPane.showConfirmDialog(null, "�Esta seguro?", "Est� por salir del juego", DISPOSE_ON_CLOSE);
				if (b==0) System.exit(0);
			}
		});
		/////////////////////INICIO////////////////////////
		JButton btnIniciarPartida = new JButton("Iniciar Partida");
		btnIniciarPartida.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnIniciarPartida.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame2.main(null);
				
			}
		});
		
		
		JLabel lblTurnedBasedCombat = DefaultComponentFactory.getInstance().createTitle("");
		lblTurnedBasedCombat.setIcon(new ImageIcon(Juego.class.getResource("/GUI/PersonajesTBC/cooltext206674046505259.png")));
		lblTurnedBasedCombat.setForeground(Color.ORANGE);
		lblTurnedBasedCombat.setFont(new Font("Tahoma", Font.BOLD, 17));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(156)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnIniciarPartida, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnInstrucciones, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnSalir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(35)
							.addComponent(lblTurnedBasedCombat)))
					.addContainerGap(86, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTurnedBasedCombat)
					.addGap(18)
					.addComponent(btnIniciarPartida)
					.addGap(18)
					.addComponent(btnInstrucciones)
					.addGap(18)
					.addComponent(btnSalir)
					.addContainerGap(52, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	}


