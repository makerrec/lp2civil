package pacote;

public class Carga extends PlanoDeVoo {
	private double peso;

	
	public Carga(double capTaq, String destino,String origem, double peso) {
		super(capTaq, destino, origem);
		this.peso = peso;
	}

	@Override
	public String toString() {
		return String.format("\n---Avião Cargagueiro---\n-Quantidade da Carga:%f\n-Capacidade do Tanque:%s\n-Origem:%s\n-Destino:%s", this.getPeso(),this.getCapTaq(),this.getOrigem(), this.getDestino());
		}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
}
