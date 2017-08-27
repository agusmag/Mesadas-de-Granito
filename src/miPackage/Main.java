package miPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		String miPath = "IN/LoteBase.txt";
		Scanner sc = new Scanner(new File(miPath));
		sc.useLocale(Locale.ENGLISH);
		Mesada [] vec = new Mesada[sc.nextInt()];
		
		for (int i = 0; i < vec.length; i++) {
			vec[i] = new Mesada(sc.nextDouble(), sc.nextDouble());
			System.out.println(vec[i].getMedidas());
		}
		
		sc.close();
	}

}
