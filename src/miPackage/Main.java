package miPackage;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		Deposito depo = new Deposito("./IN/Lote2.txt");

		depo.Ordenar();
		depo.Mostrar();
		depo.Resolver("./OUT/Lote2.txt");

		
		//System.out.println("La cantidad de pilas son:" + depo.Apilar());
	}

}
