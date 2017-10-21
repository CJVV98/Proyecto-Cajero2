
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.*;
import javax.swing.border.Border;



public class PanelIzquierdo extends JPanel {
	static JButton pagos,cambiocl,registrar11,registrar22,registrar12;
	int dato;
	int a=0;
	public PanelIzquierdo(){
		//Panel izquierdo de botones
		// añado un border sin titulo ademas creo un setLayout de tipo GridBagLayout
		Border borde = BorderFactory.createTitledBorder( "" );
	    setBorder( borde );
		setLayout(new GridBagLayout());
		GridBagConstraints contenido = new GridBagConstraints();
		// esta etiqueta es para el diseño del Panel Izquierdo
		JLabel etiqueta = new JLabel("    ");
		etiqueta.setForeground(Color.BLACK);
		contenido.fill = GridBagConstraints.CENTER;
		contenido.weightx = 0.3;
		contenido.weighty = 0.003;
		contenido.gridx = 0;
		contenido.gridy = 0;
		add(etiqueta, contenido);
		// este boton es diseño para la interfaz principal del cajero lo mismo que el boton 22
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