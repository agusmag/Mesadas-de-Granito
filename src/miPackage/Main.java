package miPackage;

import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Deposito depo = new Deposito("./IN/Lote3.txt");
		
		depo.Ordenar();
		depo.Mostrar();
		
		System.out.println("La cantidad de pilas son:" + depo.Apilar());
	}

}
