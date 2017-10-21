import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.TimerTask;
import java.util.Timer;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class PanelAbajo extends JPanel {
	//Creo variables de tipo estatico con el fin de acceder a cualquier metodo estatico 
	static boolean val;
	static Usuario usuario;
    static JButton btnOpcion1,registrar2,limpiar,registrar16,boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton02,boton01,continuar,salir,cancelar,continuar1,continuar12;
    static JLabel etiqueta52,saldo1,foto112;
	static int bandera=0,cedula,valor,claveerronea=0,b=0,i,a=0,contador=0,validar=1,bandera1=0,validar2=0,validar3=0;
	//a es una bandera que me indica en que operacion esta
	// por ejemplo 0 indica que no ha ingresado a cajero
	// 1 retiro, 2 consulta, 3 cambio de clave, 5 transacciones, 6 pagos
	static GridBagConstraints contenido;
	static JPasswordField clave1;
	static JTextField cajadetexto,clave4,numeropag,valorpag,nombretra,ncuenta,valort;
	static String clavevalidar="", clavevalidar1="",bcs,vocales;
	static ImageIcon imagen1;
	//ImagenIcon es para insertar una imagen
	static Timer timer12;
	//esta funcion Timer me sirve para indicar el contenido que va a quedar detenido segun el instante de tiempo determinado
	static TimerTask time2;
	//TimerTask sirve para determinar la velocidad con la que se efecturan el cambio de imagenes
	static AudioClip sonido;
	//AudioClip es para insertar un audio
	
	
	public PanelAbajo() {
	//Una vez inicie el Jframe con la funcion java.applet.Applet.newAudioClip(getClass().getResource("/sonido2.wav")) determino el sonido que guardara la variable
	//una vez obtenida la informacion le doy play para que suene
	sonido=java.applet.Applet.newAudioClip(getClass().getResource("/sonido2.wav"));
	sonido.play();
	
		
		
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
	
	
	//Boton del 1
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
	

	//Boton del 2
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
	
	//Boton del 3
	boton3  = new JButton();
	boton3.setBackground(Color.ORANGE);
	boton2.setSize(5, 5);
	boton3.setText("3");
	contenido.fill = GridBagConstraints.CENTER;
	contenido.weighty = 0.3;
	contenido.gridx = 3;
	contenido.gridy = 1;
	add(boton3, contenido);
	
	//Boton del 4
	boton4  = new JButton();
	boton4.setBackground(Color.ORANGE);
	boton4.setText("4");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 1;
	contenido.gridy = 2;
	add(boton4, contenido);

	//Boton del 5
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
	
	//Boton del 6
	boton6  = new JButton();
	boton6.setBackground(Color.ORANGE);
	boton6.setText("6");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 3;
	contenido.gridy = 2;
	add(boton6, contenido);
	
	//Boton del 7
	boton7  = new JButton();
	boton7.setBackground(Color.ORANGE);
	boton7.setText("7");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 1;
	contenido.gridy = 3;
	add(boton7, contenido);
	
	//Boton del 8
	boton8  = new JButton();
	boton8.setBackground(Color.ORANGE);
	boton8.setText("8");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 2;
	contenido.gridy = 3;
	add(boton8, contenido);
	
	//Boton del 9
	boton9  = new JButton();
	boton9.setBackground(Color.ORANGE);
	boton9.setText("9");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 3;
	contenido.gridy = 3;
	add(boton9, contenido);
	
	//Boton del cancelar es decir me vuelve al inicio del cajero
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
	
	//limpiar me limpia las cajas de texto cuando el usuario lo desee
	limpiar = new JButton();
	limpiar.setForeground(Color.WHITE);
	limpiar.setBackground(Color.red);
	limpiar.setText("LIMPIAR");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.2;
	contenido.gridx = 4;
	contenido.gridy = 2;
	add(limpiar, contenido);
	
	
	//salir cierra la seccion del usuario
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

	boton01 = new JButton();
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
	

	
	
	
	JLabel etiqueta13 = new JLabel("INGRESE SU TARJETA");
	etiqueta13.setForeground(Color.BLACK);
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weightx = 1;
	contenido.weighty = 1;
	contenido.gridx = 5;
	contenido.gridy = 6;
	add(etiqueta13, contenido);
	
	//cajadetexto me guarda el numero de la tarjeta que es igual al numero de la cedula
	cajadetexto = new JTextField();
	cajadetexto.setText("");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weightx = 0.03;
	contenido.gridx = 5;
	contenido.gridy = 7;
	add(cajadetexto, contenido);
	cajadetexto.addKeyListener(new KeyAdapter() {					
		public void keyTyped(KeyEvent e) {
			char c=e.getKeyChar();
			if (Character.isLetter(c)) {	
				JOptionPane.showMessageDialog(null, "Solo se admiten datos numericos", "error", JOptionPane.ERROR_MESSAGE); 
	            e.consume();
	             }
		}
	});
	
	//este boton me permite acceder al cajero y a realizar operaciones
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
	
	
	
	//Este boton me permite agregar usuario
	registrar16 = new JButton();
	registrar16.setBackground(Color.ORANGE);
	registrar16.setText("AGREGAR USUARIO");
	registrar16.setAlignmentX(LEFT_ALIGNMENT);
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weighty = 0.3;
	contenido.weightx = 0.3;
	contenido.gridx = 5;
	contenido.gridy = 9;
	add(registrar16, contenido);
	
	// en esta etiqueta iran los mensajes de cada operacion
	etiqueta52 = new JLabel("MENSAJE ");
	etiqueta52.setForeground(Color.BLACK);
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.weightx =3;
	contenido.weighty = 3;
	contenido.gridx = 0;
	contenido.gridy = 9;
	add(etiqueta52, contenido);
	
	
	
	
	 // JTextArea en la fila 0, columna 0 y que ocupa dos filas y dos
	 // columnas de ancho.

	
	JLabel registrar = new JLabel("");
	contenido.fill = GridBagConstraints.HORIZONTAL;
	contenido.ipady = 0;       //reset to default
	contenido.weighty = 1.0;   //request any extra vertical space
	contenido.anchor = GridBagConstraints.PAGE_END; //bottom of space
	contenido.insets = new Insets(10,5,10,5);  //top padding
	contenido.gridx = 6;       //aligned with button 2
	contenido.gridwidth = 2;   //2 columns wide
	contenido.gridy = 15;       //third row
	add(registrar, contenido);
	
	
	registrar2.addActionListener (new ActionListener(){
		//metodo que lee el boton e inserta la "tarjeta" (cedula) para iniciar una nueva oparacion de algun usuario
		public void actionPerformed(ActionEvent e){	
			ingresar(2);
	}});
	
	registrar16.addActionListener (new ActionListener(){
		//metodo que lee el boton y abre el formuario para ingresar un nuevo usuario 
		public void actionPerformed(ActionEvent e){
			usuario = new Usuario("USUARIO");
			
	}});
	
	cancelar.addActionListener (new ActionListener(){
		// metodo que cancela la operacion en curso y devuelve al inicio
		public void actionPerformed(ActionEvent e){	
			if(a==1|| a==2 || a==3 || a==5 || a==6) {
				ingresar(1);}
	}});
	
	
	salir.addActionListener(new ActionListener() {
		//metodo que envia a salir totalmente del sistema
		public void actionPerformed(ActionEvent e) {
			a=0;
			salir();
	}});

	boton1.addActionListener (new ActionListener(){
		//metodo que lee el boton e imprime en la caja de texto el valor asigando a este boton
		public void actionPerformed(ActionEvent e){
		try {
			clavevalidar=clavevalidar+"1";
			clave1.setText(clavevalidar);
		}
		catch(java.lang.NullPointerException c) {
			
		}

}});
	boton2.addActionListener (new ActionListener(){
		//metodo que lee el boton e imprime en la caja de texto el valor asigando a este boton
		public void actionPerformed(ActionEvent e){
			try {
			clavevalidar=clavevalidar+"2";
			clave1.setText(clavevalidar);
			}
			catch(java.lang.NullPointerException c) {
				
			}
		}
});
	boton3.addActionListener (new ActionListener(){
		//metodo que lee el boton e imprime en la caja de texto el valor asigando a este boton
		public void actionPerformed(ActionEvent e){
			try {
			clavevalidar=clavevalidar+"3";
			clave1.setText(clavevalidar);
			}
			catch(java.lang.NullPointerException c) {
				
			}
		}
});
	boton4.addActionListener (new ActionListener(){
		//metodo que lee el boton e imprime en la caja de texto el valor asigando a este boton
		public void actionPerformed(ActionEvent e){
		try {
			clavevalidar=clavevalidar+"4";
			clave1.setText(clavevalidar);
		}
		catch(java.lang.NullPointerException c) {
	}
}
});
	boton5.addActionListener (new ActionListener(){
		//metodo que lee el boton e imprime en la caja de texto el valor asigando a este boton
		public void actionPerformed(ActionEvent e){
		try {
			clavevalidar=clavevalidar+"5";
			clave1.setText(clavevalidar);
		}
		catch(java.lang.NullPointerException c) {
	}}
});
	boton6.addActionListener (new ActionListener(){
		//metodo que lee el boton e imprime en la caja de texto el valor asigando a este boton
		public void actionPerformed(ActionEvent e){
			try {
			clavevalidar=clavevalidar+"6";
			clave1.setText(clavevalidar);
			}
			catch(java.lang.NullPointerException c) {
	}}
});
	boton7.addActionListener (new ActionListener(){
		//metodo que lee el boton e imprime en la caja de texto el valor asigando a este boton
		public void actionPerformed(ActionEvent e){
		try {
			clavevalidar=clavevalidar+"7";
			clave1.setText(clavevalidar);
		}
		catch(java.lang.NullPointerException c) {
	}}
});
	boton8.addActionListener (new ActionListener(){
		//metodo que lee el boton e imprime en la caja de texto el valor asigando a este boton
		public void actionPerformed(ActionEvent e){
		try {
			clavevalidar=clavevalidar+"8";
			clave1.setText(clavevalidar);
		}
		catch(java.lang.NullPointerException c) {
	}}
});
	boton9.addActionListener (new ActionListener(){
		//metodo que lee el boton e imprime en la caja de texto el valor asigando a este boton
		public void actionPerformed(ActionEvent e){
		try {
			clavevalidar=clavevalidar+"9";
			clave1.setText(clavevalidar);
		}
		catch(java.lang.NullPointerException c) {
	}}
});
	boton02.addActionListener (new ActionListener(){
		//metodo que lee el boton e imprime en la caja de texto el valor asigando a este boton
		public void actionPerformed(ActionEvent e){
		try {
			clavevalidar=clavevalidar+"0";
			clave1.setText(clavevalidar);
		}
		catch(java.lang.NullPointerException c) {
	}}
});
	
}

//Este metodo es invocado cuando escucha el boton salir
//aqui me pone en invisible la primera pantalla y me crea otra en donde caja de texto corresponde al numero de la tarjeta la dejamos null
// para que se borre el ultimo numero de tarjeta ingresado
public static void salir() {
		validar2=0;
		validar3=0;
		Principal.obj1.setVisible(false);
		cajadetexto.setText(null);
		Principal.ventananuev();		
		a=0;
}
	//metodo que valida si la cedula ingresada exite dentro de la lista y devuelve un valor verdadero sin existe o falso si no existe
	public static boolean validarUsuario() {
	
		System.out.println("lista validar"+Usuario.lista.size());
		for(int i=0;i<Usuario.lista.size();i++) {			
			
				if(Usuario.lista.get(i).getcedula()==Integer.parseInt(cajadetexto.getText())) {
					
					System.out.println("esta aqui la cc "+cajadetexto.getText());
					validar2++;
					cedula=i;
				}
				else {
					validar3++;					
				}
		}
	
		
		if(validar2==1) {
			bandera=1;	
			val= true;
			System.out.println("VERDADERO");
		}else {
			if(validar3==Usuario.lista.size()) {
			bandera=3;
			val= false;
			sonido.play();
			System.out.println("FALSO");
		}}
		return val;
	}
	
	
	public static void ingresar(int rec) {
		cancelar.setEnabled(true);
		 salir.setEnabled(true);
		try {
			
			if(validarUsuario()==false) {
				if(bandera==3) {
					etiqueta52.setText("Procesando información.");
					rec = 0;
					System.out.println("0."+bandera);
					System.out.println("1."+rec);
					cajadetexto.setText("");
					JOptionPane.showMessageDialog(null, "((!)El numero de la tarjeta es incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
					sonido.play();
					etiqueta52.setText("Ingrese su tarjeta");
				}			
			}else {
	
			if(validarUsuario()==true) {
				rec = 1;
				System.out.println("2."+bandera);
				System.out.println("3."+rec);
				registrar2.setEnabled(true);
				registrar16.setEnabled(false);
			//}
			bandera = rec;
			System.out.println("welcome"+bandera);
			etiqueta52.setText("BIENVENIDO");
			 
				if(bandera==1) {
					etiqueta52.setText("BIENVENIDO "+Usuario.lista.get(i).getNombre());
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
					
					VentanaJFrame.panelFormulario.retiroef = new JButton();
					VentanaJFrame.panelFormulario.retiroef.setBackground(Color.ORANGE);
					VentanaJFrame.panelFormulario.retiroef.setText(">>");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.5;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 1;
					VentanaJFrame.panelFormulario.add(VentanaJFrame.panelFormulario.retiroef,contenido);
					
					VentanaJFrame.panelFormulario.consultarsa= new JButton();
					VentanaJFrame.panelFormulario.consultarsa.setBackground(Color.ORANGE);
					VentanaJFrame.panelFormulario.consultarsa.setText(">>");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.3;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 2;
					VentanaJFrame.panelFormulario.add(VentanaJFrame.panelFormulario.consultarsa,contenido);
					
					VentanaJFrame.panelFormulario.transferencias = new JButton();
					VentanaJFrame.panelFormulario.transferencias.setBackground(Color.ORANGE);
					VentanaJFrame.panelFormulario.transferencias.setText(">>");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.3;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 3;
					VentanaJFrame.panelFormulario.add(VentanaJFrame.panelFormulario.transferencias,contenido);
					
					VentanaJFrame.panelBusqueda.pagos = new JButton();
					VentanaJFrame.panelBusqueda.pagos.setBackground(Color.ORANGE);
					VentanaJFrame.panelBusqueda.pagos.setText("<<");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.3;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 1;
					VentanaJFrame.panelBusqueda.add(VentanaJFrame.panelBusqueda.pagos,contenido);
					
					VentanaJFrame.panelBusqueda.cambiocl= new JButton();
					VentanaJFrame.panelBusqueda.cambiocl.setBackground(Color.ORANGE);
					VentanaJFrame.panelBusqueda.cambiocl.setText("<<");
					contenido.weighty = 0.2;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 2;
					VentanaJFrame.panelBusqueda.add(VentanaJFrame.panelBusqueda.cambiocl,contenido);
					
					JLabel registrar12 = new JLabel(" ");
					registrar12.setBackground(Color.ORANGE);
					registrar12.setText("");
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weighty = 0.3;
					contenido.weightx = 0.3;
					contenido.gridx = 1;
					contenido.gridy = 3;
					VentanaJFrame.panelBusqueda.add(registrar12, contenido);
					
	
					VentanaJFrame.panelFormulario.retiroef.addActionListener (new ActionListener(){
						//metodo que lee el boton y envia al metodo de retiro
						public void actionPerformed(ActionEvent e){
							retiro();
							
						}});
					VentanaJFrame.panelFormulario.transferencias.addActionListener (new ActionListener(){
						//metodo que lee el boton y envia al metodo de transferecias
						public void actionPerformed(ActionEvent e){
							transferir();
						}});
					VentanaJFrame.panelBusqueda.pagos.addActionListener (new ActionListener(){
						//metodo que lee el boton y envia al metodo de realizar pagos
						public void actionPerformed(ActionEvent e){
							realizarpagos();
							
						}});
					VentanaJFrame.panelFormulario.consultarsa.addActionListener (new ActionListener(){
						//metodo que lee el boton y envia a consultar la clave 
							public void actionPerformed(ActionEvent e){
								a=2;
								validarclave();
								
							}});
					VentanaJFrame.panelBusqueda.cambiocl.addActionListener (new ActionListener(){
						//metodo que lee el boton y lo envia a cambiar la clave
						public void actionPerformed(ActionEvent e){
							
							a=3;
							validarclave();
							
					}});	
				}
		}
	}
}
		catch(java.lang.NullPointerException sd) {
			
			etiqueta52.setText("Procesando información.");
			rec = 0;
			System.out.println("0."+bandera);
			System.out.println("1."+rec);
			cajadetexto.setText("");
			JOptionPane.showMessageDialog(null, "No hay usuarios registrados", "Error", JOptionPane.ERROR_MESSAGE);
			sonido.play();
			etiqueta52.setText("Ingrese su tarjeta");				
			sonido.play();
		}
	}
	
	//metodo que simula el retraso de una operacion
	private static void retirodinero() {
		System.out.println("Retiro 2");
		VentanaJFrame.panelBusqueda.removeAll();
		VentanaJFrame.panelBusqueda.repaint();
		VentanaJFrame.panelFormulario.removeAll();
		VentanaJFrame.panelFormulario.repaint();
		etiqueta52.setText("-");
		int velocidad=2;
	
		int velocidad2=velocidad*1000;
		
		time2 = new TimerTask() {
			int tic = 0;
			@Override
			//metodo que pone una imagen un tiempo determinado de acuerdo a la operacion que se este realizando y para simular el tiempo de espera de la transaccion
			public void run() {
				if(tic==0) {
					VentanaJFrame.panelCentro.removeAll();
					VentanaJFrame.panelCentro.repaint();
					etiqueta52.setText("Procesando operacion");
					JLabel q = new JLabel();
					q.setText("				            ");
					q.setFont(new java.awt.Font("Tahoma", 1, 16));
					contenido.weighty = 0.3;
					contenido.weightx = 22;
					contenido.gridx = 0;
					contenido.gridy = 0;	
					VentanaJFrame.panelCentro.add(q,contenido);	
					imagen1 = new ImageIcon("images/retiroplata.png");	
					foto112 = new JLabel(imagen1);
					foto112.setForeground(Color.BLACK);
					contenido.fill = GridBagConstraints.HORIZONTAL;
					contenido.weightx = 7;
					contenido.weighty = 1;
					contenido.gridx = 0;
					contenido.gridy = 1;
					VentanaJFrame.panelCentro.add(foto112, contenido);
					etiqueta52.setText("PROCESANDO DATOS..");
					System.out.println(tic);
					etiqueta52.setText("PROCESANDO DATOS..");
					
					
								
				}
				if(tic==1) {
						VentanaJFrame.panelCentro.removeAll();
						VentanaJFrame.panelCentro.repaint();
						etiqueta52.setText("Procesando operacion");
						JLabel q = new JLabel();
						q.setText("				            ");
						q.setFont(new java.awt.Font("Tahoma", 1, 16));
						contenido.weighty = 0.3;
						contenido.weightx = 22;
						contenido.gridx = 0;
						contenido.gridy = 0;	
						VentanaJFrame.panelCentro.add(q,contenido);	
						System.out.println(tic);
						etiqueta52.setText("TRANSFERENCIA EXITOSA");		
						ImageIcon imagen112 = new ImageIcon( "images/retiroplata2.png");		
						foto112 = new JLabel(imagen112);
						foto112.setForeground(Color.BLACK);
						contenido.fill = GridBagConstraints.HORIZONTAL;
						contenido.weightx = 7;
						contenido.weighty = 1;
						contenido.gridx = 0;
						contenido.gridy = 1;
						VentanaJFrame.panelCentro.add(foto112, contenido);
						etiqueta52.setText("PROCESANDO DATOS..");foto112.setIcon(imagen112);
						AudioClip sonido1=java.applet.Applet.newAudioClip(getClass().getResource("/retiro.wav"));
						sonido1.play();
						
				}
				if(tic==2) {
					etiqueta52.setText("transaccion exitosa.....");
					VentanaJFrame.panelCentro.removeAll();
					VentanaJFrame.panelCentro.repaint();
					etiqueta52.setText(".....transaccion exitosa......");
					transaccionExitosa();
				}
						
				tic++;	
			}
		};
		
		timer12=new Timer();
		timer12.schedule(time2, 0,3500);
		
		
	}
	//metodo vacio que hace la operacion del retiro de dinero
	private static void retiro() {
		a=1;
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
			//metodo que lee un boton y asigna un valor a la variable estatica para trabajar con las operaciones del usuario
			public void actionPerformed(ActionEvent e){
				valor=200000;
				clave(valor);			
			}});
		cien.addActionListener (new ActionListener(){
			//metodo que lee un boton y asigna un valor a la variable estatica para trabajar con las operaciones del usuario
				public void actionPerformed(ActionEvent e){
					valor=100000;
					clave(valor);
				}
		});
		veinte.addActionListener (new ActionListener(){
			//metodo que lee un boton y asigna un valor a la variable estatica para trabajar con las operaciones del usuario
			public void actionPerformed(ActionEvent e){
				valor=20000;
				clave(valor);
			}
		});
		cinco.addActionListener (new ActionListener(){
			//metodo que lee un boton y asigna un valor a la variable estatica para trabajar con las operaciones del usuario
			public void actionPerformed(ActionEvent e){
				valor=50000;
				clave(valor);
			}
	});
		seis.addActionListener (new ActionListener(){
			//metodo que lee un boton y asigna un valor a la variable estatica para trabajar con las operaciones del usuario
			public void actionPerformed(ActionEvent e){
				valor=600000;
				clave(valor);
			}
	});
		cuatro.addActionListener (new ActionListener(){
			//metodo que lee un boton y asigna un valor a la variable estatica para trabajar con las operaciones del usuario
			public void actionPerformed(ActionEvent e){
				valor=400000;
				clave(valor);
			}
	});
	}
	
	//metodo que valida si el usario ingresado tiene el saldo suficiente para la transaccion y recibe el sueldo en una variable int
		private static void clave(int valor) {
			if(Usuario.lista.get(cedula).getsueldo()>=valor) {
				validarclave();
			}
			else {
				etiqueta52.setText("DINERO INSUFICIENTE");
			}
			
		}

	//?
		private static void Sletras(JTextField clave1) {
			clave1.addKeyListener(new KeyAdapter() {
				public void keyTyped(KeyEvent e) {
					char c=e.getKeyChar();
					if (((c < 'A') || (c > 'Z')) && ((c < 'a') || (c > 'z')) && (c != 32)) {
			            e.consume();
			             }
				}
			});}
		
		private static void validarclave() {
			validar=1;
		
			try {
			registrar2.setEnabled(false);
			etiqueta52.setText("..");
			
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

			clave1 = new JPasswordField();
			Sletras(clave1);
			contenido.weighty = 0.3;
			contenido.weightx = 0.5;
			contenido.gridx = 2;
			contenido.gridy = 3;
			VentanaJFrame.panelCentro.add(clave1,contenido);
			clave1.addKeyListener(new KeyAdapter() {
				
				public void keyTyped(KeyEvent e) {
					//metodo que impide que se ingresen datos por teclado a la caja de texto
					char c=e.getKeyChar();
					if (Character.isLetter(c)|| Character.isDigit(c)) {				
			            e.consume();
			             }
				}
			});
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

			claveerronea=0;
			
			
			limpiar.addActionListener(new ActionListener() {
				//metodo que lee uel boton y limpia los datos que el usuario ingreso a la pantalla
				public void actionPerformed(ActionEvent e) {
				clavevalidar="";
				clave1.setText(null);
				}
			});
			
			
			continuar.addActionListener (new ActionListener(){
				//metodo que lee el boton y de acuerdo a lo seleccionado por el usaurio ejecuta una operacion
				public void actionPerformed(ActionEvent e){
					if(a==1) {
					
					if(Usuario.lista.get(cedula).getclave()==Integer.parseInt(clavevalidar)){
						float sueldot=Usuario.lista.get(cedula).getsueldo()-valor;
						Usuario.lista.get(cedula).setsueldo(sueldot);
						bandera1=2;
						VentanaJFrame.panelCentro.removeAll();
						VentanaJFrame.panelCentro.repaint();
						etiqueta52.setText("Procesando operacion");
						JLabel q = new JLabel();
						q.setText("				            ");
						q.setFont(new java.awt.Font("Tahoma", 1, 16));
						contenido.weighty = 0.3;
						contenido.weightx = 22;
						contenido.gridx = 0;
						contenido.gridy = 0;	
						VentanaJFrame.panelCentro.add(q,contenido);			
						
						System.out.println("Retiro 1");
						retirodinero();
						System.out.println("Retiro 3");
						
						
					
					
				
					}
					else {
						
						claveerronea++;
						if(claveerronea<=2) {
						clavevalidar="";
						clave1.setText("");
						etiqueta52.setText("CLAVE ERRONEA");
						//ingresar();//AQUI QUIERO QUE SALGA?
						}
						else {
							JOptionPane.showMessageDialog(null, "Ya ha superado el numero de intentos", "error", JOptionPane.ERROR_MESSAGE); 
							salir();//AQUI QUIERO QUE SALGA?
						}
					}
				}
				
					
				if(a==5 || a==6) {	
						if(Usuario.lista.get(cedula).getclave()==Integer.parseInt(clavevalidar)){
								etiqueta52.setText("TRANSFERENCIA EXITOSA");
								System.out.println("SUELDO"+Usuario.lista.get(cedula).getsueldo());
								System.out.println("CC");
								float sueldot=Usuario.lista.get(cedula).getsueldo()-valor;
								Usuario.lista.get(cedula).setsueldo(sueldot);
								System.out.println("NUEVO SUELDO"+Usuario.lista.get(cedula).getsueldo());
								System.out.println("LA CLAVE ES"+clave1.getText());
								clavevalidar="";
								clave1.setText("");
								transaccionExitosa();
								
					
						}
						else {
							
							claveerronea++;
							if(claveerronea<=2) {
							clavevalidar="";
							clave1.setText("");
							etiqueta52.setText("CLAVE ERRONEA");
							//ingresar();//AQUI QUIERO QUE SALGA?
							}
							else {
								JOptionPane.showMessageDialog(null, "Ya ha superado el numero de intentos", "error", JOptionPane.ERROR_MESSAGE); 
								salir();//AQUI QUIERO QUE SALGA?
							}
						}
					}
				if(a==2) {
				
					if(Usuario.lista.get(cedula).getclave()==Integer.parseInt(clavevalidar)){
							VentanaJFrame.panelCentro.removeAll();
							VentanaJFrame.panelCentro.repaint();
							etiqueta52.setText("Consultando Informacion");
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
							
							JButton  continuar = new JButton();
					          continuar.setText("CONTINUAR");
					          continuar.setForeground(Color.WHITE);
					          continuar.setBackground(Color.red);
					          contenido.weighty = 0.3;
					          contenido.weightx = 0.5;
					          contenido.gridx = 4;
					          contenido.gridy = 6;
					          VentanaJFrame.panelCentro.add(continuar,contenido);
					          
					          continuar.addActionListener (new ActionListener(){  
					            public void actionPerformed(ActionEvent e){
					              transaccionExitosa();
					              
					          }});
							
							
							}
					else {
						
						claveerronea++;
						if(claveerronea<=2) {
						clavevalidar="";
						clave1.setText("");
						etiqueta52.setText("CLAVE ERRONEA");
						//ingresar();//AQUI QUIERO QUE SALGA?
						}
						else {
							JOptionPane.showMessageDialog(null, "Ya ha superado el numero de intentos", "error", JOptionPane.ERROR_MESSAGE); 
							salir();//AQUI QUIERO QUE SALGA?
						}
					}
					
				}
				if(a==3) {
					if(Usuario.lista.get(cedula).getclave()==Integer.parseInt(clavevalidar)){
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

					clave1 = new JPasswordField();				
					contenido.weighty = 0.3;
					contenido.weightx = 0.5;
					contenido.gridx = 2;
					contenido.gridy = 3;
					VentanaJFrame.panelCentro.add(clave1,contenido);
					clave1.addKeyListener(new KeyAdapter() {
						//metodo que impide que se ingrese datos por teclado a la caja de texto
						public void keyTyped(KeyEvent e) {
							char c=e.getKeyChar();
							if (Character.isLetter(c)|| Character.isDigit(c)) {				
					            e.consume();
					             }
						}
					});
					clavevalidar="";
					clave1.setText("");
					
	
					
					continuar12=new JButton();
					continuar12.setText("CONTINUAR");
					continuar12.setForeground(Color.WHITE);
					continuar12.setBackground(Color.red);
					contenido.weighty = 0.3;
					contenido.weightx = 0.5;
					contenido.gridx = 2;
					contenido.gridy = 4;
					VentanaJFrame.panelCentro.add(continuar12,contenido);
					continuar12.addActionListener (new ActionListener(){	
						//metodo que luego de leer el boton ejecuta el cambio de clave de acuerdo a su validez
						public void actionPerformed(ActionEvent e){
													
						etiqueta52.setText("CAMBIO DE CLAVE EXITOSO");
						int nueva=Integer.parseInt(clave1.getText());
						Usuario.lista.get(cedula).setclave(nueva);
						try {
						      Thread.sleep(1000);
						} catch (InterruptedException sd) {}
						ingresar(1);
							
					}});
					}else {
						claveerronea++;
						if(claveerronea<=2) {
						clavevalidar="";
						clave1.setText("");
						etiqueta52.setText("CLAVE ERRONEA");
						//ingresar();//AQUI QUIERO QUE SALGA?
						}
						else {
							JOptionPane.showMessageDialog(null, "Ya ha superado el numero de intentos", "error", JOptionPane.ERROR_MESSAGE); 
							salir();//AQUI QUIERO QUE SALGA?
						}
					}
					
					
					
					limpiar.addActionListener(new ActionListener() {
						//metodo que lee el boton y limpia los datos del usuario ingresados en pantalla
						public void actionPerformed(ActionEvent e) {
							clavevalidar="";
							clave1.setText(null);
						}

					});
				}		
				boton01.addActionListener (new ActionListener(){
					//metodo que devuelve al usuario al menu principal luego de leer el boton
					public void actionPerformed(ActionEvent e){
						ingresar(1);
					}});
						
				
				
				}
			});
			
			}
			catch(java.lang.NullPointerException a) {
				
			}
			
		


			
		}
		
		//metodo vacio que hace la operacion de pagos 
		private static void realizarpagos() {
			a=6;
			VentanaJFrame.panelCentro.removeAll();
			VentanaJFrame.panelCentro.repaint();
			VentanaJFrame.panelBusqueda.removeAll();
			VentanaJFrame.panelBusqueda.repaint();
			VentanaJFrame.panelFormulario.removeAll();
			VentanaJFrame.panelFormulario.repaint();
			etiqueta52.setText("-");
			JLabel etiqueta42 = new JLabel("     ");
			etiqueta42.setForeground(Color.BLACK);
			etiqueta42.setFont(new java.awt.Font("Tahoma", 1, 14));
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.0003;
			contenido.weighty = 0.03;
			contenido.gridx = 0;
			contenido.gridy = 0;
			VentanaJFrame.panelCentro.add(etiqueta42, contenido);
			
		
			
			JLabel etiquetaemp = new JLabel("EMPRESA ");
			etiquetaemp.setForeground(Color.BLACK);
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.0000003;
			contenido.weighty = 0.00003;
			contenido.gridx = 1;
			contenido.gridy = 1;
			VentanaJFrame.panelCentro.add(etiquetaemp, contenido);
			
			JComboBox selectoremp = new JComboBox();
			selectoremp.setModel(new DefaultComboBoxModel(new String[] {"Seleccione empresa","Agua","Luz","Gas","Telefono","Internet"}));
			selectoremp.setSelectedIndex(0);
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.00003;
			contenido.gridx = 2;
			contenido.gridy = 1;
			VentanaJFrame.panelCentro.add(selectoremp, contenido);
			
			JLabel etiqueta = new JLabel("NUMERO DE REFERENCIA ");
			etiqueta.setForeground(Color.BLACK);
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.0000003;
			contenido.weighty = 0.00003;
			contenido.gridx = 1;
			contenido.gridy = 2;
			VentanaJFrame.panelCentro.add(etiqueta, contenido);
			
			numeropag= new JTextField();
			numeropag.setText("");
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.00003;
			contenido.gridx = 2;
			contenido.gridy = 2;
			VentanaJFrame.panelCentro.add(numeropag, contenido);
			
			numeropag.addKeyListener(new KeyAdapter() {	
				//metodo que imprime un mesaje de error luego de que se intente ingresar datos por teclado que no sean alfabeticos
				public void keyTyped(KeyEvent e) {
					char c=e.getKeyChar();
					if (Character.isLetter(c)) {
						JOptionPane.showMessageDialog(null, "Solo se admiten datos numericos", "error", JOptionPane.ERROR_MESSAGE); 
			            e.consume();
			             }
				}
			});
			
			JLabel etiqueta3 = new JLabel("VALOR A TRANSFERIR ");
			etiqueta3.setForeground(Color.BLACK);
			contenido.fill = GridBagConstraints.HORIZONTAL;	
			contenido.gridx = 1;
			contenido.gridy = 3;
			VentanaJFrame.panelCentro.add(etiqueta3, contenido);
			
			valorpag = new JTextField();
			valorpag.setText("");
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.0003;
			contenido.gridx = 2;
			contenido.gridy = 3;
			VentanaJFrame.panelCentro.add(valorpag, contenido);
			
			valorpag.addKeyListener(new KeyAdapter() {		
				//metodo que imprime un mesaje de error luego de que se intente ingresar datos por teclado que no sean numericos
				public void keyTyped(KeyEvent e) {
					char c=e.getKeyChar();
					if (Character.isLetter(c)) {
						JOptionPane.showMessageDialog(null, "Solo se admiten datos numericos", "error", JOptionPane.ERROR_MESSAGE); 
			            e.consume();
			             }
				}
			});
			
			JButton continuar2= new JButton();
			continuar2.setBackground(Color.ORANGE);
			continuar2.setText("CONTINUAR CON PAGO");
			contenido.weighty = 0.00003;
			contenido.weightx = 0.0000000003;
			contenido.gridx = 4;
			contenido.gridy = 4;
			VentanaJFrame.panelCentro.add( continuar2,contenido);
			
			continuar2.addActionListener (new ActionListener(){
				//metodo que lee el boton, guarda los datos y ejecuta el pago 
				public void actionPerformed(ActionEvent e){
					try {
						if(selectoremp.getSelectedIndex()==0) {
							JOptionPane.showMessageDialog(null, "Seleccione una empresa", "Error", JOptionPane.ERROR_MESSAGE);
						}
						else if(numeropag.getText().isEmpty()||valorpag.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Por favor llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
						}
						else {
							valor=Integer.parseInt(valorpag.getText());
							System.out.println("entro");
							clave(valor);
							}

					}catch(java.lang.NumberFormatException ds) {

						

					}

				}

		});

			limpiar.addActionListener(new ActionListener() {
				//metodo lee el boton y limpiea lo ingresado por el usario en pantalla
				public void actionPerformed(ActionEvent e) {
					numeropag.setText(null);
					valorpag.setText(null);
					selectoremp.setSelectedItem(0);
				}

			});
		}
		// metodo vacio que ejecuta la transaccion transferir 
		private static void transferir() {
			a=5;
			VentanaJFrame.panelCentro.removeAll();
			VentanaJFrame.panelCentro.repaint();
			VentanaJFrame.panelBusqueda.removeAll();
			VentanaJFrame.panelBusqueda.repaint();
			VentanaJFrame.panelFormulario.removeAll();
			VentanaJFrame.panelFormulario.repaint();
			etiqueta52.setText("transferir");
			
			JLabel etiqueta42 = new JLabel("     ");
			etiqueta42.setForeground(Color.BLACK);
			etiqueta42.setFont(new java.awt.Font("Tahoma", 1, 14));
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.0003;
			contenido.weighty = 0.03;
			contenido.gridx = 0;
			contenido.gridy = 0;
			VentanaJFrame.panelCentro.add(etiqueta42, contenido);
						
			JLabel etiqueta = new JLabel("NOMBRE ");
			etiqueta.setForeground(Color.BLACK);
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.0000003;
			contenido.weighty = 0.00003;
			contenido.gridx = 1;
			contenido.gridy = 1;
			VentanaJFrame.panelCentro.add(etiqueta, contenido);
			
			nombretra= new JTextField();
			nombretra.setText("");
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.00003;
			contenido.gridx = 2;
			contenido.gridy = 1;
			VentanaJFrame.panelCentro.add(nombretra, contenido);
			
			nombretra.addKeyListener(new KeyAdapter() {					
				public void keyTyped(KeyEvent e) {
					//metodo que imprime un mesaje de error luego de que se intente ingresar datos por teclado que no sean alfabeticos
					char c=e.getKeyChar();
					if (Character.isDigit(c)) {
						JOptionPane.showMessageDialog(null, "Solo se admiten datos alfabeticos", "error", JOptionPane.ERROR_MESSAGE); 
			            e.consume();
			             }
				}
			});
			
			JLabel etiqueta1 = new JLabel("N DE CUENTA ");
			etiqueta1.setForeground(Color.BLACK);
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx =  0.00003;
			contenido.weighty = 0.03;
			contenido.gridx = 1;
			contenido.gridy = 2;
			VentanaJFrame.panelCentro.add(etiqueta1, contenido);
			
			ncuenta= new JTextField();
			ncuenta.setText("");
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.00003;
			contenido.gridx = 2;
			contenido.gridy = 2;
			VentanaJFrame.panelCentro.add(ncuenta, contenido);
			
			ncuenta.addKeyListener(new KeyAdapter() {		
				//metodo que imprime un mesaje de error luego de que se intente ingresar datos por teclado que no sean numericos
				public void keyTyped(KeyEvent e) {
					char c=e.getKeyChar();
					if (Character.isLetter(c)) {
						JOptionPane.showMessageDialog(null, "Solo se admiten datos numericos", "error", JOptionPane.ERROR_MESSAGE); 
			            e.consume();
			             }
				}
			});

			JLabel etiqueta3 = new JLabel("VALOR A TRANSFERIR ");
			etiqueta3.setForeground(Color.BLACK);
			contenido.fill = GridBagConstraints.HORIZONTAL;	
			contenido.gridx = 1;
			contenido.gridy = 3;
			VentanaJFrame.panelCentro.add(etiqueta3, contenido);
			
			JComboBox valort = new JComboBox();
			valort.setModel(new DefaultComboBoxModel(new String[] {"Seleccione un valor","10000","20000","50000","100000","200000","500000"}));
			valort.setSelectedIndex(0);
			contenido.fill = GridBagConstraints.HORIZONTAL;
			contenido.weightx = 0.0003;
			contenido.gridx = 2;
			contenido.gridy = 3;
			VentanaJFrame.panelCentro.add(valort, contenido);
			
			
			JButton continuar14= new JButton();
			continuar14.setBackground(Color.ORANGE);
			continuar14.setText("CONTINUAR TRANSFERENCIA");
			contenido.weighty = 0.00003;
			contenido.weightx = 0.0000000003;
			contenido.gridx = 4;
			contenido.gridy = 4;
			VentanaJFrame.panelCentro.add( continuar14,contenido);
			System.out.println("entro");
			
			limpiar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					nombretra.setText(null);
					ncuenta.setText(null);
					valort.setSelectedItem(0);
				}

			});
			
			continuar14.addActionListener (new ActionListener(){
				//metodo que escucha el boton y realiza el pago leyendo los datos
				public void actionPerformed(ActionEvent e){
					try {

					System.out.println("entro1sdsdsd2");

					if(valort.getSelectedIndex()==0) {
						JOptionPane.showMessageDialog(null, "Seleccione un valor", "Error",	JOptionPane.ERROR_MESSAGE);

					}

					else if(ncuenta.getText().isEmpty()||nombretra.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Por favor llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);

					}

					else {

					String valoraux=(String) valort.getSelectedItem();
					System.out.println(valoraux);
					valor=Integer.parseInt(valoraux);
					System.out.println(valor);
					System.out.println("entro");
					clave(valor);
					

					}

					}catch(java.lang.NumberFormatException ds) {

						

					}

				}

		});
			
		
		}
		//metodo que imprime el mensaje de transaccion exitosa luego de alguna
		public static void transaccionExitosa() {
	
			 etiqueta52.setText("..transaccion exitosa!.........");
			 cancelar.setEnabled(false);
			 salir.setEnabled(false);
			  VentanaJFrame.panelCentro.removeAll(); 
			  VentanaJFrame.panelCentro.repaint(); 
			  VentanaJFrame.panelBusqueda.removeAll(); 
			  VentanaJFrame.panelBusqueda.repaint(); 
			  VentanaJFrame.panelFormulario.removeAll(); 
			  VentanaJFrame.panelFormulario.repaint(); 
			  etiqueta52.setText("TRANSACCION EXITOSA......");
			 
			  etiqueta52.setText("TRANSACCION EXITOSA!..");
			

			   
			  JLabel q1 = new JLabel(); 
			  q1.setText("                  "); 
			  q1.setFont(new java.awt.Font("Tahoma", 1, 16)); 
			  contenido.weighty = 0.3; 
			  contenido.weightx = 34; 
			  contenido.gridx = 3; 
			  contenido.gridy = 1;   
			  VentanaJFrame.panelCentro.add(q1,contenido); 
			   
			  JLabel q = new JLabel(); 
			  q.setText("                    "); 
			  q.setFont(new java.awt.Font("Tahoma", 1, 16)); 
			  contenido.weighty = 0.3; 
			  contenido.weightx = 22; 
			  contenido.gridx = 0; 
			  contenido.gridy = 1;   
			  VentanaJFrame.panelCentro.add(q,contenido); 
			   
			  JLabel clave3 = new JLabel(); 
			  clave3.setText("SU TRANSACCION HA SIDO TERMINADA");
			  clave3.setFont(new java.awt.Font("Tahoma", 1, 16)); 
			  contenido.weighty = 0.3; 
			  contenido.weightx = 1; 
			  contenido.gridx = 2; 
			  contenido.gridy = 2;   
			  VentanaJFrame.panelCentro.add(clave3,contenido); 
			 
			  continuar12=new JButton(); 
			  continuar12.setText("MENU PRINCIPAL"); 
			  continuar12.setForeground(Color.WHITE); 
			  continuar12.setBackground(Color.red); 
			  contenido.weighty = 0.3; 
			  contenido.weightx = 0.5; 
			  contenido.gridx = 1; 
			  contenido.gridy = 4; 
			  VentanaJFrame.panelCentro.add(continuar12,contenido); 
			   
			  JLabel q3 = new JLabel(); 
			  q3.setText("-------------------------------------------------"); 
			  q3.setForeground(Color.orange);
			  q3.setFont(new java.awt.Font("Tahoma", 1, 16)); 
			  contenido.weighty = 1; 
			  contenido.weightx = 2; 
			  contenido.gridx = 2; 
			  contenido.gridy = 4;   
			  VentanaJFrame.panelCentro.add(q3,contenido); 
			   
			  JButton salir1 = new JButton(); 
			  salir1.setText("SALIR"); 
			  salir1.setForeground(Color.WHITE); 
			  salir1.setBackground(Color.red); 
			  contenido.weighty = 0; 
			  contenido.weightx = 0; 
			  contenido.gridx = 4; 
			  contenido.gridy = 4; 
			  VentanaJFrame.panelCentro.add(salir1,contenido); 
			  
			  URL url =PanelAbajo.class.getResource("transferencia.wav");
			   AudioClip clip = Applet.newAudioClip(url);
			    clip.play(); 
			   
			  continuar12.addActionListener (new ActionListener(){
				 //metodo que escucha el boton y lleva al menu principal del usuario
			    public void actionPerformed(ActionEvent e){ 
			    ingresar(1); 
			       
			  }}); 
			  salir1.addActionListener (new ActionListener(){
				 //metodo que escucha el boton y sale del usuario en curso
			    public void actionPerformed(ActionEvent e){ 
			    salir(); 
			       
			  }}); 
			  
	
			} 
			   

		
		
		
	
	
}
				
			
		
	
			