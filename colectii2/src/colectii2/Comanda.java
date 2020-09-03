package colectii2;

public class Comanda {
	
	private int id;
	private double pret;
	private int cantitate;
	
	public Comanda(int id, double pret, int cantitate) {
		this.id = id;
		this.pret = pret;
		this.cantitate = cantitate;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getPret() {
		return pret;
	}
	
	public void setPret(double pret) {
		this.pret = pret;
	}
	
	public int getCantitate() {
		return cantitate;
	}
	
	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}
	
	public double getValoare() {
		return pret * cantitate;
	}
	
}
