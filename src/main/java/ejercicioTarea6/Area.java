package ejercicioTarea6;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


public class Area {

	private JFrame frmArea;
	private JTextField txtBase;
	private JTextField txtAltura;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Area window = new Area();
					window.frmArea.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		public Area() {
		initialize();
	}


	private void initialize() {
		frmArea = new JFrame();
		frmArea.setTitle("Area");
		frmArea.setBounds(100, 100, 395, 354);
		frmArea.setLocationRelativeTo(null);
		frmArea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmArea.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Base");
		lblNewLabel.setBounds(26, 66, 68, 27);
		frmArea.getContentPane().add(lblNewLabel);
		
		txtBase = new JTextField();
		txtBase.setBounds(104, 66, 238, 27);
		frmArea.getContentPane().add(txtBase);
		txtBase.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Altura");
		lblNewLabel_1.setBounds(26, 104, 68, 27);
		frmArea.getContentPane().add(lblNewLabel_1);
		
		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(104, 104, 238, 27);
		frmArea.getContentPane().add(txtAltura);
		
		//BOTON CALCULAR
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double base = Double.parseDouble(txtBase.getText().toString());
					double altura = Double.parseDouble(txtAltura.getText().toString());
					double area = (base*altura)/2;
					lblResultado.setText("El area es  " + area);
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "ERROR");
					
				}
			}
		});
		
		btnCalcular.setBounds(75, 152, 89, 23);
		frmArea.getContentPane().add(btnCalcular);
		
		//BOTON BORRAR
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBase.setText(null);
				txtAltura.setText(null);
				lblResultado.setText(null);
			}
		});
		
		btnBorrar.setBounds(227, 152, 89, 23);
		frmArea.getContentPane().add(btnBorrar);
		
		lblResultado = new JLabel("");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblResultado.setBounds(26, 218, 316, 45);
		frmArea.getContentPane().add(lblResultado);
		
		JLabel lblResultado_1 = new JLabel("Área del Triángulo");
		lblResultado_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblResultado_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblResultado_1.setBounds(26, 0, 316, 45);
		frmArea.getContentPane().add(lblResultado_1);
	}

}
