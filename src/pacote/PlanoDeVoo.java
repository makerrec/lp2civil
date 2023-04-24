package pacote;

public abstract class PlanoDeVoo extends Avião{
	private String origem;
	private String destino;
	
	public PlanoDeVoo( double capTaq ,String origem, String destino) {
		super();
		this.origem = origem;
		this.destino = destino;
		
		this.setCapTaq(capTaq);
	}
	
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	@Override
	public String toString() {
		return String.format("-Plano de Voo:\nCapacidade do Tanque: %s\nOrigem:%s\n-Destino:%s\n", this.getCapTaq(),this.getOrigem(), this.getDestino());
	}

}