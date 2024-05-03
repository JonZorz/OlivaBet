import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SlotFrutas extends JFrame {

    private String[][] emojis;
    private JPanel panelEmojis;
    private JLabel lblPuntos;
    int contadorFresa,contadorPomelo,contadorSandia,contadorUva,contadorCerezas,contadorLimon,contadorNaranaja,contadorBanana,contadorCoco,contadorPina;
    int puntos;
    JLabel emojiLabel;
    
    public SlotFrutas() {
        setTitle("Slot Frutas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600); 
        setVisible(true);

   
        emojis = new String[][]{
        	{"🍓", "🍈", "🍉", "🍇", "🍒"},
            {"🍊", "🥝", "🍌", "🥥", "🍍"} 
        };
        
        

        lblPuntos = new JLabel ("5000");
        panelEmojis = new JPanel(new GridLayout(8, 7));

		add(panelEmojis, BorderLayout.CENTER);
	
        lblPuntos.setFont(new Font("Verdana",Font.BOLD,22));
        lblPuntos.setForeground(new Color (94, 16, 23));
        add(lblPuntos,BorderLayout.NORTH);

       
        JButton btnJugar = new JButton("Jugar");
        btnJugar.addActionListener(new ActionListener() {
            
        	@Override
            public void actionPerformed(ActionEvent e) {
                cargarSlot();
            }
        });

       
        add(btnJugar, BorderLayout.SOUTH);

        setVisible(true);
    }


    private void cargarSlot() {
        panelEmojis.removeAll(); 
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                int aleatorioFila = (int) (Math.random() * emojis.length);
                int aleatorioColumna = (int) (Math.random() * emojis[aleatorioFila].length);
                emojiLabel = new JLabel(emojis[aleatorioFila][aleatorioColumna]);
                emojiLabel.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 30)); 
                emojiLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panelEmojis.add(emojiLabel);
               
            }
        }
        panelEmojis.revalidate(); // Realizamos la acción de poder remover los elementos, se le llama cuando añade o borra elementos existentes
        panelEmojis.repaint();	//Indicamos que un elemento debe volver a mostrarse, es útil para limpiar condciones como antes mencionadas en revalidate
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SlotFrutas::new); //Hace que doRun.run() se ejecute de forma asincrónica
    }
}
