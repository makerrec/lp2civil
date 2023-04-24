package pacote;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
		List<PlanoDeVoo> a = new ArrayList<PlanoDeVoo>();
		
		Comercial cl = new Comercial(1000000,"SP", "Sumiu", 130);
		Carga cr = new Carga(1011001,"Hong Kong", "Brasilha",1);
		
		
		a.add(cl);
		a.add(cr);
		
		for(Avião av : a) {
			System.out.println(av.toString() );
		}
		
		IAlteracaoDeVoo ia = new AlteracaoDeVoo("Guarulhos","Dinamarca");
		
		ia.setOrigemRedefinido("Guarulhos");
		ia.setDestinoRedefinido("Dinamarca");
		
		System.out.println("\nDestino a "+ia.getDestinoRedefinido()+ ".Retornara a "+ ia.getOrigemRedefinido()+".");
		
		
		
		
	}//code
}//meu
