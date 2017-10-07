
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.*;
import javax.swing.border.Border;



public class PanelIzquierdo extends JPanel {
	static JButton registrar3,registrar4,registrar11,registrar22,registrar12;
	int dato;
	int a=0;
	public PanelIzquierdo(){
		
		Border borde = BorderFactory.createTitledBorder( "" );
	    setBorder( borde );
		setLayout(new GridBagLayout());
		GridBagConstraints contenido = new GridBagConstraints();
		
		JLabel etiqueta = new JLabel("    ");
		etiqueta.setForeground(Color.BLACK);
		contenido.fill = GridBagConstraints.CENTER;
		contenido.weightx = 0.3;
		contenido.weighty = 0.003;
		contenido.gridx = 0;
		contenido.gridy = 0;
		add(etiqueta, contenido);
	  
		registrar11 = new JButton();
		registrar11.setBackground(Color.ORANGE);
		registrar11.setToolTipText("JOvalButton in BorderLayout.Center without Preferrered Diameter");
		registrar11.setText("<<");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.3;
		contenido.weightx = 0.3;
		contenido.gridx = 1;
		contenido.gridy = 1;
		add(registrar11, contenido);
		
		registrar22 = new JButton();
		registrar22.setBackground(Color.ORANGE);
		registrar22.setText("<<");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.3;
		contenido.weightx = 0.3;
		contenido.gridx = 1;
		contenido.gridy = 2;
		add(registrar22, contenido);
		
		
	
		
		
		
		
		
	}


}