import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SlotAnimales extends JFrame {

    private String[][] emojis;
    private JPanel panelEmojis;
    private JLabel lblPuntos;
    public SlotAnimales() {
        setTitle("Slot Animales");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600); 
        setVisible(true);


        emojis = new String[][]{
        	{"🐮", "🦬", "🦢", "🐶", "🐺"},
            {"🐻", "🐴", "🐘", "🐯", "🐌"} 
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
                JLabel emojiLabel = new JLabel(emojis[aleatorioFila][aleatorioColumna]);
                emojiLabel.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 30));
                emojiLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panelEmojis.add(emojiLabel);
            }
        }
        panelEmojis.revalidate();
        panelEmojis.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SlotAnimales::new);
    }
    
    		
    
}
