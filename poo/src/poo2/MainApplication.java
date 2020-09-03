package poo2;

public class MainApplication {

	public static void main(String[] args) {
		InstrumentFinanciar instrument1 = new DepozitulBancar();
		instrument1.actiune();
		InstrumentFinanciar instrument2 = new Obligatiuni();
		instrument2.actiune();
		InstrumentFinanciar instrument3 = new Actiuni();
		instrument3.actiune();
	}

}
