
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 * Este clase me crea un JFrame para añadir usuarios
 * @author Corin Viracacha y Isaac Gomez
 */
//Creo la clase usuario
class Usuario extends JFrame{
// creo un arraylist donde me guarda los datos de los usuarios
static List<Persona> lista;
static int ban=0,user;
static String nombresuser;
/**
 * Contructor de la clase usuario
 */
	public Usuario(String titulo) {
		super(titulo);
		
		this.iniciar(); //Configurar mi JFRAME
		this.configurarComponentes();

		this.pack();
		this.setVisible(true);
	}
	/**
	 * Diseño de JFrame Usuario
	 */
	private Usuario iniciar() {
		JFrame frame=new JFrame();
		
		Dimension dims = new Dimension(590, 300);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane().setLayout(null); 
		this.setBackground(Color.BLUE);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		return this;
	}
	/**
	 * Metodo configurar componentes
	 * Este metodo se encarga de recoger los datos de usuario y añadirlo a la lista
	 * Ademas de validar que el usuario no este repetido
	 */
	private  void configurarComponentes() {
		//instancio la lista
		
		
		Container contentPane = this.getContentPane();
		contentPane.setBackground(Color.orange);

		JLabel etiqueta2 = new JLabel("DATOS DE USUARIO");
		etiqueta2.setFont(new java.awt.Font("Agency FB", 1, 16));
		etiqueta2.setForeground(Color.black);
		etiqueta2.setBounds(200, 0, 150, 100);
		contentPane.add(etiqueta2);
		
		// ingreso una imagen de decoracion 
		ImageIcon imagen = new ImageIcon( "images/usuarios.png");		
		JLabel foto = new JLabel(imagen);
		foto.setBounds(450,20, 100, 123);
		contentPane.add(foto);
		
		//Aqui solicito desde la linea 72 a la 169 solicito los datos de usuario como cedula,nombre, apellido, saldo y clave
		//Ademas los valido con un KeyListener 
		JLabel etiqueta5 = new JLabel("N° DE CEDULA: ");
		etiqueta5.setForeground(Color.black);
		etiqueta5.setBounds(10, 45, 100, 50);
		contentPane.add(etiqueta5);
	
		JTextField cedula = new JTextField();
		cedula .setText("");
		cedula .setBounds(120, 65,290, 20);
		contentPane.add(cedula);
		
		cedula.addKeyListener(new KeyAdapter() {					
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if (Character.isLetter(c)) {
					JOptionPane.showMessageDialog(null, "Solo se admiten datos numericos", "error", JOptionPane.ERROR_MESSAGE); 
		            e.consume();
		             }
			}
		});
		
		
		JLabel etiqueta = new JLabel("NOMBRE: ");
		etiqueta.setForeground(Color.black);
		etiqueta.setBounds(10, 79, 90, 50);
		contentPane.add(etiqueta);
	
		JTextField cajadetexto = new JTextField();
		cajadetexto.setText("");
		cajadetexto.setBounds(120,95,290, 20);
		contentPane.add(cajadetexto);
		
		cajadetexto.addKeyListener(new KeyAdapter() {					
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if (Character.isDigit(c)) {	
					JOptionPane.showMessageDialog(null, "Solo se admiten letras", "error", JOptionPane.ERROR_MESSAGE); 
		            e.consume();
		             }
			}
		});
		
		JLabel etiqueta1 = new JLabel("APELLIDO: ");
		etiqueta1.setForeground(Color.black);
		etiqueta1.setBounds(10, 105, 90, 60);
		contentPane.add(etiqueta1);
				
		JTextField cajadetexto1 = new JTextField();
		cajadetexto1.setBounds(120, 125,290, 20);
		contentPane.add(cajadetexto1);
		
		cajadetexto1.addKeyListener(new KeyAdapter() {					
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if (Character.isDigit(c)) {	
					JOptionPane.showMessageDialog(null, "Solo se admiten letras", "error", JOptionPane.ERROR_MESSAGE); 
		            e.consume();
		             }
			}
		});
		
		JLabel saldo = new JLabel("SUELDO: ");
		saldo.setForeground(Color.black);
		saldo.setBounds(10, 145, 90, 50);
		contentPane.add(saldo);
	
		JTextField saldo1 = new JTextField();
		saldo1.setText(null);
		saldo1.setBounds(120, 165,290, 20);
		contentPane.add(saldo1);
		
		saldo1.addKeyListener(new KeyAdapter() {					
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if (Character.isLetter(c)) {	
					JOptionPane.showMessageDialog(null, "Solo se admiten datos numericos", "error", JOptionPane.ERROR_MESSAGE); 
		            e.consume();
		             }
			}
		});
		
		JLabel clave = new JLabel("CLAVE: ");
		clave.setForeground(Color.black);
		clave.setBounds(10, 170, 90, 60);
		contentPane.add(clave );
				
		JTextField clave1 = new JTextField();
		clave1.setBounds(120, 195,290, 20);
		contentPane.add(clave1);
		
		clave1.addKeyListener(new KeyAdapter() {					
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if (Character.isLetter(c)) {
					JOptionPane.showMessageDialog(null, "Solo se admiten datos numericos", "error", JOptionPane.ERROR_MESSAGE); 
		            e.consume();
		             }
			}
		});
                
        JButton boton21 = new JButton("ACEPTAR");
		boton21.setBounds(210, 235, 130, 20);
		contentPane.add(boton21);
	
		//Una vez escucha este boton me guarda los datos en el array list ademas me valida que ningun campo quede vacio
           boton21.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){ 			
				ban=0;
				try {
				user=Integer.parseInt(cedula.getText());
				}catch(java.lang.NumberFormatException sd) {
					user=0;
				}
				for(int i=0;i<lista.size();i++) {
					System.out.println("ENTRO"+i);
					if(user==lista.get(i).getcedula()) {
						System.out.println("ENTRO"+i);	
						ban++;
					}
				}
				try {
                            if(cajadetexto.getText().equals("") || cajadetexto1.getText().equals("") || cedula.getText().equals("")|| saldo.getText().equals("") || clave.getText().equals("") ) {
					JOptionPane.showMessageDialog(null, "Error por favor complete las casillas", "error", JOptionPane.ERROR_MESSAGE); 
					 
				}
                            else{
                            	if(ban==1) {
                           		 JOptionPane.showMessageDialog(null, "Este usuario ya se encuentra registrado", "error", JOptionPane.ERROR_MESSAGE); 
                           		 cajadetexto.setText("");
                           		 cajadetexto1.setText("");
                           		 cedula.setText("");
                           		 saldo1.setText("");
                           		 clave1.setText("");}
                            	else {
                nombresuser=cajadetexto.getText()+" "+cajadetexto1.getText();
                //instancio la lista de tipo persona
				lista.add(new Persona(Integer.parseInt(cedula.getText()),cajadetexto.getText(),cajadetexto1.getText(),Float.parseFloat(saldo1.getText()),Integer.parseInt(clave1.getText()))); 
				System.out.println("LA LISTA"+lista.size());
				// dispose para salir de la ventana
                                dispose(); 
                                        } 
                            }
				}catch (java.lang.NumberFormatException s) {
					JOptionPane.showMessageDialog(null, "Revisar los datos numericos", "error", JOptionPane.ERROR_MESSAGE); 
				}
                            
                             
			}}
		);
}
	

	
	

}