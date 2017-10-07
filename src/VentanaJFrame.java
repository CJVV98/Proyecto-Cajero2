
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Map;

import javax.swing.*;



public class VentanaJFrame extends JFrame {
	PanelArriba panelArriba;
	static PanelAbajo panelAbajo;
	static PanelCentro panelCentro;
	static PanelIzquierdo panelBusqueda;
	static PanelDerecho panelFormulario;

	
	VentanaJFrame(){
		 super("Ventana JFrame Principal");
		 iniciar();
		 componente();
		 setVisible(true);
		 pack();
		// Centrar la ventana
         setLocationRelativeTo( null );
	}
	
	public VentanaJFrame iniciar(){
				
				Dimension dims = new Dimension(750, 700);
				this.setSize(dims);
				this.setPreferredSize(dims);
				this.getContentPane( ).setLayout( new BorderLayout( ) );//ORGANIZAR ARRIBA
				//this.setResizable(false); 
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				return this;
	}
	
	
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