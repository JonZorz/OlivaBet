import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class InicioOlivaBet extends JFrame implements ActionListener {
	

	JButton btnFrutas,btnAnimales;
	static JButton btnJoyas;
	static JButton btnHalloween;
	static JButton btnNavidad;
	JButton btnCobrar;
	JButton btnRanking;
	JButton btnReiniciar;
	JLabel lbltitulo,lblimgfrutas,lblimganimales,lblimgjoyas,lblimghalloween,lblimgnavidad;
	static JLabel lblPuntos;

	ImageIcon imgfrutas,imganimales,imgjoyas,imghalloween,imgnavidad;
	
	static public int puntuacion = 5000; 
	
	public InicioOlivaBet(){
	      setTitle("Inicio Oliva Bet");
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setSize(1000, 800); 
	      setLayout(null);
	      setVisible(true);
	

	      
	      
	      btnFrutas = new JButton ("Juega Frutas");
	      btnFrutas.addActionListener(this);
	      btnAnimales = new JButton ("Juega Animales");
	      btnAnimales.addActionListener(this);
	      btnJoyas = new JButton ("Juega Joyas");
	      btnJoyas.addActionListener(this);
	      btnHalloween = new JButton ("Juega Halloween");
	      btnHalloween.addActionListener(this);
	      btnNavidad = new JButton ("Juega Navidad");
	      btnNavidad.addActionListener(this);
	      
	      
	      btnCobrar = new JButton ("Cobrar");
	      btnCobrar.addActionListener(this);
	      btnRanking = new JButton ("Ver ranking");
	      btnRanking.addActionListener(this);
	      btnReiniciar = new JButton ("Reiniciar");
	      btnReiniciar.addActionListener(this);
	      
	      
	      
	       lbltitulo = new JLabel ("Elige Máquina");
	       imgfrutas = new ImageIcon("F:\\DAW1\\RETOS\\RETO3\\imagenes Java\\frutas.png");
	       lblimgfrutas = new JLabel(imgfrutas);
	       
	       imganimales = new ImageIcon("F:\\DAW1\\RETOS\\RETO3\\imagenes Java\\animales.png");
	       lblimganimales = new JLabel(imganimales);
	       
	       imgjoyas = new ImageIcon("F:\\DAW1\\RETOS\\RETO3\\imagenes Java\\joyas.png");
	       lblimgjoyas = new JLabel(imgjoyas);
	       
	       imghalloween = new ImageIcon("F:\\DAW1\\RETOS\\RETO3\\imagenes Java\\halloween.png");
	       lblimghalloween = new JLabel(imghalloween);
	       
	       imgnavidad = new ImageIcon("F:\\DAW1\\RETOS\\RETO3\\imagenes Java\\navidad.png");
	       lblimgnavidad = new JLabel(imgnavidad);
	     
	       lblPuntos = new JLabel (String.valueOf(puntuacion));
	    
	       add(lblPuntos);
	       
	       
	       
	       lblPuntos.setSize(200,50);
	       lblPuntos.setLocation(120,50);
	       
	       lblPuntos.setFont(new Font("Verdana", Font.BOLD, 22));
	       lblPuntos.setForeground(new Color(94, 16, 23));
	       
	       
	       add(btnFrutas);
	       btnFrutas.setSize(200,100);
	       btnFrutas.setLocation(70,180);
	       
	       add(btnAnimales);
	       btnAnimales.setSize(200,100);
	       btnAnimales.setLocation(370,180);
	       
	       add(btnJoyas);
	       btnJoyas.setSize(200,100);
	       btnJoyas.setLocation(670,180);
	       
	       add(btnHalloween);
	       btnHalloween.setSize(200,100);
	       btnHalloween.setLocation(70,500);
	       
	       
	       add(btnNavidad);
	       btnNavidad.setSize(200,100);
	       btnNavidad.setLocation(670,500);
	       
	       add(btnCobrar);
	       btnCobrar.setSize(300,100);
	       btnCobrar.setLocation(100,630);
	       
	       add(btnRanking);
	       btnRanking.setSize(300,100);
	       btnRanking.setLocation(500,630);
	       
	       lbltitulo.setFont(new Font("Arial", Font.BOLD, 25));
	       lbltitulo.setForeground(new Color (3, 169, 252));
	       
	       add(lbltitulo);
	       
	       lbltitulo.setSize(200,200);
	       lbltitulo.setLocation(400,1);
	       
	       add(lblimgfrutas);
	       
	       lblimgfrutas.setSize(100,190);
	       lblimgfrutas.setLocation(110,290);
	       
	       
	       add(lblimganimales);
	       lblimganimales.setSize(100,150);
	       lblimganimales.setLocation(410,290);
	       
	       add(lblimgjoyas);
	       lblimgjoyas.setSize(200,200);
	       lblimgjoyas.setLocation(670,270);
	       
	       add(lblimghalloween);
	       lblimghalloween.setSize(150,150);
	       lblimghalloween.setLocation(310,470);
	       
	       add(lblimgnavidad);
	       
	       lblimgnavidad.setSize(150,150);
	       lblimgnavidad.setLocation(490,470);
	       
	       
	 
	      
	      
	      
	  	 decorarBoton(btnFrutas);
	  	 decorarBoton(btnAnimales);
	  	 decorarBoton(btnJoyas);
	  	 decorarBoton(btnHalloween);
	  	 decorarBoton(btnNavidad);
	 	
	  	decorarBoton2(btnCobrar);
	  	decorarBoton2(btnRanking);
	  	
		if(puntuacion<8000)
			btnJoyas.setEnabled(false);
		if(puntuacion<15000) {
			btnHalloween.setEnabled(false);
			btnNavidad.setEnabled(false);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	
			
	  
	     
		if(e.getSource()==btnFrutas) {
			new SlotFrutas();
			setVisible(false);
		}
		if(e.getSource()==btnAnimales) {
			new SlotAnimales();
			setVisible(false);
		}
		if(e.getSource()==btnJoyas) {
			new SlotJoyas();
			setVisible(false);
		}
		if(e.getSource()==btnHalloween) {
			new SlotHalloween();
			setVisible(false);
		}
	
		if(e.getSource()==btnNavidad) {
			new SlotNavidad();
			setVisible(false);		}
		
		
		if(e.getSource()==btnRanking) {
			verRaknking();		
			}
		if(e.getSource()==btnCobrar) {
			Cobro();
		}
	}

	public static void main(String[] args) {
		
	
		
		new InicioOlivaBet();
		puntuacion = Integer.parseInt(lblPuntos.getText());
		lblPuntos.setText(String.valueOf(puntuacion));
	}
	
	 private void decorarBoton(JButton boton) {
		 boton.setBackground(new Color(62, 95, 231)); 
		 boton.setForeground(Color.WHITE); 
		 boton.setFocusPainted(false); // Desactivamos el pintado de enfoque al hacer clic
		 boton.setFont(new Font("Arial", Font.BOLD, 14)); 

	    }
	 
	 private void decorarBoton2(JButton boton) {
		 boton.setBackground(new Color(231, 159, 62)); 
		 boton.setForeground(Color.WHITE); 
		 boton.setFocusPainted(false); // Desactivamos el pintado de enfoque al hacer clic
		 boton.setFont(new Font("Arial", Font.BOLD, 14)); 
		 
		
	       
	    }
	 protected void verRaknking() {
		  
		 

	    }
	 
	 protected void Cobro() {
		 
	        try {
	  
	            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/olivabet", "root", "");

	            String sql = "INSERT INTO rankingusuarios (nombreUsuario, id_Usuario, nombreUsuarioRanking,puntos) VALUES ()";
	            PreparedStatement stmt = conn.prepareStatement(sql);
	            System.out.println(sql);
	            
	         
	           stmt.executeUpdate(sql);
	          
	           
	           stmt.close();//cerrar el statement

	           conn.close();//cerrar la conexión con la base de datos
	           
	           
				JOptionPane.showMessageDialog(this, "Felicidades, te has registrado","Registro",JOptionPane.INFORMATION_MESSAGE);

	            new InicioOlivaBet();
	        } catch (Exception e) {
	            System.out.println("Error al insertar datos: " + e);
	           
	        }
	 }
	 

}
