package controlador;

import vista.VentanaCalculadora;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.*;
import java.util.*;

public class ManejadorRaton implements MouseListener{
	
	VentanaCalculadora ventana;
	
	public ManejadorRaton (VentanaCalculadora ventana) {
		this.ventana=ventana;		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource()==ventana.getSumarButton()) {
			Image imgSumarON = new ImageIcon("img//sumaON.png").getImage();
			ventana.getSumarButton().setIcon(new ImageIcon(imgSumarON.getScaledInstance(120, 120, imgSumarON.SCALE_SMOOTH)));
		}
		
		if (e.getSource()==ventana.getRestarButton()) {
			Image imgRestarON = new ImageIcon("img//restaON.png").getImage();
			ventana.getRestarButton().setIcon(new ImageIcon(imgRestarON.getScaledInstance(120, 120, imgRestarON.SCALE_SMOOTH)));
		}
		
		if (e.getSource()==ventana.getMultiplicarButton()) {
			Image imgMultiplicarON = new ImageIcon("img//multiON.png").getImage();
			ventana.getMultiplicarButton().setIcon(new ImageIcon(imgMultiplicarON.getScaledInstance(120, 120, imgMultiplicarON.SCALE_SMOOTH)));
		}
		
		if (e.getSource()==ventana.getDividirButton()) {
			Image imgDividirON = new ImageIcon("img//divON.png").getImage();
			ventana.getDividirButton().setIcon(new ImageIcon(imgDividirON.getScaledInstance(120, 120, imgDividirON.SCALE_SMOOTH)));
		}
		
		if (e.getSource()==ventana.getRaiz2Button()) {
			Image imgRaiz2ON = new ImageIcon("img//sqrtON.png").getImage();
			ventana.getRaiz2Button().setIcon(new ImageIcon(imgRaiz2ON.getScaledInstance(120, 120, imgRaiz2ON.SCALE_SMOOTH)));
		}
		
		if (e.getSource()==ventana.getRaiz3Button()) {
			Image imgRaiz3ON = new ImageIcon("img//curtON.png").getImage();
			ventana.getRaiz3Button().setIcon(new ImageIcon(imgRaiz3ON.getScaledInstance(120, 120, imgRaiz3ON.SCALE_SMOOTH)));
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource()==ventana.getSumarButton()) {
			Image imgSumar = new ImageIcon("img//suma.png").getImage();
			ventana.getSumarButton().setIcon(new ImageIcon(imgSumar.getScaledInstance(120, 120, imgSumar.SCALE_SMOOTH)));
		}
		
		if (e.getSource()==ventana.getRestarButton()) {
			Image imgRestar = new ImageIcon("img//resta.png").getImage();
			ventana.getRestarButton().setIcon(new ImageIcon(imgRestar.getScaledInstance(120, 120, imgRestar.SCALE_SMOOTH)));
		}
		
		if (e.getSource()==ventana.getMultiplicarButton()) {
			Image imgMultiplicar = new ImageIcon("img//multi.png").getImage();
			ventana.getMultiplicarButton().setIcon(new ImageIcon(imgMultiplicar.getScaledInstance(120, 120, imgMultiplicar.SCALE_SMOOTH)));
		}
		
		if (e.getSource()==ventana.getDividirButton()) {
			Image imgDividir = new ImageIcon("img//div.png").getImage();
			ventana.getDividirButton().setIcon(new ImageIcon(imgDividir.getScaledInstance(120, 120, imgDividir.SCALE_SMOOTH)));
		}
		
		if (e.getSource()==ventana.getRaiz2Button()) {
			Image imgRaiz2 = new ImageIcon("img//sqrt.png").getImage();
			ventana.getRaiz2Button().setIcon(new ImageIcon(imgRaiz2.getScaledInstance(120, 120, imgRaiz2.SCALE_SMOOTH)));
		}
		
		if (e.getSource()==ventana.getRaiz3Button()) {
			Image imgRaiz3 = new ImageIcon("img//curt.png").getImage();
			ventana.getRaiz3Button().setIcon(new ImageIcon(imgRaiz3.getScaledInstance(120, 120, imgRaiz3.SCALE_SMOOTH)));
		}
		
	}
		


	
	

}
