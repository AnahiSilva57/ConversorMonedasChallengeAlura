package Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;

public class InterfaceCaninos extends JFrame implements ActionListener {

	private JPanel contentPane;
	
	JTextField textPane;
	JComboBox comboBoxAniosPerro;
	JButton ButtonCalcular;
	JLabel LabelAniosHumanos;
	JLabel LabelTotalAnios;
	JLabel LabelTituloAniosPerro;
	JLabel LabelEdadPerro;
	
	int anioPerro;
	int anioHumano = 18;
	int Iresul;
	String Sresul;
	
	public InterfaceCaninos() {
		setBackground(new Color(243, 243, 243));
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 215);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(243, 243, 243));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setTitle("Conversion anios humanos a caninos");
		setLocationRelativeTo(null);
		
		LabelTotalAnios = new JLabel("Tu perrito tendria:");
		LabelTotalAnios.setFont(new Font("Tahoma", Font.BOLD, 11));
		LabelTotalAnios.setForeground(new Color(0, 128, 128));
		LabelTotalAnios.setHorizontalAlignment(SwingConstants.RIGHT);
		LabelTotalAnios.setBounds(41, 120, 172, 27);
		contentPane.add(LabelTotalAnios);
		
		comboBoxAniosPerro = new JComboBox();
		comboBoxAniosPerro.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25"}));
		comboBoxAniosPerro.setBounds(223, 82, 53, 27);
		contentPane.add(comboBoxAniosPerro);
		
		LabelTituloAniosPerro = new JLabel("Conversión de anios Caninos a Humanos");
		LabelTituloAniosPerro.setForeground(new Color(0, 64, 128));
		LabelTituloAniosPerro.setFont(new Font("Tahoma", Font.BOLD, 17));
		LabelTituloAniosPerro.setHorizontalAlignment(SwingConstants.CENTER);
		LabelTituloAniosPerro.setBounds(10, 27, 414, 27);
		contentPane.add(LabelTituloAniosPerro);
		
		LabelEdadPerro = new JLabel("¿Cual es la edad de Firulais?");
		LabelEdadPerro.setFont(new Font("Tahoma", Font.BOLD, 11));
		LabelEdadPerro.setForeground(new Color(0, 128, 128));
		LabelEdadPerro.setHorizontalAlignment(SwingConstants.RIGHT);
		LabelEdadPerro.setBounds(10, 82, 203, 27);
		contentPane.add(LabelEdadPerro);
		
		textPane = new JTextField();
		textPane.setFont(new Font("Tahoma", Font.BOLD, 11));
		textPane.setHorizontalAlignment(SwingConstants.CENTER);
		textPane.setBounds(223, 120, 53, 27);
		contentPane.add(textPane);
		
		LabelAniosHumanos = new JLabel("anios humanos");
		LabelAniosHumanos.setForeground(new Color(0, 128, 128));
		LabelAniosHumanos.setFont(new Font("Tahoma", Font.BOLD, 11));
		LabelAniosHumanos.setBounds(286, 120, 99, 27);
		contentPane.add(LabelAniosHumanos);		
		
		ButtonCalcular = new JButton("Calcular");
		ButtonCalcular.setFont(new Font("Tahoma", Font.BOLD, 11));
		ButtonCalcular.setForeground(new Color(128, 128, 128));
		ButtonCalcular.setBounds(286, 82, 86, 27);
		ButtonCalcular.addActionListener(this);
		contentPane.add(ButtonCalcular);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		anioPerro = Integer.parseInt(comboBoxAniosPerro.getSelectedItem().toString());
		Iresul = anioHumano * anioPerro;
		Sresul = Integer.toString(Iresul);
		textPane.setText(Sresul);
	}
	
}
