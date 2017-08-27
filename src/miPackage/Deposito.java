package miPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class Deposito {
	private LinkedList<Mesada> listaMesa;
	
	
	public Deposito(String path) throws FileNotFoundException{
		this.listaMesa = new LinkedList<Mesada>();
		Scanner sc = new Scanner(new File(path));
		sc.useLocale(Locale.ENGLISH);
		int cant = sc.nextInt();
		
		for (int i = 0; i < cant; i++) {
			listaMesa.add(new Mesada(sc.nextDouble(), sc.nextDouble()));
		}
			
		
		
		sc.close();
	}
	
	public void Mostrar(){
		for (Mesada mesada : listaMesa) {
			System.out.println(mesada);
		}
	}
	
	public void Ordenar(){
		Collections.sort(this.listaMesa);
	}
	
	public int Apilar(){
		int cantidadPilas = 0;
		Mesada base = this.listaMesa.removeFirst();
		
		while(this.listaMesa.size() > 1){
			for (Mesada mesada : listaMesa) {
				
			}
		}
		
		return cantidadPilas;
	}
}
