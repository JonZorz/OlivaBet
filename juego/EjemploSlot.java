import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploSlot extends JFrame {

	private String[][] emojis;
	private JPanel panelEmojis;

	public EjemploSlot() {
		setTitle("Slot Machine");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);

		emojis = new String[][] { { "🐪", "🏜️", "🏺", "🗿", "🌴" }, { "🕌", "🐍", "⚱️", "🌴", "🏜️" } };

		panelEmojis = new JPanel(new GridLayout(5, 5));

		add(panelEmojis, BorderLayout.CENTER);

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
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int aleatorioFila = (int) (Math.random() * emojis.length);
				int aleatorioColumna = (int) (Math.random() * emojis[aleatorioFila].length);
				JLabel emojiLabel = new JLabel(emojis[aleatorioFila][aleatorioColumna]);
				emojiLabel.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 30));
				panelEmojis.add(emojiLabel);
			}
		}
		panelEmojis.revalidate();
		panelEmojis.repaint();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(EjemploSlot::new);
	}
}
