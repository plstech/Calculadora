package pacote;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import org.w3c.dom.events.EventTarget;

import java.awt.Color;
import java.awt.Event;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Calculadora {

	private JFrame frame;
	private JTextField txtTela;

	/**
	 * Launch the application.
	 */
	
	Double valor1, valor2;
	String sinal;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 337, 469);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(12, 364, 67, 53);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtTela.setText(txtTela.getText()+"0");
			}
		});
		frame.getContentPane().setLayout(null);
		btn0.setForeground(new Color(51, 153, 255));
		btn0.setBackground(new Color(51, 51, 51));
		frame.getContentPane().add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(91, 364, 67, 53);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtTela.setText(txtTela.getText()+"1");
			}
		});
		btn1.setForeground(new Color(51, 153, 255));
		btn1.setBackground(new Color(51, 51, 51));
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(170, 364, 67, 53);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtTela.setText(txtTela.getText()+"2");
			}
		});
		btn2.setForeground(new Color(51, 153, 255));
		btn2.setBackground(new Color(51, 51, 51));
		frame.getContentPane().add(btn2);
		
		JButton btnresult = new JButton("=");
		btnresult.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {			
				valor2 = Double.parseDouble(txtTela.getText());
				
				switch(sinal) {
						case "soma":
							txtTela.setText(String.valueOf(valor1+valor2));
							break;
						
						case "subtracao":
							txtTela.setText(String.valueOf(valor1-valor2));
							break;
						case "multi":
							txtTela.setText(String.valueOf(valor1*valor2));
							break;
						case "divisao":
							txtTela.setText(String.valueOf(valor1/valor2));
							break;
				}
			}
		});
		btnresult.setBounds(249, 364, 67, 53);
		btnresult.setForeground(new Color(51, 153, 255));
		btnresult.setBackground(new Color(51, 51, 51));
		frame.getContentPane().add(btnresult);
		
		txtTela = new JTextField();
		txtTela.setBounds(33, 12, 264, 53);
		txtTela.setHorizontalAlignment(SwingConstants.CENTER);
		txtTela.setFont(new Font("Dialog", Font.BOLD, 18));
		txtTela.setForeground(new Color(255, 255, 255));
		txtTela.setBackground(new Color(51, 51, 51));
		frame.getContentPane().add(txtTela);
		txtTela.setColumns(10);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(12, 299, 67, 53);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				txtTela.setText(txtTela.getText()+"3");
			}
		});
		btn3.setForeground(new Color(51, 153, 255));
		btn3.setBackground(new Color(51, 51, 51));
		frame.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(91, 299, 67, 53);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtTela.setText(txtTela.getText()+"4");
			}
		});
		btn4.setForeground(new Color(51, 153, 255));
		btn4.setBackground(new Color(51, 51, 51));
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(170, 299, 67, 53);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtTela.setText(txtTela.getText()+"5");
			}
		});
		btn5.setForeground(new Color(51, 153, 255));
		btn5.setBackground(new Color(51, 51, 51));
		frame.getContentPane().add(btn5);
		
		JButton btnmais = new JButton("+");
		btnmais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				valor1 = Double.parseDouble(txtTela.getText());
				txtTela.setText("");
				sinal = "soma";
			}
		});
		btnmais.setBounds(249, 299, 67, 53);
		btnmais.setForeground(new Color(51, 153, 255));
		btnmais.setBackground(new Color(51, 51, 51));
		frame.getContentPane().add(btnmais);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(12, 234, 67, 53);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtTela.setText(txtTela.getText()+"6");
			}
		});
		btn6.setForeground(new Color(51, 153, 255));
		btn6.setBackground(new Color(51, 51, 51));
		frame.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(91, 234, 67, 53);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtTela.setText(txtTela.getText()+"7");
			}
		});
		btn7.setForeground(new Color(51, 153, 255));
		btn7.setBackground(new Color(51, 51, 51));
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(170, 234, 67, 53);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtTela.setText(txtTela.getText()+"8");
			}
		});
		btn8.setForeground(new Color(51, 153, 255));
		btn8.setBackground(new Color(51, 51, 51));
		frame.getContentPane().add(btn8);
		
		JButton btnmenos = new JButton("-");
		btnmenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtTela.getText());
				txtTela.setText("");
				sinal = "subtracao";
			}
		});
		btnmenos.setBounds(249, 234, 67, 53);
		btnmenos.setForeground(new Color(51, 153, 255));
		btnmenos.setBackground(new Color(51, 51, 51));
		frame.getContentPane().add(btnmenos);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(12, 169, 67, 53);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtTela.setText(txtTela.getText()+"9");
			}
		});
		btn9.setForeground(new Color(51, 153, 255));
		btn9.setBackground(new Color(51, 51, 51));
		frame.getContentPane().add(btn9);
		
		JButton btnvezes = new JButton("x");
		btnvezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtTela.getText());
				txtTela.setText("");
				sinal = "multi";
			}
		});
		btnvezes.setBounds(170, 169, 67, 53);
		btnvezes.setForeground(new Color(51, 153, 255));
		btnvezes.setBackground(new Color(51, 51, 51));
		frame.getContentPane().add(btnvezes);
		
		JButton btnraiz = new JButton("Raiz");
		btnraiz.setBounds(91, 169, 67, 53);
		btnraiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String pegatexto = txtTela.getText().toString();
			int textoint = Integer.parseInt(pegatexto);
			txtTela.setText(""+Math.sqrt(textoint));
			}
		});
		btnraiz.setForeground(new Color(51, 153, 255));
		btnraiz.setBackground(new Color(51, 51, 51));
		frame.getContentPane().add(btnraiz);
		
		JButton btnapagar = new JButton("Apagar");
		btnapagar.setBounds(170, 122, 146, 35);
		btnapagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtTela.setText("");
			}
		});
		btnapagar.setForeground(new Color(51, 153, 255));
		btnapagar.setBackground(new Color(51, 51, 51));
		frame.getContentPane().add(btnapagar);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtTela.getText());
				txtTela.setText("");
				sinal = "divisao";
			}
		});
		btndiv.setForeground(new Color(51, 153, 255));
		btndiv.setBackground(new Color(51, 51, 51));
		btndiv.setBounds(249, 169, 67, 53);
		frame.getContentPane().add(btndiv);
		
		JButton btnSobre = new JButton("Sobre");
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Created by: Pedro Lucas Miranda(pedrodev.c)\nInstagram:");
			}
		});
		btnSobre.setForeground(new Color(255, 255, 255));
		btnSobre.setBackground(new Color(51, 51, 51));
		btnSobre.setBounds(12, 130, 95, 27);
		frame.getContentPane().add(btnSobre);
	}
}
