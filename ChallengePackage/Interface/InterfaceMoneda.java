package Interface;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Control.CalculoMonedaGlobal;
import Control.CalculoMonedaPesoMexicano;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Label;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.Button;
import java.awt.TextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class InterfaceMoneda extends JFrame implements ActionListener {

	private JPanel contentPane;
	
	Button buttonCalcular;
	JComboBox comboBoxUsuario;
	JComboBox comboBoxDivisa;
	JLabel labelTuMonedaEs;
	Label labelDivisaAConvertir;	
	private JLabel LabelTituloDivisa;

	public InterfaceMoneda() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 373, 299);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setTitle("Conversion de Divisa");
		setLocationRelativeTo(null);
		
		labelTuMonedaEs = new JLabel("Tu moneda es:");
		labelTuMonedaEs.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelTuMonedaEs.setForeground(new Color(0, 64, 0));
		labelTuMonedaEs.setHorizontalAlignment(SwingConstants.CENTER);
		labelTuMonedaEs.setBounds(40, 89, 133, 25);
		contentPane.add(labelTuMonedaEs);
		
		comboBoxUsuario = new JComboBox();
		comboBoxUsuario.setModel(new DefaultComboBoxModel(new String[] {"Peso mexicano", "Peso chileno", "Peso argentino", "Dolar americano", "Dolar canadiense", "Libra esterlina", "Yen"}));
		comboBoxUsuario.setBounds(183, 89, 121, 25);
		contentPane.add(comboBoxUsuario);
		
		labelDivisaAConvertir = new Label("Divisa a convertir:");
		labelDivisaAConvertir.setForeground(new Color(0, 64, 0));
		labelDivisaAConvertir.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelDivisaAConvertir.setAlignment(Label.CENTER);
		labelDivisaAConvertir.setBounds(40, 152, 133, 22);
		contentPane.add(labelDivisaAConvertir);
		
		comboBoxDivisa = new JComboBox();
		comboBoxDivisa.setModel(new DefaultComboBoxModel(new String[] {"Peso mexicano", "Peso chileno", "Peso argentino", "Dolar americano", "Dolar canadiense", "Libra esterlina", "Yen"}));
		comboBoxDivisa.setBounds(183, 152, 121, 22);
		contentPane.add(comboBoxDivisa);
		
		buttonCalcular = new Button("Calcular");
		buttonCalcular.setForeground(new Color(128, 128, 128));
		buttonCalcular.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonCalcular.setBackground(new Color(255, 255, 255));
		buttonCalcular.setBounds(185, 198, 121, 22);
		buttonCalcular.addActionListener(this);
		contentPane.add(buttonCalcular);	
		
		LabelTituloDivisa = new JLabel("Conversión de Divisa");
		LabelTituloDivisa.setForeground(new Color(0, 64, 64));
		LabelTituloDivisa.setFont(new Font("Tahoma", Font.BOLD, 17));
		LabelTituloDivisa.setHorizontalAlignment(SwingConstants.CENTER);
		LabelTituloDivisa.setBounds(10, 24, 337, 33);
		contentPane.add(LabelTituloDivisa);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String monedaSelUsuario = comboBoxUsuario.getSelectedItem().toString();
		String monedaSelDivisa = comboBoxDivisa.getSelectedItem().toString();
		
		CalculoMonedaGlobal calmonglo = new CalculoMonedaGlobal();		
		calmonglo.seleccionarConversion(monedaSelUsuario, monedaSelDivisa);					
	}
	
}
