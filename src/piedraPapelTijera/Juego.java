package piedraPapelTijera;

/**
 * 
 * @author Rodrigo Cruz <rodriikc@gmail.com>
 */
public class Juego {

	private Integer eleccionJugador;
	private Integer puntajeJugador;
	private Integer puntajeCPU;
	private final String PERDISTE = "Perdiste!";
	private final String GANASTE = "Ganaste!";
	private final String EMPATAMOS = "Empatamos!";

	public Juego() {
		this.puntajeCPU = 0;
		this.puntajeJugador = 0;
	}

	public void setEleccionJugador(Integer eleccionJugador) {
		this.eleccionJugador = eleccionJugador;
	}

	public Integer getPuntajeJugador() {
		return puntajeJugador;
	}

	public Integer getPuntajeCPU() {
		return puntajeCPU;
	}

	public String jugar(Integer eleccionCPU) {
		String resultado = "";
		if (eleccionCPU == this.eleccionJugador)
			resultado = EMPATAMOS;
		else {

			if (eleccionCPU == 1) {
				switch (this.eleccionJugador) {
				case 2:
					this.puntajeJugador++;
					resultado = GANASTE;
					break;
				case 3:
					this.puntajeCPU++;
					resultado = PERDISTE;
					break;
				}
			}

			if (eleccionCPU == 2) {
				switch (this.eleccionJugador) {
				case 1:
					this.puntajeCPU++;
					resultado = PERDISTE;
					break;
				case 3:
					this.puntajeJugador++;
					resultado = GANASTE;
					break;
				}
			}

			if (eleccionCPU == 3) {
				switch (this.eleccionJugador) {
				case 1:
					this.puntajeJugador++;
					resultado = GANASTE;
					break;
				case 2:
					this.puntajeCPU++;
					resultado = PERDISTE;
					break;
				}
			}
		}

		return resultado;
	}
}
