import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
 *
 * @author Leo
 */
class Usuario extends JFrame{
static List<Persona> lista;

static String nombresuser;
	
	public Usuario(String titulo) {
		super(titulo);
		
		this.iniciar(); //Configurar mi JFRAME
		this.configurarComponentes();

		this.pack();
		this.setVisible(true);
	}
	
	private Usuario iniciar() {
		JFrame frame=new JFrame();
		
		Dimension dims = new Dimension(540, 300);
		this.setSize(dims);
		this.setPreferredSize(dims);
		this.getContentPane().setLayout(null); 
		this.setBackground(Color.BLUE);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		return this;
	}
	
	private  void configurarComponentes() {
		
		lista = new ArrayList<Persona>(); 
		
		Container contentPane = this.getContentPane();
		contentPane.setBackground(Color.orange);

		JLabel etiqueta2 = new JLabel("DATOS DE USUARIO");
		etiqueta2.setFont(new java.awt.Font("Agency FB", 1, 16));
		etiqueta2.setForeground(Color.black);
		etiqueta2.setBounds(200, 0, 150, 100);
		contentPane.add(etiqueta2);
		
		
		ImageIcon imagen = new ImageIcon( "images/usuarios.png");		
		JLabel foto = new JLabel(imagen);
		foto.setBounds(400,20, 100, 123);
		contentPane.add(foto);
		
		
		JLabel etiqueta5 = new JLabel("N DE CEDULA");
		etiqueta5.setForeground(Color.black);
		etiqueta5.setBounds(10, 45, 100, 50);
		contentPane.add(etiqueta5);
	
		JTextField cedula = new JTextField();
		cedula .setText("");
		cedula .setBounds(100, 65,290, 20);
		contentPane.add(cedula);
		
		
		JLabel etiqueta = new JLabel("NOMBRE");
		etiqueta.setForeground(Color.black);
		etiqueta.setBounds(10, 79, 50, 50);
		contentPane.add(etiqueta);
	
		JTextField cajadetexto = new JTextField();
		cajadetexto.setText("");
		cajadetexto.setBounds(100,95,290, 20);
		contentPane.add(cajadetexto);
		
		JLabel etiqueta1 = new JLabel("APELLIDO");
		etiqueta1.setForeground(Color.black);
		etiqueta1.setBounds(10, 105, 60, 60);
		contentPane.add(etiqueta1);
				
		JTextField cajadetexto1 = new JTextField();
		cajadetexto1.setBounds(100, 125,290, 20);
		contentPane.add(cajadetexto1);
		
		JLabel saldo = new JLabel("SUELDO");
		saldo.setForeground(Color.black);
		saldo.setBounds(10, 145, 50, 50);
		contentPane.add(saldo);
	
		JTextField saldo1 = new JTextField();
		saldo1.setText("");
		saldo1.setBounds(100, 165,290, 20);
		contentPane.add(saldo1);
		
		JLabel clave = new JLabel("CLAVE");
		clave.setForeground(Color.black);
		clave.setBounds(10, 170, 60, 60);
		contentPane.add(clave );
				
		JTextField clave1 = new JTextField();
		clave1.setBounds(100, 195,290, 20);
		contentPane.add(clave1);
                
        JButton boton21 = new JButton("ACEPTAR");
		boton21.setBounds(210, 235, 130, 20);
		contentPane.add(boton21);
                boton21.addActionListener (new ActionListener(){
			public void actionPerformed(ActionEvent e){  
				try {
                            if(cajadetexto.getText().equals("") || cajadetexto1.getText().equals("") || cedula.getText().equals("")|| saldo.getText().equals("") || clave.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Error por favor complete las casillas", "error", JOptionPane.ERROR_MESSAGE); 
				}
                            else{
                nombresuser=cajadetexto.getText()+" "+cajadetexto1.getText();
				lista.add(new Persona(Integer.parseInt(cedula.getText()),cajadetexto.getText(),cajadetexto1.getText(),Float.parseFloat(saldo1.getText()),Integer.parseInt(clave1.getText()))); 
				System.out.println(lista.get(0).getcedula());
                                dispose(); 
                                        } 
				}catch (java.lang.NumberFormatException s) {
					JOptionPane.showMessageDialog(null, "Revisar los datos numericos", "error", JOptionPane.ERROR_MESSAGE); 
				}
                            
                             
			}}
		);
}

}