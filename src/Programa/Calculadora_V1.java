package Programa;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;

public class Calculadora_V1 extends JFrame {

	private JPanel contentPane;
	private JTextField casilla;
	
    float num1,num2;
    String signo;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora_V1 frame = new Calculadora_V1();
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
	public Calculadora_V1() {
		setResizable(false);
		setTitle("JF Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 285, 491);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Software by Jhon F.");
		lblNewLabel.setBounds(75, 427, 114, 14);
		contentPane.add(lblNewLabel);
		
		casilla = new JTextField();
		casilla.setHorizontalAlignment(SwingConstants.RIGHT);
		casilla.setFont(new Font("Tahoma", Font.BOLD, 14));
		casilla.setBounds(10, 24, 250, 41);
		contentPane.add(casilla);
		casilla.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Calculadora_V1.class.getResource("/Iconos/letra-c.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				casilla.setText("");
			}
		});
		btnNewButton.setBounds(10, 95, 55, 55);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1=Float.parseFloat(casilla.getText());
				signo="/";
				casilla.setText("");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Calculadora_V1.class.getResource("/Iconos/barra-oblicua.png")));
		btnNewButton_1.setBounds(75, 95, 55, 55);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1=Float.parseFloat(casilla.getText());
				signo="*";
				casilla.setText("");
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Calculadora_V1.class.getResource("/Iconos/asterisco.png")));
		btnNewButton_2.setBounds(140, 95, 55, 55);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1=Float.parseFloat(casilla.getText());
				signo="-";
				casilla.setText("");
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(Calculadora_V1.class.getResource("/Iconos/menos.png")));
		btnNewButton_3.setBounds(205, 95, 55, 55);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				casilla.setText(casilla.getText()+"7");
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(Calculadora_V1.class.getResource("/Iconos/siete.png")));
		btnNewButton_4.setBounds(10, 159, 55, 55);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				casilla.setText(casilla.getText()+"4");
			}
		});
		btnNewButton_5.setIcon(new ImageIcon(Calculadora_V1.class.getResource("/Iconos/numero-cuatro .png")));
		btnNewButton_5.setBounds(10, 225, 55, 55);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setIcon(new ImageIcon(Calculadora_V1.class.getResource("/Iconos/numero-8.png")));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				casilla.setText(casilla.getText()+"8");
			}
			
		});
		btnNewButton_6.setBounds(75, 161, 55, 55);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				casilla.setText(casilla.getText()+"5");
			}
			
		});
		btnNewButton_7.setIcon(new ImageIcon(Calculadora_V1.class.getResource("/Iconos/numero-5.png")));
		btnNewButton_7.setBounds(75, 225, 55, 55);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				casilla.setText(casilla.getText()+"9");
			}
		});
		btnNewButton_8.setIcon(new ImageIcon(Calculadora_V1.class.getResource("/Iconos/numero-9.png")));
		btnNewButton_8.setBounds(140, 161, 55, 55);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num1=Float.parseFloat(casilla.getText());
				signo="+";
				casilla.setText("");
			}
		});
		btnNewButton_9.setIcon(new ImageIcon(Calculadora_V1.class.getResource("/Iconos/mas.png")));
		btnNewButton_9.setBounds(205, 161, 55, 119);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				casilla.setText(casilla.getText()+"6");
			}
		});
		btnNewButton_10.setIcon(new ImageIcon(Calculadora_V1.class.getResource("/Iconos/seis.png")));
		btnNewButton_10.setBounds(140, 225, 55, 55);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num2=Float.parseFloat(casilla.getText());
				
				switch(signo) {
				
				case "/":
					casilla.setText(Float.toString(num1/num2));
					break;
				
				case "*":
					casilla.setText(Float.toString(num1*num2));
					break;
					
				case "-":
					casilla.setText(Float.toString(num1-num2));
					break;
					
				case "+":
					casilla.setText(Float.toString(num1+num2));
					break;
					
				
				
				}
			}
		});
		btnNewButton_11.setIcon(new ImageIcon(Calculadora_V1.class.getResource("/Iconos/igual.png")));
		btnNewButton_11.setBounds(205, 291, 55, 121);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				casilla.setText(casilla.getText()+"1");
			}
		});
		btnNewButton_12.setIcon(new ImageIcon(Calculadora_V1.class.getResource("/Iconos/numero-uno.png")));
		btnNewButton_12.setBounds(10, 291, 55, 55);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				casilla.setText(casilla.getText()+"2");
			}
		});
		btnNewButton_13.setIcon(new ImageIcon(Calculadora_V1.class.getResource("/Iconos/numero-2.png")));
		btnNewButton_13.setBounds(75, 291, 55, 55);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				casilla.setText(casilla.getText()+"3");
			}
		});
		btnNewButton_14.setIcon(new ImageIcon(Calculadora_V1.class.getResource("/Iconos/numero-3.png")));
		btnNewButton_14.setBounds(140, 291, 55, 55);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_16 = new JButton("");
		btnNewButton_16.setIcon(new ImageIcon(Calculadora_V1.class.getResource("/Iconos/cero.png")));
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				casilla.setText(casilla.getText()+"0");
			}
		});
		btnNewButton_16.setBounds(10, 357, 120, 55);
		contentPane.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				casilla.setText(casilla.getText()+".");
			}
		});
		btnNewButton_17.setIcon(new ImageIcon(Calculadora_V1.class.getResource("/Iconos/punto.png")));
		btnNewButton_17.setBounds(140, 357, 55, 55);
		contentPane.add(btnNewButton_17);
	}
}
