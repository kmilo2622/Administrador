package resources.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextPane;

public class InicioSesionIncorrecto extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public void iniciarJdialog() {
		try {
			InicioSesionIncorrecto dialog = new InicioSesionIncorrecto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public InicioSesionIncorrecto() {
		setBounds(100, 100, 366, 212);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblErrorAlIniciar = new JLabel("Error al Iniciar Sesi\u00F3n");
		lblErrorAlIniciar.setBounds(10, 26, 140, 14);
		contentPanel.add(lblErrorAlIniciar);
		
		JLabel lblVerifiquePorFavor = new JLabel("Verifique por favor:");
		lblVerifiquePorFavor.setBounds(10, 43, 130, 14);
		contentPanel.add(lblVerifiquePorFavor);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 68, 46, 14);
		contentPanel.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(10, 86, 82, 14);
		contentPanel.add(lblContrasea);
		
		JLabel lblConexinAInternet = new JLabel("Conexi\u00F3n a Internet");
		lblConexinAInternet.setBounds(10, 103, 102, 14);
		contentPanel.add(lblConexinAInternet);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 141, 253, 33);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				JButton okButton = new JButton("Volver");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
