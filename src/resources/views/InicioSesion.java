package resources.views;

import java.awt.EventQueue;

import javax.swing.JFrame;

import config.Resources;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Component;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import app.Controllers.GeneralController;

import com.jgoodies.forms.layout.FormSpecs;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyAdapter;

public class InicioSesion {

	private JFrame frame;
	private JTextField txtUsuario;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void iniciar() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion window = new InicioSesion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InicioSesion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\Documents and Settings\\BlackCrystal\u2122\\workspace\\Administrador\\src\\public\\icono.PNG"));
		frame.getContentPane().setBackground(SystemColor.inactiveCaptionText);
		frame.getContentPane().setLayout(null);
		
		frame.setBounds(100, 100, 344, 327);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Llamamos el nombre de la ventana utilizando esta función
		frame.setTitle("Iniciar Sesión - " + Resources.PROGRAM_NAME);
		
		JLabel lblIniciarSesin = new JLabel(Resources.PROGRAM_NAME);
		lblIniciarSesin.setBounds(28, 11, 263, 38);
		lblIniciarSesin.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblIniciarSesin.setHorizontalTextPosition(SwingConstants.CENTER);
		lblIniciarSesin.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblIniciarSesin.setHorizontalAlignment(SwingConstants.CENTER);
		
		frame.getContentPane().add(lblIniciarSesin);
		
		JLabel lblIniciarSesin_1 = new JLabel("Iniciar Sesi\u00F3n");
		lblIniciarSesin_1.setSize(130, 30);
		lblIniciarSesin_1.setLocation(93, 47);
		lblIniciarSesin_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIniciarSesin_1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblIniciarSesin_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		
		frame.getContentPane().add(lblIniciarSesin_1);
		
		txtUsuario = new JTextField();
		txtUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsuario.setToolTipText("Ingrese a continuaci\u00F3n su usuario");
		txtUsuario.setBounds(28, 118, 153, 30);
		frame.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(28, 93, 54, 14);
		frame.getContentPane().add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(28, 159, 86, 14);
		frame.getContentPane().add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Ingrese a continuaci\u00F3n la contrase\u00F1a");
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(28, 184, 153, 30);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String usuario = txtUsuario.getText();
				String contrasena = passwordField.getText();
				
				GeneralController controller = new GeneralController();
				InicioSesionIncorrecto dialog = new InicioSesionIncorrecto();
				
				controller.iniciarSesion(usuario, contrasena, dialog);
			}
		});
		
		btnNewButton.setBounds(28, 225, 117, 30);
		frame.getContentPane().add(btnNewButton);
	}
}
