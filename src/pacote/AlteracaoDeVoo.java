package pacote;

import pacote.IAlteracaoDeVoo;

public class AlteracaoDeVoo implements IAlteracaoDeVoo {
	private String origemRedefinido;
	private String destinoRedefinido;

	public AlteracaoDeVoo(String origemRedefinido, String destinoRedefinido ){
		super();
		this.origemRedefinido = origemRedefinido;
		this.destinoRedefinido= destinoRedefinido;		
	}

	@Override
	public void setOrigemRedefinido(String o) {
		this.origemRedefinido = o;		
	}

	@Override
	public void setDestinoRedefinido(String d) {
		this.destinoRedefinido = d;
		
	}

	@Override
	public String getOrigemRedefinido() {
		return this.origemRedefinido;
	}

	@Override
	public String getDestinoRedefinido() {
		return this.destinoRedefinido;
	}

	@Override
	public String origemRedefinido() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String destinoRedefinido() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
