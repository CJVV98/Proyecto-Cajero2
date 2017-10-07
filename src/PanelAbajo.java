import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class PanelAbajo extends JPanel {
	    

    static JButton btnOpcion1,registrar2,boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton02,continuar,salir,cancelar,continuar1;
    static JLabel etiqueta52,saldo1;
	static int bandera=0,cedula,valor,claveerronea=0;
	static JTextField cajadetexto;
	static GridBagConstraints contenido;
	static JTextField clave1,clave4;
	static String clavevalidar="", clavevalidar1="";
	static int b=0,i,a=1;
	
	public PanelAbajo( ) {
	
	Border borde = BorderFactory.createTitledBorder( "" );
    setBorder( borde );
	setLayout(new GridBagLayout());
	contenido = new GridBagConstraints();
	
	JLabel etiqueta = new JLabel("  ");
	etiqueta.setForeground(Color.BLACK);
	contenido.fill = GridBagConstraints.CENTER;
	contenido.weightx = 86;
	contenido.weighty = 0.003;
	contenido.gridx = 0;
	contenido.gridy = 0;
	add(etiqueta, contenido);
	
	
			
	JLabel etiqueta1 = new JLabel("");
	etiqueta1.setForeground(Color.BLACK);
	contenido.fill = GridBagConstraints.BOTH;
	contenido.weightx =86;
	contenido.weighty = 0.003;
	contenido.gridx = 5;
	contenido.gridy = 0;
	add(etiqueta1, contenido);
	
	
	
	boton1 = new JButton();
	boton1 .setBackground(Color.ORANGE);
	boton1.setSize(5, 5);
	boton1 .setText("1");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.003;
	contenido.weightx =0.2;
	contenido.gridx = 1;
	contenido.gridy = 1;
	add(boton1 , contenido);
	

	
	boton2  = new JButton();
	boton2.setBackground(Color.ORANGE);
	boton2.setSize(5, 5);
	boton2.setText("2");

	contenido.fill =  GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.00003;
	contenido.weightx =0.2;
	contenido.gridx = 2;
	contenido.gridy = 1;
	add(boton2, contenido);
	
	boton3  = new JButton();
	boton3.setBackground(Color.ORANGE);
	boton2.setSize(5, 5);
	boton3.setText("3");
	contenido.fill = GridBagConstraints.CENTER;
	contenido.weighty = 0.3;

	contenido.gridx = 3;
	contenido.gridy = 1;
	add(boton3, contenido);
	
	boton4  = new JButton();
	boton4.setBackground(Color.ORANGE);
	boton4.setText("4");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 1;
	contenido.gridy = 2;
	add(boton4, contenido);

	
	boton5  = new JButton();
	boton5.setAlignmentX(CENTER_ALIGNMENT);
	boton5.setBackground(Color.ORANGE);
	boton5.setText("5");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 2;
	contenido.gridy = 2;
	add(boton5, contenido);
	
	boton6  = new JButton();
	boton6.setBackground(Color.ORANGE);
	boton6.setText("6");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 3;
	contenido.gridy = 2;
	add(boton6, contenido);
	
	boton7  = new JButton();
	boton7.setBackground(Color.ORANGE);
	boton7.setText("7");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 1;
	contenido.gridy = 3;
	add(boton7, contenido);
	
	boton8  = new JButton();
	boton8.setBackground(Color.ORANGE);
	boton8.setText("8");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 2;
	contenido.gridy = 3;
	add(boton8, contenido);
	
	boton9  = new JButton();
	boton9.setBackground(Color.ORANGE);
	boton9.setText("9");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 3;
	contenido.gridy = 3;
	add(boton9, contenido);
	
	cancelar = new JButton();
	cancelar.setForeground(Color.WHITE);
	cancelar.setBackground(Color.red);
	cancelar.setText("CANCELAR");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 4;
	contenido.gridy = 1;
	add(cancelar, contenido);
	
	JButton limpiar = new JButton();
	limpiar.setForeground(Color.WHITE);
	limpiar.setBackground(Color.red);
	limpiar.setText("LIMPIAR");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 4;
	contenido.gridy = 2;
	add(limpiar, contenido);
	
	salir = new JButton();
	salir.setForeground(Color.WHITE);
	salir.setBackground(Color.red);
	salir.setText("SALIR");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 4;
	contenido.gridy = 3;
	add(salir, contenido);

	JButton boton01 = new JButton();
	boton01.setBackground(Color.ORANGE);
	boton01.setText("#");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 1;
	contenido.gridy = 4;
	add(boton01, contenido);
	
	boton02 = new JButton();
	boton02.setBackground(Color.ORANGE);
	boton02.setText("0");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 2;
	contenido.gridy = 4;
	add(boton02, contenido);
	
	JButton boton03 = new JButton();
	boton03.setBackground(Color.ORANGE);
	boton03.setText("*");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 1;
	contenido.weightx = 1;
	contenido.gridx = 3;
	contenido.gridy = 4;
	add(boton03, contenido);
	
	JLabel etiqueta42 = new JLabel("     ");
	etiqueta42.setForeground(Color.BLACK);
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weightx = 3;
	contenido.weighty = 3;
	contenido.gridx = 0;
	contenido.gridy = 5;
	add(etiqueta42, contenido);
	
	
	JLabel etiqueta12 = new JLabel("RETIRE SU DINERO:                  ");
	etiqueta12.setForeground(Color.BLACK);
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weightx = 3;
	contenido.weighty = 3;
	contenido.gridx = 0;
	contenido.gridy = 8;
	add(etiqueta12, contenido);
	
	etiqueta52 = new JLabel("MENSAJE ");
	etiqueta52.setForeground(Color.BLACK);
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weightx = 3;
	contenido.weighty = 3;
	contenido.gridx = 0;
	contenido.gridy = 9;
	add(etiqueta52, contenido);
	
	
	JLabel etiqueta13 = new JLabel("INGRESE SU TARJETA");
	etiqueta13.setForeground(Color.BLACK);
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weightx = 1;
	contenido.weighty = 1;
	contenido.gridx = 5;
	contenido.gridy = 6;
	add(etiqueta13, contenido);
	
	cajadetexto = new JTextField();
	cajadetexto.setText("CC");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weightx = 0.03;
	contenido.gridx = 5;
	contenido.gridy = 7;
	add(cajadetexto, contenido);
	
	registrar2 = new JButton();
	registrar2.setBackground(Color.ORANGE);
	registrar2.setText(">>");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.3;
	contenido.gridx = 6;
	contenido.gridy = 7;
	add(registrar2, contenido);
	
	
	JLabel etiqueta14 = new JLabel("AGREGAR USUARIO NUEVO");
	etiqueta14.setForeground(Color.BLACK);
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.3;
	contenido.gridx = 5;
	contenido.gridy = 8;
	add(etiqueta14, contenido);
	
	JButton registrar16 = new JButton();
	registrar16.setBackground(Color.ORANGE);
	registrar16.setText("AGREGAR USUARIO");
	registrar16.setAlignmentX(LEFT_ALIGNMENT);
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.3;
	contenido.gridx = 5;
	contenido.gridy = 9;
	add(registrar16, contenido);
	
	JLabel registrar = new JLabel("");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.ipady = 0;       //reset to default
	contenido.weighty = 1.0;   //request any extra vertical space
	contenido.anchor = GridBagConstraints.PAGE_END; //bottom of space
	contenido.insets = new Insets(10,5,10,5);  //top padding
	contenido.gridx = 6;       //aligned with button 2
	contenido.gridwidth = 2;   //2 columns wide
	contenido.gridy = 10;       //third row
	add(registrar, contenido);
	
	registrar2.addActionListener (new ActionListener(){
		public void actionPerformed(ActionEvent e){		
			ingresar();
		}

	});
			registrar16.addActionListener (new ActionListener(){
				public void actionPerformed(ActionEvent e){
					Usuario usuario = new Usuario("USUARIO");
				
			
				
		}}

			);
		cancelar.addActionListener (new ActionListener(){
				public void actionPerformed(ActionEvent e){			
					ingresar();
				
			
				
		}}

			);
			
		boton1.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
			
				clavevalidar=clavevalidar+"1";
				clave1.setText(clavevalidar);
				

	}});
		boton2.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clavevalidar=clavevalidar+"2";
				clave1.setText(clavevalidar);
			}
	});
		boton3.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clavevalidar=clavevalidar+"3";
				clave1.setText(clavevalidar);
			}
	});
		boton4.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clavevalidar=clavevalidar+"4";
				clave1.setText(clavevalidar);
			}
	});
		boton5.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clavevalidar=clavevalidar+"5";
				clave1.setText(clavevalidar);
			}
	});
		boton6.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clavevalidar=clavevalidar+"6";
				clave1.setText(clavevalidar);
			}
	});
		boton7.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clavevalidar=clavevalidar+"7";
				clave1.setText(clavevalidar);
			}
	});
		boton8.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clavevalidar=clavevalidar+"8";
				clave1.setText(clavevalidar);
			}
	});
		boton9.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clavevalidar=clavevalidar+"9";
				clave1.setText(clavevalidar);
			}
	});
		boton02.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clavevalidar=clavevalidar+"0";
				clave1.setText(clavevalidar);
			}
	});
		
	
}
	
	public static void ingresar() {
		try {
			etiqueta52.setText("BIENVENIDO");
			
			for(int i=0;i<Usuario.lista.size();i++) {
				try {
				if(Usuario.lista.get(i).getcedula()==Integer.parseInt(cajadetexto.getText())) {
					bandera=1;
					cedula=i;}
				}catch(java.lang.NumberFormatException sd) {
					JOptionPane.showMessageDialog(null, "El numero de la tarjeta es incorrecto", "error", JOptionPane.ERROR_MESSAGE); 
					cajadetexto.setText("");
				}
				}
			
				if(bandera==0) {
					JOptionPane.showMessageDialog(null, "El numero de la tarjeta es incorrecto", "error", JOptionPane.ERROR_MESSAGE); 
					cajadetexto.setText("");
				}
				if(bandera==1) {
					etiqueta52.setText(".");
					VentanaJFrame.panelCentro.removeAll();
					VentanaJFrame.panelCentro.repaint();
					VentanaJFrame.panelBusqueda.removeAll();
					VentanaJFrame.panelBusqueda.repaint();
					VentanaJFrame.panelFormulario.removeAll();
					VentanaJFrame.panelFormulario.repaint();
					registrar2.setEnabled(false);
					
					JLabel etiqueta42 = new JLabel("     ");
					etiqueta42.setForeground(Color.BLACK);
					etiqueta42.setFont(new java.awt.Font("Tahoma", 1, 14));
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weightx =0.03;
					contenido.weighty = 0.03;
					contenido.gridx = 0;
					contenido.gridy = 0;
					VentanaJFrame.panelCentro.add(etiqueta42, contenido);
					
					JLabel retiro = new JLabel();
					retiro.setFont(new java.awt.Font("Tahoma", 1, 16));
					retiro.setBackground(Color.ORANGE);
					retiro.setText("RETIRO EN EFECTIVO");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.5;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 0;
					VentanaJFrame.panelCentro.add(retiro, contenido);
					
					JLabel consulta = new JLabel();
					consulta.setBackground(Color.ORANGE);
					consulta.setFont(new java.awt.Font("Tahoma", 1, 16));
					consulta.setText("CONSULTAR SALDO");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.35;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 1;
					VentanaJFrame.panelCentro.add(consulta,contenido);
					
					JLabel transferencias = new JLabel();
					transferencias.setBackground(Color.ORANGE);
					transferencias.setFont(new java.awt.Font("Tahoma", 1, 16));
					transferencias.setText("TRANSFERENCIAS");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.35;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 2;
					VentanaJFrame.panelCentro.add(transferencias,contenido);
					
					JLabel pagos = new JLabel();
					pagos.setBackground(Color.ORANGE);
					pagos.setText("              	     PAGOS");
					pagos.setFont(new java.awt.Font("Tahoma", 1, 16));
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.35;
					contenido.weightx = 0.0000003;
					contenido.gridx = 3;
					contenido.gridy = 0;
					VentanaJFrame.panelCentro.add(pagos,contenido);
					
					JLabel cambiodeclave = new JLabel();
					cambiodeclave.setBackground(Color.ORANGE);
					cambiodeclave.setFont(new java.awt.Font("Tahoma", 1, 16));
					cambiodeclave.setText("CAMBIO DE CLAVE");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.35;
					contenido.weightx = 0.0000003;
					contenido.gridx = 3;
					contenido.gridy = 1;
					VentanaJFrame.panelCentro.add(cambiodeclave,contenido );
					
					VentanaJFrame.panelFormulario.registrar = new JButton();
					VentanaJFrame.panelFormulario.registrar.setBackground(Color.ORANGE);
					VentanaJFrame.panelFormulario.registrar.setText(">>");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.5;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 1;
					VentanaJFrame.panelFormulario.add(VentanaJFrame.panelFormulario.registrar,contenido);
					
					VentanaJFrame.panelFormulario.registrar1 = new JButton();
					VentanaJFrame.panelFormulario.registrar1.setBackground(Color.ORANGE);
					VentanaJFrame.panelFormulario.registrar1.setText(">>");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.3;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 2;
					VentanaJFrame.panelFormulario.add(VentanaJFrame.panelFormulario.registrar1,contenido);
					
					VentanaJFrame.panelFormulario.registrar2 = new JButton();
					VentanaJFrame.panelFormulario.registrar2.setBackground(Color.ORANGE);
					VentanaJFrame.panelFormulario.registrar2.setText(">>");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.3;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 3;
					VentanaJFrame.panelFormulario.add(VentanaJFrame.panelFormulario.registrar2,contenido);
					
					VentanaJFrame.panelBusqueda.registrar3 = new JButton();
					VentanaJFrame.panelBusqueda.registrar3 .setBackground(Color.ORANGE);
					VentanaJFrame.panelBusqueda.registrar3 .setText("<<");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.3;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 1;
					VentanaJFrame.panelBusqueda.add(VentanaJFrame.panelBusqueda.registrar3,contenido);
					
					VentanaJFrame.panelBusqueda.registrar4= new JButton();
					VentanaJFrame.panelBusqueda.registrar4.setBackground(Color.ORANGE);
					VentanaJFrame.panelBusqueda.registrar4.setText("<<");
					contenido.weighty = 0.2;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 2;
					VentanaJFrame.panelBusqueda.add(VentanaJFrame.panelBusqueda.registrar4,contenido);
					
					JLabel registrar12 = new JLabel(" ");
					registrar12.setBackground(Color.ORANGE);
					registrar12.setText("");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.3;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 3;
					VentanaJFrame.panelBusqueda.add(registrar12, contenido);
					
	
					
				
				}
				}
				catch(java.lang.NullPointerException sd) {
					
						JOptionPane.showMessageDialog(null, "El numero de la tarjeta es incorrecto", "error", JOptionPane.ERROR_MESSAGE); 
			
				}
				VentanaJFrame.panelFormulario.registrar.addActionListener (new ActionListener(){
					public void actionPerformed(ActionEvent e){
						retiro();
						
					}});
				VentanaJFrame.panelFormulario.registrar1.addActionListener (new ActionListener(){
						public void actionPerformed(ActionEvent e){
							a=2;
							validarclave();
							
						}});
				VentanaJFrame.panelBusqueda.registrar4.addActionListener (new ActionListener(){
					public void actionPerformed(ActionEvent e){
						a=3;
						validarclave();
						
					}});
					
			
			}
	private static void retiro() {
		VentanaJFrame.panelCentro.removeAll();
		VentanaJFrame.panelCentro.repaint();
		VentanaJFrame.panelBusqueda.removeAll();
		VentanaJFrame.panelBusqueda.repaint();
		VentanaJFrame.panelFormulario.removeAll();
		VentanaJFrame.panelFormulario.repaint();
		registrar2.setEnabled(false);
		etiqueta52.setText(" BIENVENIDO.");
		
		JLabel etiqueta42 = new JLabel("     ");
		etiqueta42.setForeground(Color.BLACK);
		etiqueta42.setFont(new java.awt.Font("Tahoma", 1, 14));
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weightx =0.03;
		contenido.weighty = 0.03;
		contenido.gridx = 0;
		contenido.gridy = 0;
		VentanaJFrame.panelCentro.add(etiqueta42, contenido);
		
		JLabel retiro6 = new JLabel();
		retiro6.setFont(new java.awt.Font("Tahoma", 1, 16));
		retiro6.setBackground(Color.ORANGE);
		retiro6.setText("600000");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.5;
		contenido.weightx = 0.3;
		contenido.gridx = 1;
		contenido.gridy = 0;
		VentanaJFrame.panelCentro.add(retiro6,contenido);
		
		JLabel retiro4 = new JLabel();
		retiro4.setBackground(Color.ORANGE);
		retiro4.setFont(new java.awt.Font("Tahoma", 1, 16));
		retiro4.setText("400000");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.35;
		contenido.weightx = 0.3;
		contenido.gridx = 1;
		contenido.gridy = 1;
		VentanaJFrame.panelCentro.add(retiro4,contenido);
		
		JLabel retiro2 = new JLabel();
		retiro2.setBackground(Color.ORANGE);
		retiro2.setFont(new java.awt.Font("Tahoma", 1, 16));
		retiro2.setText("200000");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.35;
		contenido.weightx = 0.3;
		contenido.gridx = 1;
		contenido.gridy = 2;
		VentanaJFrame.panelCentro.add(retiro2,contenido);
		
		
		
		JLabel retiro1 = new JLabel();
		retiro1.setFont(new java.awt.Font("Tahoma", 1, 16));
		retiro1.setBackground(Color.ORANGE);
		retiro1.setText("100000");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.35;
		contenido.weightx = 0.0000003;
		contenido.gridx = 3;
		contenido.gridy = 0;
		VentanaJFrame.panelCentro.add(retiro1,contenido);
		
		JLabel retiro5 = new JLabel();
		retiro5.setBackground(Color.ORANGE);
		retiro5.setFont(new java.awt.Font("Tahoma", 1, 16));
		retiro5.setText("50000");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.35;
		contenido.weightx = 0.0000003;
		contenido.gridx = 3;
		contenido.gridy = 1;
		VentanaJFrame.panelCentro.add(retiro5,contenido);
		
		JLabel retiro20 = new JLabel();
		retiro20.setBackground(Color.ORANGE);
		retiro20.setFont(new java.awt.Font("Tahoma", 1, 16));
		retiro20.setText("20000");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.35;
		contenido.weightx = 0.0000003;
		contenido.gridx = 3;
		contenido.gridy = 2;
		VentanaJFrame.panelCentro.add(retiro20,contenido);
		
		JButton cien = new JButton();
		cien.setBackground(Color.ORANGE);
		cien.setText("<<");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.5;
		contenido.weightx = 0.3;
		contenido.gridx = 1;
		contenido.gridy = 1;
		VentanaJFrame.panelBusqueda.add(cien,contenido);
		
		JButton cinco= new JButton();
		cinco.setBackground(Color.ORANGE);
		cinco.setText("<<");
		contenido.weighty = 0.3;
		contenido.weightx = 0.3;
		contenido.gridx = 1;
		contenido.gridy = 2;
		VentanaJFrame.panelBusqueda.add(cinco,contenido);
		
		JButton veinte = new JButton();
		veinte.setBackground(Color.ORANGE);
		veinte.setText("<<");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.3;
		contenido.weightx = 0.3;
		contenido.gridx = 1;
		contenido.gridy = 3;
		VentanaJFrame.panelBusqueda.add(veinte,contenido);
		
		JButton seis = new JButton();
		seis.setBackground(Color.ORANGE);
		seis.setText(">>");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.5;
		contenido.weightx = 0.3;
		contenido.gridx = 1;
		contenido.gridy = 1;
		VentanaJFrame.panelFormulario.add(seis,contenido);
		
		JButton cuatro = new JButton();
		cuatro.setBackground(Color.ORANGE);
		cuatro.setText(">>");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.3;
		contenido.weightx = 0.3;
		contenido.gridx = 1;
		contenido.gridy = 2;
		VentanaJFrame.panelFormulario.add(cuatro,contenido);
		
		JButton dos = new JButton();
		dos.setBackground(Color.ORANGE);
		dos.setText(">>");
		contenido.fill = GridBagConstraints.HORIZONTAL;
		contenido.weighty = 0.3;
		contenido.weightx = 0.3;
		contenido.gridx = 1;
		contenido.gridy = 3;
		VentanaJFrame.panelFormulario.add(dos,contenido);
		
		
		
		dos.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				valor=200000;
				clave(valor);			
			}});
			
		cien.addActionListener (new ActionListener(){
				public void actionPerformed(ActionEvent e){
					valor=100000;
					clave(valor);
				}
		});
		veinte.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				valor=20000;
				clave(valor);
			}
	});
		cinco.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				valor=50000;
				clave(valor);
			}
	});
		seis.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				valor=600000;
				clave(valor);
			}
	});
		cuatro.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){
				valor=400000;
				clave(valor);
			}
	});
	}
	
	
		private static void clave(int valor) {
			if(Usuario.lista.get(cedula).getsueldo()>=valor) {
				a=1;
				validarclave();
				
				
			}
			else {
				etiqueta52.setText("DINERO INSUFICIENTE");
			}
			
		}

		private static void validarclave() {
			
			registrar2.setEnabled(false);
			etiqueta52.setText(" ..");
			
			VentanaJFrame.panelCentro.removeAll();
			VentanaJFrame.panelCentro.repaint();
			VentanaJFrame.panelBusqueda.removeAll();
			VentanaJFrame.panelBusqueda.repaint();
			VentanaJFrame.panelFormulario.removeAll();
			VentanaJFrame.panelFormulario.repaint();
			
			JLabel q1 = new JLabel();
			q1.setText("									");
			q1.setFont(new java.awt.Font("Tahoma", 1, 16));
			contenido.weighty = 0.3;
			contenido.weightx = 34;
			contenido.gridx = 3;
			contenido.gridy = 1;	
			VentanaJFrame.panelCentro.add(q1,contenido);
			
			JLabel q = new JLabel();
			q.setText("				            ");
			q.setFont(new java.awt.Font("Tahoma", 1, 16));
			contenido.weighty = 0.3;
			contenido.weightx = 22;
			contenido.gridx = 0;
			contenido.gridy = 1;	
			VentanaJFrame.panelCentro.add(q,contenido);
			
			JLabel clave2 = new JLabel();
			clave2.setText("DIGITE SU CLAVE");
			clave2.setFont(new java.awt.Font("Tahoma", 1, 16));
			contenido.weighty = 0.3;
			contenido.weightx = 0.5;
			contenido.gridx = 2;
			contenido.gridy = 2;	
			VentanaJFrame.panelCentro.add(clave2,contenido);

			clave1 = new JTextField();				
			contenido.weighty = 0.3;
			contenido.weightx = 0.5;
			contenido.gridx = 2;
			contenido.gridy = 3;
			VentanaJFrame.panelCentro.add(clave1,contenido);
			clavevalidar="";
			clave1.setText("");
			
			continuar=new JButton();
			continuar.setText("CONTINUAR");
			continuar.setForeground(Color.WHITE);
			continuar.setBackground(Color.red);
			contenido.weighty = 0.3;
			contenido.weightx = 0.5;
			contenido.gridx = 2;
			contenido.gridy = 4;
			VentanaJFrame.panelCentro.add(continuar,contenido);

			
		
			
			
			continuar.addActionListener (new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(a==1) {
					if(Usuario.lista.get(cedula).getclave()==Integer.parseInt(clavevalidar)){
					System.out.println("SUELDO"+Usuario.lista.get(cedula).getsueldo());
					System.out.println("CC");
					float sueldot=Usuario.lista.get(cedula).getsueldo()-valor;
					Usuario.lista.get(cedula).setsueldo(sueldot);
					System.out.println("NUEVO SUELDO"+Usuario.lista.get(cedula).getsueldo());
					etiqueta52.setText("TRANSFERENCIA EXITOSA");
					
					System.out.println("LA CLAVE ES"+clave1.getText());
					clavevalidar="";
					clave1.setText("");
					//ingresar();
				
					}
					else {
						
						claveerronea++;
						if(claveerronea<=3) {
						clavevalidar="";
						clave1.setText("");
						etiqueta52.setText("CLAVE ERRONEA");
						//ingresar();//AQUI QUIERO QUE SALGA?
						}
						else {
							JOptionPane.showMessageDialog(null, "Ya ha superado el numero de intentos", "error", JOptionPane.ERROR_MESSAGE); 
							ingresar();//AQUI QUIERO QUE SALGA?
						}
					}
				}
				
				if(a==2) {
					VentanaJFrame.panelCentro.removeAll();
					VentanaJFrame.panelCentro.repaint();
					etiqueta52.setText(".");
					JLabel saldo = new JLabel();
					saldo.setText("SU SALDO ES:  "+"     $"+Usuario.lista.get(cedula).getsueldo());
					saldo.setFont(new java.awt.Font("Tahoma", 1, 16));
					contenido.weighty = 1;
					contenido.weightx = 0;
					contenido.gridx = 3;
					contenido.gridy = 0;	
					VentanaJFrame.panelCentro.add(saldo,contenido);
					
					saldo1 = new JLabel("     ");				
					contenido.weighty = 0.3;
					contenido.weightx = 15;
					contenido.gridx = 2;
					contenido.gridy = 6;
					VentanaJFrame.panelCentro.add(saldo1,contenido);
					
				}
				if(a==3) {
					clavevalidar="";
					clave1.setText("");
					registrar2.setEnabled(false);
					etiqueta52.setText("  -");
					
					VentanaJFrame.panelCentro.removeAll();
					VentanaJFrame.panelCentro.repaint();
					VentanaJFrame.panelBusqueda.removeAll();
					VentanaJFrame.panelBusqueda.repaint();
					VentanaJFrame.panelFormulario.removeAll();
					VentanaJFrame.panelFormulario.repaint();
					int antigua=Usuario.lista.get(cedula).getclave();
					JLabel q1 = new JLabel();
					q1.setText("									");
					q1.setFont(new java.awt.Font("Tahoma", 1, 16));
					contenido.weighty = 0.3;
					contenido.weightx = 34;
					contenido.gridx = 3;
					contenido.gridy = 1;	
					VentanaJFrame.panelCentro.add(q1,contenido);
					
					JLabel q = new JLabel();
					q.setText("				            ");
					q.setFont(new java.awt.Font("Tahoma", 1, 16));
					contenido.weighty = 0.3;
					contenido.weightx = 22;
					contenido.gridx = 0;
					contenido.gridy = 1;	
					VentanaJFrame.panelCentro.add(q,contenido);
					
					JLabel clave3 = new JLabel();
					clave3.setText("DIGITE SU NUEVA CLAVE");
					clave3.setFont(new java.awt.Font("Tahoma", 1, 16));
					contenido.weighty = 0.3;
					contenido.weightx = 0.5;
					contenido.gridx = 2;
					contenido.gridy = 2;	
					VentanaJFrame.panelCentro.add(clave3,contenido);

					clave1 = new JTextField();				
					contenido.weighty = 0.3;
					contenido.weightx = 0.5;
					contenido.gridx = 2;
					contenido.gridy = 3;
					VentanaJFrame.panelCentro.add(clave1,contenido);
	
					
					continuar1=new JButton();
					continuar1.setText("CONTINUAR");
					continuar1.setForeground(Color.WHITE);
					continuar1.setBackground(Color.red);
					contenido.weighty = 0.3;
					contenido.weightx = 0.5;
					contenido.gridx = 2;
					contenido.gridy = 4;
					VentanaJFrame.panelCentro.add(continuar1,contenido);
					
						
				}
				
				continuar1.addActionListener (new ActionListener(){	
					
					public void actionPerformed(ActionEvent e){
						etiqueta52.setText("CAMBIO DE CLAVE EXITOSO");
						int nueva=Integer.parseInt(clave1.getText());
						Usuario.lista.get(cedula).setclave(nueva);
						ingresar();
					}});
				}
			});
			
			
		}


			
	
	}
				
			
		
	
			