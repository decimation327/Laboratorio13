package laboratorio13;

public class Flecha {
	
	int longitud;
	String color;
	
	public Flecha(int longitud, String color) {
		this.longitud = longitud;
		this.color = color;
	}
	
	

	public void flecha() {
		longitud = 18;
		color="negro";
	}
	
	public void imprimirEspacio() {
		System.out.println();
	}
	public void construirFlecha() {
		for (int i = 0; i < longitud; i++) {
			System.out.println("-");
		}
		System.out.println(">");
	}
	public void imprime(String simbolo) {
		if (color.equals("negro")) {
			System.out.println(simbolo);
		} else {
			System.err.println(simbolo);
		}
	}

}