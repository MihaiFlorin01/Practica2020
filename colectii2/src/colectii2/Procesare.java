package colectii2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Procesare{
	
	public void operatiiFisier() throws FileNotFoundException {
		
		File fisier = new File("C:\\Users\\Florin\\eclipse-workspace\\colectii2\\bin\\colectii2\\comenzi");
		if (!fisier.canRead()) {
			fisier.setReadable(true);
		}
		Scanner scanner = new Scanner(fisier);
		ArrayList<Comanda> lista = new ArrayList<Comanda>();
		while(scanner.hasNextLine()) {
			
			String linie = scanner.nextLine();
			String parti[] = linie.split(" ");
			Comanda comanda = new Comanda(Integer.parseInt(parti[0]), Integer.parseInt(parti[1]), Integer.parseInt(parti[2]));
			lista.add(comanda);
		}
		Double sumaTotala = lista.stream().mapToDouble(suma -> suma.getValoare()).sum();
		System.out.println("Suma totala este: " + sumaTotala);
		Integer rezultat1 = lista.stream().max(Comparator.comparing(Comanda::getValoare)).get().getId();
		System.out.println("Id-ul comenzii cu cea mai mare valoare este: " + rezultat1);
		Integer rezultat2 = lista.stream().min(Comparator.comparing(Comanda::getPret)).get().getId();
		System.out.println("Id-ul comenzii cu cel mai mic pret este: " + rezultat2);
	}
	
	
	
}
