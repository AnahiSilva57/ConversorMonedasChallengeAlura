package Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class InterfaceChallenge extends JFrame implements ActionListener {

	private JPanel contentPane;
	
	Button buttonMoneda;
	Button buttonCaninos;
	Button buttonFelinos;
	private JButton ButtonSalir;
	
	
	public InterfaceChallenge() {
		
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 413, 457);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 244, 244));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setTitle("Programa conversor"); // agregado
		setLocationRelativeTo(null);
		
		JLabel lblEncabezado = new JLabel("Challenge Conversor");
		lblEncabezado.setForeground(new Color(0, 64, 128));
		lblEncabezado.setFont(new Font("Calibri Light", Font.BOLD, 17));
		lblEncabezado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEncabezado.setBounds(0, 95, 387, 30);
		contentPane.add(lblEncabezado);
		
		Label label1 = new Label("ONE Oracle Next Education + Alura LATAM");
		label1.setForeground(new Color(255, 128, 0));
		label1.setFont(new Font("Calibri Light", Font.BOLD, 17));
		label1.setAlignment(Label.CENTER);
		label1.setBounds(0, 44, 387, 45);
		contentPane.add(label1);
		
		buttonMoneda = new Button("Moneda");
		buttonMoneda.setForeground(new Color(255, 255, 255));
		buttonMoneda.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonMoneda.setBackground(new Color(128, 255, 0));
		buttonMoneda.setBounds(137, 147, 118, 30);
		buttonMoneda.addActionListener(this);
		contentPane.add(buttonMoneda);
		
		buttonCaninos = new Button("Anios caninos");
		buttonCaninos.setForeground(new Color(255, 255, 255));
		buttonCaninos.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonCaninos.setBackground(new Color(128, 255, 0));
		buttonCaninos.setBounds(137, 253, 118, 30);
		buttonCaninos.addActionListener(this);
		contentPane.add(buttonCaninos);
		
		buttonFelinos = new Button("Anios felinos");
		buttonFelinos.setForeground(new Color(255, 255, 255));
		buttonFelinos.setBackground(new Color(128, 255, 0));
		buttonFelinos.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonFelinos.setBounds(137, 201, 118, 30);
		buttonFelinos.addActionListener(this);
		contentPane.add(buttonFelinos);
		
		ButtonSalir = new JButton("Salir");
		ButtonSalir.setBackground(new Color(255, 255, 255));
		ButtonSalir.setFont(new Font("Tahoma", Font.BOLD, 11));
		ButtonSalir.setForeground(new Color(255, 128, 128));
		ButtonSalir.setBounds(158, 337, 79, 23);
		ButtonSalir.addActionListener(this);
		contentPane.add(ButtonSalir);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			if (buttonMoneda==e.getSource()) {
				InterfaceMoneda interfaceMon = new InterfaceMoneda();
				interfaceMon.setVisible(true);
			}
			if (buttonCaninos==e.getSource()) {				
				InterfaceCaninos interfaceCanino = new InterfaceCaninos();
				interfaceCanino.setVisible(true);
				
			}
			if (buttonFelinos==e.getSource()) {				
				InterfaceFelinos interfacefelino = new InterfaceFelinos();
				interfacefelino.setVisible(true);
			}
			if (ButtonSalir==e.getSource()) {				
				VentanaValidarSalida venvalsal = new VentanaValidarSalida();
				venvalsal.preguntarSalir();				
			}
	}
}

