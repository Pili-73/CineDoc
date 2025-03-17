package CinePK;

public class mainCine {

	public static void main(String[] args) {

		Cine cine = new Cine(4, 0, 10);
		cine.setTituloPelicula("Terror en el instituto");
		
		System.out.println(cine);
	}

}

/*Crea un cine con un aforo de 4 butacas a un precio de 10
euros para la película “Terror en el instituto”.*/