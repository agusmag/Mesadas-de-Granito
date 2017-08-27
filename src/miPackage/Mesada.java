package miPackage;

public class Mesada {
	private double largo;
	private double ancho;
	
	
	public Mesada(final double largo, final double ancho){
		this.largo = largo;
		this.ancho = ancho;
	}
	
	public String getMedidas(){
		String medida = this.largo + "x" + this.ancho;
		return medida;
	}
	
}
