package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PantallaSesion extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtNivel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaSesion frame = new PantallaSesion();
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
	public PantallaSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 353, 193);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBotn = new JButton("OK");
		btnBotn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nivel = Integer.parseInt(txtNivel.getText());
				if (1 <= nivel & nivel <= 3 ) {
					JOptionPane.showMessageDialog(contentPane, "Generando sudoku..." );
					
				}else {
					JOptionPane.showMessageDialog(contentPane, "Introduzca una dificultad entre 1 y 3", "Error", 0);
					
				}
			}
		});
		btnBotn.setBounds(137, 125, 58, 21);
		contentPane.add(btnBotn);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(34, 28, 52, 13);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(88, 25, 166, 19);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNivel = new JLabel("Nivel:");
		lblNivel.setBounds(34, 74, 45, 13);
		contentPane.add(lblNivel);
		
		txtNivel = new JTextField();
		txtNivel.setBounds(89, 71, 137, 19);
		contentPane.add(txtNivel);
		txtNivel.setColumns(10);
	}
	
	public int getNivel() {
		int nivel = Integer.parseInt(txtNivel.getText());
		return nivel;
	}
	
}