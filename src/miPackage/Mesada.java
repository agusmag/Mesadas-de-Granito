package miPackage;

public class Mesada implements Comparable<Mesada> {
	private double largo;
	private double ancho;
	
	
	public Mesada (final double largo, final double ancho){
		this.largo = largo;
		this.ancho = ancho;
	}


	public boolean EntraEn(Mesada that){
		if (this.largo > that.largo || this.ancho > that.ancho){
			if (this.ancho > that.largo || this.largo > that.ancho)
				return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Mesada that) {
		
		if (this.largo < that.largo)
			return 1;
		//SI SON IGUALES PREGUNTO POR EL ANCHO
		if (this.largo == that.largo){
			//ORDENA POR ORDEN DE LECTURA SI SON IGUALES.
			if(this.ancho <= that.ancho)
				return 1;
		}
	
		return -1;
	}

	@Override
	public String toString() {
		return "Mesada [largo=" + largo + ", ancho=" + ancho + "]";
	}
	
	
	
	
}
