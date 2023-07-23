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
import java.awt.Color;

public class InterfaceFelinos extends JFrame implements ActionListener {

	private JPanel contentPane;
	
	JTextField textPane;
	JComboBox comboBoxAniosGato;
	JButton ButtonCalcular;
	JLabel LabelAniosHumanos;
	JLabel LabelTotalAnios;
	JLabel LabelTituloAniosGato;
	JLabel LabelEdadGato;
	
	int anioGato;
	int anioHumano = 4;
	int Iresul;
	String Sresul;
	
	public InterfaceFelinos() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 459, 215);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setTitle("Conversion anios humanos a felinos");
		setLocationRelativeTo(null);
		
		comboBoxAniosGato = new JComboBox();
		comboBoxAniosGato.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25"}));
		comboBoxAniosGato.setBounds(216, 82, 53, 27);
		contentPane.add(comboBoxAniosGato);
		
		LabelTituloAniosGato = new JLabel("Conversión de anios Felinos a Humanos");
		LabelTituloAniosGato.setForeground(new Color(115, 13, 100));
		LabelTituloAniosGato.setFont(new Font("Tahoma", Font.BOLD, 17));
		LabelTituloAniosGato.setHorizontalAlignment(SwingConstants.CENTER);
		LabelTituloAniosGato.setBounds(10, 27, 409, 27);
		contentPane.add(LabelTituloAniosGato);
		
		LabelEdadGato = new JLabel("¿Cual es la edad de tu Michi?");
		LabelEdadGato.setFont(new Font("Tahoma", Font.BOLD, 11));
		LabelEdadGato.setForeground(new Color(128, 0, 64));
		LabelEdadGato.setHorizontalAlignment(SwingConstants.RIGHT);
		LabelEdadGato.setBounds(10, 82, 196, 27);
		contentPane.add(LabelEdadGato);
		
		textPane = new JTextField();
		textPane.setFont(new Font("Tahoma", Font.BOLD, 11));
		textPane.setHorizontalAlignment(SwingConstants.CENTER);
		textPane.setBounds(216, 120, 53, 27);
		contentPane.add(textPane);
		
		LabelTotalAnios = new JLabel("Tu gatito tendria:");
		LabelTotalAnios.setForeground(new Color(128, 0, 64));
		LabelTotalAnios.setFont(new Font("Tahoma", Font.BOLD, 11));
		LabelTotalAnios.setHorizontalAlignment(SwingConstants.RIGHT);
		LabelTotalAnios.setBounds(87, 120, 119, 27);
		contentPane.add(LabelTotalAnios);
		
		LabelAniosHumanos = new JLabel("anios humanos");
		LabelAniosHumanos.setForeground(new Color(128, 0, 64));
		LabelAniosHumanos.setFont(new Font("Tahoma", Font.BOLD, 11));
		LabelAniosHumanos.setBounds(279, 120, 98, 27);
		contentPane.add(LabelAniosHumanos);		
		
		ButtonCalcular = new JButton("Calcular");
		ButtonCalcular.setFont(new Font("Tahoma", Font.BOLD, 11));
		ButtonCalcular.setForeground(new Color(128, 128, 128));
		ButtonCalcular.setBounds(279, 82, 85, 27);
		ButtonCalcular.addActionListener(this);
		contentPane.add(ButtonCalcular);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {		
		anioGato = Integer.parseInt(comboBoxAniosGato.getSelectedItem().toString());
		Iresul = anioHumano * anioGato;
		Sresul = Integer.toString(Iresul);
		textPane.setText(Sresul);
	}
	
}