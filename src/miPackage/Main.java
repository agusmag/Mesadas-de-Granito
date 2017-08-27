package miPackage;

import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Deposito depo = new Deposito("./IN/LoteBase.txt");
		
		depo.Mostrar();
		depo.Ordenar();
		System.out.println("---------------------------");
		depo.Mostrar();
		
	}

}
