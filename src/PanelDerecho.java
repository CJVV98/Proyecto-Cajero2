
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.Border;


import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.util.ArrayList;
////PARA MAP
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/**
 * Este panel tiene una botones para indicar las operaciones a realizar
 * @author Corin Viracacha y Isaac Gomez
 */
public class PanelDerecho extends JPanel {
	//Panel de botones
	  static JButton retiroef,consultarsa,transferencias,registrar11,registrar22,registrar12;
		/**
		 * Metodo constructor del panel derecho
		 */
	  public PanelDerecho() {
		  	//Creo un borde  ademas de un gridbaglayout
		  	Border borde = BorderFactory.createTitledBorder( "" );
		    setBorder( borde );
			setLayout(new GridBagLayout());
			GridBagConstraints contenido = new GridBagConstraints();
			
			JLabel etiqueta = new JLabel("    ");
			etiqueta.setForeground(Color.BLACK);
			contenido.fill = GridBagConstraints.CENTER;
			//el contenido.weightx y contenido.weighty me indica cuantos espacios va a ocupar dentro del JFrame
			contenido.weightx = 0.3;
			contenido.weighty = 0.003;
			contenido.gridx = 0;
			contenido.gridy = 0;
			add(etiqueta, contenido);
			// este boton es un diseño dentro de la ventana principal
			registrar11 = new JButton();
			registrar11.setBackground(Color.ORANGE);
			registrar11.setText(">>");
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weighty = 0.3;
			contenido.weightx = 0.3;
			contenido.gridx = 1;
			contenido.gridy = 1;
			add(registrar11, contenido);
			// este boton es un diseño dentro de la ventana principal
			registrar22 = new JButton();
			registrar22.setBackground(Color.ORANGE);
			registrar22.setText(">>");
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weighty = 0.3;
			contenido.weightx = 0.3;
			contenido.gridx = 1;
			contenido.gridy = 2;
			add(registrar22, contenido);
			// este boton es un diseño dentro de la ventana principal
			registrar12 = new JButton();
			registrar12.setBackground(Color.ORANGE);
			registrar12.setText(">>");
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weighty = 0.3;
			contenido.weightx = 0.3;
			contenido.gridx = 1;
			contenido.gridy = 3;
			add(registrar12, contenido);
			
			
			

		
	  }
	  
	 
}
		
		