import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InicioOlivaBet extends JFrame implements ActionListener {

	JButton btnFrutas,btnAnimales,btnJoyas,btnHalloween,btnNavidad;
	JLabel lbltitulo,lblimgfrutas,lblimganimales,lblimgjoyas,lblimghalloween,lblimgnavidad;
	ImageIcon imgfrutas,imganimales,imgjoyas,imghalloween,imgnavidad;
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
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnFrutas) {
			new SlotFrutas();
		}
		if(e.getSource()==btnAnimales) {
			new SlotAnimales();
		}
		if(e.getSource()==btnJoyas) {
			new SlotJoyas();
		}
		if(e.getSource()==btnHalloween) {
			new SlotHalloween();
		}
	
		if(e.getSource()==btnNavidad) {
			new SlotNavidad();
		}

	}

	public static void main(String[] args) {
		new InicioOlivaBet();

	}

}
