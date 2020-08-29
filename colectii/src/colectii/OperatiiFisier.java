package colectii;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class OperatiiFisier {
	
		public void operatiiFisier() throws FileNotFoundException {
			
			HashMap<String, Integer> mapa = new HashMap<String, Integer>();
			
			
			File fisier = new File("C:\\Users\\Florin\\eclipse-workspace\\colectii\\bin\\colectii\\cuvinte");
			if(!fisier.canRead()) {
				fisier.setReadable(true);
			}
			Integer numarulDeCuvinte = 0;
			Scanner scanner = new Scanner(fisier);
			while (scanner.hasNextLine()) {
				String line = scanner.next();
				
				if (!mapa.containsKey(line)) { 
						mapa.put(line, 1);
					}
					else {
						 int n = mapa.get(line);    
						 mapa.put(line, ++n);
					}
				numarulDeCuvinte++;
			}
			
			System.out.println("Numarul de cuvinte este: " + numarulDeCuvinte);
			
			mapa.forEach((key, value) -> {
				System.out.println("Cuvantul : " + key + "|" +"Frecventa : " + value);
				});
			
			Set<String> multimea = mapa.keySet();
			System.out.println("Cuvintele distincte din fisier sunt: " + multimea.toString());
			
			
			System.out.println("Cuvintele care incep cu litera m sunt : "); 
			mapa.forEach((key, value) -> {
				if (key.startsWith("m")) {
				System.out.println(key);
				}
				});
			
		}
		
}
