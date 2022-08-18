package funciones;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCalculaMedia extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField textUf2404;
	private JTextField textUf2405;
	private JTextField textUf2406;
	private JTextField txtNoCalculadoAun;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCalculaMedia frame = new VentanaCalculaMedia();
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
	public VentanaCalculaMedia() {
		setFont(new Font("Verdana", Font.PLAIN, 14));
		setTitle("Calcular Media MF227");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][grow]", "[][][][][][][][]"));
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNombre, "cell 0 0");
		
		txtNombre = new JTextField();
		contentPane.add(txtNombre, "cell 2 0,growx");
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("UF2404");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel, "cell 0 2");
		
		textUf2404 = new JTextField();
		contentPane.add(textUf2404, "flowx,cell 2 2,alignx left");
		textUf2404.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("UF2405");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1, "cell 2 2");
		
		textUf2405 = new JTextField();
		contentPane.add(textUf2405, "cell 2 2");
		textUf2405.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("UF2406");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_2, "cell 2 2");
		
		textUf2406 = new JTextField();
		contentPane.add(textUf2406, "cell 2 2");
		textUf2406.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular Nota");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Object String;
				calculaNota(String);
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(btnNewButton, "cell 2 4,alignx center");
		
		JLabel lblNewLabel_4 = new JLabel("Nota Media");
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_4, "cell 0 6");
		
		JLabel lblNewLabel_5 = new JLabel("0.0");
		contentPane.add(lblNewLabel_5, "cell 2 6");
		
		JLabel lblNewLabel_3 = new JLabel("Resultado");
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_3, "cell 0 7");
		
		txtNoCalculadoAun = new JTextField();
		txtNoCalculadoAun.setFont(new Font("Verdana", Font.PLAIN, 14));
		txtNoCalculadoAun.setText("No calculado aun");
		contentPane.add(txtNoCalculadoAun, "cell 2 7,growx");
		txtNoCalculadoAun.setColumns(10);
	}

	protected void calculaNota(Object string) {
		
		
	}

}
