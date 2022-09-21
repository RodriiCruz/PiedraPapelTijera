package piedraPapelTijera;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

/**
 * 
 * @author Rodrigo Cruz <rodriikc@gmail.com>
 */
public class PiedraPapelTijera extends JFrame {

	private final Integer OPC_PIEDRA = 1;
	private final Integer OPC_PAPEL = 2;
	private final Integer OPC_TIJERA = 3;
	private final ImageIcon IMG_PIEDRA_J = new ImageIcon("img/piedraJ.png");
	private final ImageIcon IMG_PAPEL_J = new ImageIcon("img/papelJ.png");
	private final ImageIcon IMG_TIJERA_J = new ImageIcon("img/tijeraJ.png");
	private final ImageIcon IMG_PIEDRA_C = new ImageIcon("img/piedraC.png");
	private final ImageIcon IMG_PAPEL_C = new ImageIcon("img/papelC.png");
	private final ImageIcon IMG_TIJERA_C = new ImageIcon("img/tijeraC.png");
	private JPanel contentPane;
	private Juego juego;
	private JLabel eleccionJugador;
	private JLabel eleccionCPU;
	private JLabel lblPuntajeJugador;
	private JLabel lblPuntajeCPU;
	private JLabel lblResultado;

	public PiedraPapelTijera() {
		juego = new Juego();
		setIconImage(Toolkit.getDefaultToolkit().getImage("img/icono.png"));
		setResizable(false);
		setTitle("Piedra, papel o tijera?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 308);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		addLabels();
		addBtnPiedra();
		addBtnPapel();
		addBtnTijera();
	}

	private void addBtnPiedra() {
		JButton btnPiedra = new JButton();
		btnPiedra.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPiedra.setToolTipText("Piedra");
		btnPiedra.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				eleccionJugador.setIcon(IMG_PIEDRA_J);
				juego.setEleccionJugador(OPC_PIEDRA);
				jugar();
			}
		});
		btnPiedra.setIcon(IMG_PIEDRA_J);
		btnPiedra.setBounds(30, 150, 100, 100);
		contentPane.add(btnPiedra);
	}

	private void addBtnPapel() {
		JButton btnPapel = new JButton();
		btnPapel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPapel.setToolTipText("Papel");
		btnPapel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				eleccionJugador.setIcon(IMG_PAPEL_J);
				juego.setEleccionJugador(OPC_PAPEL);
				jugar();
			}
		});
		btnPapel.setIcon(IMG_PAPEL_J);
		btnPapel.setBounds(140, 150, 100, 100);
		contentPane.add(btnPapel);
	}

	private void addBtnTijera() {
		JButton btnTijera = new JButton();
		btnTijera.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTijera.setToolTipText("Tijera");
		btnTijera.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				eleccionJugador.setIcon(IMG_TIJERA_J);
				juego.setEleccionJugador(OPC_TIJERA);
				jugar();
			}
		});
		btnTijera.setIcon(IMG_TIJERA_J);
		btnTijera.setBounds(250, 150, 100, 100);
		contentPane.add(btnTijera);
	}

	private void addLabels() {
		eleccionJugador = new JLabel();
		eleccionJugador.setBounds(30, 39, 100, 100);
		contentPane.add(eleccionJugador);

		eleccionCPU = new JLabel();
		eleccionCPU.setBounds(250, 39, 100, 100);
		contentPane.add(eleccionCPU);

		lblPuntajeJugador = new JLabel();
		lblPuntajeJugador.setHorizontalAlignment(SwingConstants.LEFT);
		lblPuntajeJugador.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPuntajeJugador.setBounds(85, 125, 45, 25);
		contentPane.add(lblPuntajeJugador);

		lblPuntajeCPU = new JLabel();
		lblPuntajeCPU.setHorizontalAlignment(SwingConstants.LEFT);
		lblPuntajeCPU.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPuntajeCPU.setBounds(305, 125, 45, 25);
		contentPane.add(lblPuntajeCPU);

		lblResultado = new JLabel();
		lblResultado.setForeground(Color.BLACK);
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblResultado.setBounds(128, 39, 124, 25);
		contentPane.add(lblResultado);

		JLabel lblJugador = new JLabel("Jugador");
		lblJugador.setForeground(Color.BLACK);
		lblJugador.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblJugador.setHorizontalAlignment(SwingConstants.CENTER);
		lblJugador.setBounds(30, 11, 100, 25);
		contentPane.add(lblJugador);

		JLabel lblCpu = new JLabel("CPU");
		lblCpu.setForeground(Color.BLACK);
		lblCpu.setHorizontalAlignment(SwingConstants.CENTER);
		lblCpu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCpu.setBounds(250, 11, 100, 25);
		contentPane.add(lblCpu);

		JLabel lblVersus = new JLabel("VS");
		lblVersus.setForeground(Color.BLACK);
		lblVersus.setHorizontalAlignment(SwingConstants.CENTER);
		lblVersus.setFont(new Font("Bauhaus 93", Font.PLAIN, 39));
		lblVersus.setBounds(128, 39, 124, 100);
		contentPane.add(lblVersus);

		JLabel lblPuntaje1 = new JLabel("Puntaje: ");
		lblPuntaje1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPuntaje1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPuntaje1.setBounds(30, 125, 100, 25);
		contentPane.add(lblPuntaje1);

		JLabel lblPuntaje2 = new JLabel("Puntaje:");
		lblPuntaje2.setHorizontalAlignment(SwingConstants.LEFT);
		lblPuntaje2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPuntaje2.setBounds(250, 125, 100, 25);
		contentPane.add(lblPuntaje2);
	}

	private void jugar() {
		int cpu = (int) (Math.random() * (1 - 4) + 4);

		switch (cpu) {
		case 1:
			eleccionCPU.setIcon(IMG_PIEDRA_C);
			break;
		case 2:
			eleccionCPU.setIcon(IMG_PAPEL_C);
			break;
		default:
			eleccionCPU.setIcon(IMG_TIJERA_C);
			break;
		}

		lblResultado.setText(juego.jugar(cpu));
		lblPuntajeJugador.setText(juego.getPuntajeJugador().toString());
		lblPuntajeCPU.setText(juego.getPuntajeCPU().toString());
	}
}
