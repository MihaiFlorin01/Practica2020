package poo;

public class MainApplication {

	public static void main(String[] args) {
		Comanda comanda1 = new ComandaMagazin();
		comanda1.afisare();
		Comanda comanda2 = new ComandaFerma();
		comanda2.afisare();
	}

}
