
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;

import javax.swing.*;
/**
 * Este clase me genera un JFrame y me adecua el JFrame segun sus componentes
 * @author Corin Viracacha y Isaac Gomez
 */


public class VentanaJFrame extends JFrame {
	PanelArriba panelArriba;
	static PanelAbajo panelAbajo;
	static PanelCentro panelCentro;
	static PanelIzquierdo panelBusqueda;
	static PanelDerecho panelFormulario;

	/**
	 * Contructor de la clase VentanaJFrame aqui se inician los elementos que conforman el JFrame
	 */
	VentanaJFrame(){
		 super("Ventana JFrame Principal");
		 iniciar();
		 componente();
		 setVisible(true);
		 pack();
         setLocationRelativeTo( null );
	}
	/**
	 * Metodo de configuracion del JFrame en cuanto a diseño
	 * @return retorna el JFrame y su diseño
	 */
	public VentanaJFrame iniciar(){
				
				Dimension dims = new Dimension(750, 700);
				this.setSize(dims);
				this.setPreferredSize(dims);
				this.getContentPane( ).setLayout( new BorderLayout( ) );//ORGANIZAR ARRIBA
				//this.setResizable(false); 
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//retorna al Jframe todos los elementos impuestos al Jframe
				return this;
	}
	
	/**
	 * Metodo para ubicar los componentes(paneles)
	 */
	public void componente() {
		panelArriba = new PanelArriba( );
        add(panelArriba, BorderLayout.NORTH);

        panelAbajo = new PanelAbajo();
        add( panelAbajo, BorderLayout.SOUTH );

        panelFormulario = new PanelDerecho();
        add(panelFormulario , BorderLayout.WEST);
        
        panelBusqueda = new PanelIzquierdo();
        add(panelBusqueda , BorderLayout.EAST );
        
        panelCentro = new PanelCentro( );
        add( panelCentro, BorderLayout.CENTER );
   
	}

}