package vista;

import javax.swing.*;
import java.awt.*;
import controlador.ManejadorEventos;
import controlador.ManejadorRaton;
import java.io.*;

public class VentanaCalculadora extends JFrame{
	
	private JTextField num1TF, num2TF;
	private JLabel etiquetaNum1, etiquetaNum2, etiquetaRes, etiquetaResFinal, title;
	private JButton sumarButton, restarButton, multiplicarButton, dividirButton, raiz2Button, raiz3Button;
	

	public VentanaCalculadora() {
		setSize(525,800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculadora");
		setIconImage(Toolkit.getDefaultToolkit().getImage("img//curt.png"));
		setResizable(false);
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes(){
		
		getContentPane().setBackground(new Color(212,236,249));
		
		Image imgTitle = new ImageIcon("img//title.png").getImage();
		title = new JLabel(new ImageIcon(imgTitle.getScaledInstance(300, 75, imgTitle.SCALE_SMOOTH)));
		title.setBounds(0, 20, 500, 75);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		add(title);
		
		
		etiquetaNum1 = new JLabel("NUM 1");
		etiquetaNum1.setBounds(130, 110, 60, 30);
		etiquetaNum1.setForeground(new Color (86, 146, 156));
		etiquetaNum1.setFont(new Font("Dialog", Font.BOLD, 18));
		add(etiquetaNum1);
		
		num1TF = new JTextField();
		num1TF.setBounds(125, 150, 60, 30);		
		add(num1TF);
		
		etiquetaNum2 = new JLabel("NUM 2");
		etiquetaNum2.setBounds(330, 110, 60, 30);
		etiquetaNum2.setForeground(new Color (86, 146, 156));
		etiquetaNum2.setFont(new Font("Dialog", Font.BOLD, 18));
		add(etiquetaNum2);
		
		num2TF = new JTextField();
		num2TF.setBounds(325, 150, 60, 30);
		add(num2TF);
		
		Image imgSumar = new ImageIcon("img//suma.png").getImage();
		sumarButton = new JButton(new ImageIcon(imgSumar.getScaledInstance(120, 120, imgSumar.SCALE_SMOOTH)));
		sumarButton.setBounds(100, 200, 120, 120);
		sumarButton.setBackground(null);
		sumarButton.setBorder(null);
		add(sumarButton);
		
		Image imgRestar = new ImageIcon("img//resta.png").getImage();
		restarButton = new JButton(new ImageIcon (imgRestar.getScaledInstance(120, 120, imgRestar.SCALE_SMOOTH)));
		restarButton.setBounds(300, 200, 120, 120);
		restarButton.setBackground(null);
		restarButton.setBorder(null);
		add(restarButton);
		
		Image imgMultiplicar = new ImageIcon("img//multi.png").getImage();
		multiplicarButton = new JButton(new ImageIcon (imgMultiplicar.getScaledInstance(120, 120, imgMultiplicar.SCALE_SMOOTH)));
		multiplicarButton.setBounds(100, 350, 120, 120);
		multiplicarButton.setBackground(null);
		multiplicarButton.setBorder(null);
		add(multiplicarButton);
		
		Image imgDividir = new ImageIcon("img//div.png").getImage();
		dividirButton = new JButton(new ImageIcon (imgDividir.getScaledInstance(120, 120, imgDividir.SCALE_SMOOTH)));
		dividirButton.setBounds(300, 350, 120, 120);
		dividirButton.setBackground(null);
		dividirButton.setBorder(null);
		add(dividirButton);
		
		Image imgRaiz2 = new ImageIcon("img//sqrt.png").getImage();
		raiz2Button = new JButton(new ImageIcon (imgRaiz2.getScaledInstance(120, 120, imgRaiz2.SCALE_SMOOTH)));
		raiz2Button.setBounds(100, 500, 120, 120);
		raiz2Button.setBackground(null);
		raiz2Button.setBorder(null);
		add(raiz2Button);
		
		Image imgRaiz3 = new ImageIcon("img//curt.png").getImage();
		raiz3Button = new JButton(new ImageIcon (imgRaiz3.getScaledInstance(120, 120, imgRaiz2.SCALE_SMOOTH)));
		raiz3Button.setBounds(300, 500, 120, 120);
		raiz3Button.setBackground(null);
		raiz3Button.setBorder(null);
		add(raiz3Button);
		
		try {
			Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("NexaDemo-Bold.ttf"));
			etiquetaRes = new JLabel("RESULTADO");
			etiquetaRes.setFont(font.deriveFont(48f));
			etiquetaRes.setHorizontalAlignment(SwingConstants.CENTER);
			etiquetaRes.setBounds(0,650,285,30);
			add(etiquetaRes);
		}catch (FontFormatException | IOException e) {
			etiquetaRes = new JLabel("RESULTADO");
			etiquetaRes.setBounds(0, 650, 525, 30);
			etiquetaRes.setFont(new Font("Dialog", Font.BOLD, 30));
			etiquetaRes.setHorizontalAlignment(SwingConstants.CENTER);
			etiquetaRes.setForeground(new Color (86, 146, 156));
			add(etiquetaRes);			
		}
		
		
		
		etiquetaResFinal = new JLabel("");
		etiquetaResFinal.setBounds(0, 700, 525, 30);
		etiquetaResFinal.setFont(new Font("Impact", Font.BOLD, 40));
		etiquetaResFinal.setHorizontalAlignment(SwingConstants.CENTER);
		etiquetaResFinal.setForeground(new Color (86, 146, 156));
		add(etiquetaResFinal);
				
	}
	
	public void setManejador(ManejadorEventos manejador){
		sumarButton.addActionListener(manejador);
		restarButton.addActionListener(manejador);
		multiplicarButton.addActionListener(manejador);
		dividirButton.addActionListener(manejador);
		raiz2Button.addActionListener(manejador);
		raiz3Button.addActionListener(manejador);		
		
	}
	
	public void setManejadorRaton (ManejadorRaton raton) {
		sumarButton.addMouseListener(raton);
		restarButton.addMouseListener(raton);
		multiplicarButton.addMouseListener(raton);
		dividirButton.addMouseListener(raton);
		raiz2Button.addMouseListener(raton);
		raiz3Button.addMouseListener(raton);
	}

	public JLabel getEtiquetaResFinal() {
		return etiquetaResFinal;
	}

	public JButton getRaiz3Button() {
		return raiz3Button;
	}

	public JTextField getNum1TF() {
		return num1TF;
	}

	public JTextField getNum2TF() {
		return num2TF;
	}

	public JButton getSumarButton() {
		return sumarButton;
	}

	public JButton getRestarButton() {
		return restarButton;
	}

	public JButton getMultiplicarButton() {
		return multiplicarButton;
	}

	public JButton getDividirButton() {
		return dividirButton;
	}

	public JButton getRaiz2Button() {
		return raiz2Button;
	}
	

}
