package piedraPapelTijera;

import java.awt.EventQueue;

/**
 * 
 * @author Rodrigo Cruz <rodriikc@gmail.com>
 */
public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					new PiedraPapelTijera().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
