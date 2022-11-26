package controlador;

import vista.VentanaCalculadora;
import vista.VentanaContraseña;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.text.*;
import java.util.*;

import java.awt.event.*;

public class ManejadorEventos implements ActionListener {
	
	private VentanaCalculadora ventana;
	double num1, num2, res;
	private static String pass = "pass";
	String msg="";
	NumberFormat nf = NumberFormat.getNumberInstance(Locale.ENGLISH);
	DecimalFormat df = (DecimalFormat)nf;
	NumberFormat formatter = new DecimalFormat("#0,00"); 
	
	public ManejadorEventos (VentanaCalculadora ventana) {
		this.ventana=ventana;		
	}
	
@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==ventana.getSumarButton()) {			
			if (checkNum(ventana.getNum1TF().getText(), ventana.getNum2TF().getText())) {
				this.getNum();
				res = num1 + num2;
				ventana.getEtiquetaResFinal().setText(Double.toString(res));
			}else {
				ventana.getEtiquetaResFinal().setText("Valores no validos");
			}
		}
		
		if (e.getSource()==ventana.getRestarButton()) {			
			if (checkNum(ventana.getNum1TF().getText(), ventana.getNum2TF().getText())) {
				this.getNum();
				res = num1 - num2;
				ventana.getEtiquetaResFinal().setText(Double.toString(res));
			}else {
				ventana.getEtiquetaResFinal().setText("Valores no validos");
			}
		}
		
		if (e.getSource()==ventana.getMultiplicarButton()) {			
			if (checkNum(ventana.getNum1TF().getText(), ventana.getNum2TF().getText())) {
				this.getNum();
				res = num1 * num2;
				ventana.getEtiquetaResFinal().setText(Double.toString(res));
			}else {
				ventana.getEtiquetaResFinal().setText("Valores no validos");
			}
		}
		
		if (e.getSource()==ventana.getDividirButton()) {			
			if (checkNum(ventana.getNum1TF().getText(), ventana.getNum2TF().getText())) {
				this.getNum();
				res = num1 / num2;
				ventana.getEtiquetaResFinal().setText(Double.toString(res));
			}else {
				ventana.getEtiquetaResFinal().setText("Valores no validos");
			}
		}
		
		if (e.getSource()==ventana.getRaiz2Button()) {			
			JOptionPane.showMessageDialog(null, "opción no disponible");
		}
		
	
		if (e.getSource()==ventana.getRaiz3Button()) {			
			msg = JOptionPane.showInputDialog(null, "Introduzca contraseña", "Contraseña", JOptionPane.QUESTION_MESSAGE);
			try {
				if (msg.equals(pass)){
					if (checkNum(ventana.getNum1TF().getText())){
						this.getNum();
						res=Math.cbrt(num1);
						ventana.getEtiquetaResFinal().setText(Double.toString(res));
					}else{
						ventana.getEtiquetaResFinal().setText("Valores no validos");
					}
				}else {
					ventana.getEtiquetaResFinal().setText("Contraseña no válida");
				}
			
		}catch (NullPointerException error) {
			ventana.getEtiquetaResFinal().setText("Falta contraseña");
		}
	}
		
	}

	private boolean checkNum (String num1, String num2) {
		if (num1.matches("\\d|\\d(.)*") && num2.matches("\\d|\\d(.)*")){
			return true;
		}
		return false;
		}
	private boolean checkNum (String num1) {
		if (num1.matches("\\d|\\d(.)*")){
			return true;
		}
		return false;
		}
	
	private void getNum() {
		num1 = Double.parseDouble(ventana.getNum1TF().getText());
		try {
		num2= Double.parseDouble(ventana.getNum2TF().getText());
		}catch (Exception e){
			num2=0;
		}
	}
		
	
}
