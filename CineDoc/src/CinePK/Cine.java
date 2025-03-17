package CinePK;

public class Cine {

	protected int aforo, butacasOcupadas;
	protected String tituloPelicula;
	protected int precioEntrada;
	
	/**
	 * Constructor vacío
	 * aforo = 100, butacasOcupadas = 0, precioEntrada = 5, tituloPelicula = "Sin determinar"
	 */
	public Cine() {
		super();
		this.aforo = 100;
		this.butacasOcupadas = 0;
		this.precioEntrada = 5;
		this.tituloPelicula = "Sin determinar";
	}

	/**
	 * Constructor con aforo
	 * butacasOcupadas = 0, precioEntrada = 5, tituloPelicula = "Sin determinar"
	 * @param aforo int
	 */
	public Cine(int aforo) {
		super();
		this.aforo = aforo;
		this.butacasOcupadas = 0;
		this.precioEntrada = 5;
		this.tituloPelicula = "Sin determinar";
	}

	/**
	 * Constructor con aforo, butacasOcupadas y precioEntrada
	 * tituloPelicula = "Sin determinar"
	 * @param aforo int
	 * @param butacasOcupadas int
	 * @param precioEntrada int
	 */
	public Cine(int aforo, int butacasOcupadas, int precioEntrada) {
		super();
		this.aforo = aforo;
		this.butacasOcupadas = butacasOcupadas;
		this.precioEntrada = precioEntrada;
		this.tituloPelicula = "Sin determinar";
	}

	/**
	 * Getter de aforo
	 * @return aforo
	 */
	public int getAforo() {
		return aforo;
	}

	/**
	 * Setter de aforo
	 * @param aforo
	 */
	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	/**
	 * Getter de butacasOcupadas
	 * @return butacasOcupadas
	 */
	public int getButacasOcupadas() {
		return butacasOcupadas;
	}

	/**
	 * Setter de butacasOcupadas
	 * @param butacasOcupadas
	 */
	public void setButacasOcupadas(int butacasOcupadas) {
		this.butacasOcupadas = butacasOcupadas;
	}

	/**
	 * Getter de tituloPelicula
	 * @return tituloPelicula
	 */
	public String getTituloPelicula() {
		return tituloPelicula;
	}

	/**
	 * Setter de tituloPelicula
	 * @param tituloPelicula
	 */
	public void setTituloPelicula(String tituloPelicula) {
		this.tituloPelicula = tituloPelicula;
	}

	/**
	 * Getter de precioEntrada
	 * @return precioEntrada
	 */
	public int getPrecioEntrada() {
		return precioEntrada;
	}

	/**
	 * Setter de precioEntrada
	 * @param precioEntrada
	 */
	public void setPrecioEntrada(int precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	
		
}

/*Crea la clase Cine. La clase va a tener los siguientes atributos
 aforo, número de butacas del cine
 butacasOcupadas, número de butacas ocupadas
 tituloPelicula, nombre de la película
 precioEntrada, precio de la entrada
Por defecto el aforo es de 100, las butacas ocupadas son 0 y el precio de la entrada son 5
euros. El titulo por defecto es “Sin determinar”.
Crea constructores para:
 ningún parámetro
 aforo
 aforo, titulo, precioEntrada*/