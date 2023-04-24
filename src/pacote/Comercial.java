package pacote;

public class Comercial extends PlanoDeVoo {
	private int passagem;
	
	public Comercial(double capTaq, String destino,String origem,int passagem  ) {
		super(capTaq, destino, origem);
		this.passagem = passagem;
	}

	@Override
	public String toString() {
		return String.format("\n---Avião Comercial---\n-Quantidade de Passageiro:%d\n-Capacidade do Tanque:%s\n-Origem:%s\n-Destino:%s",this.getPassagem(),this.getCapTaq(),this.getOrigem(), this.getDestino());
		}

	public int getPassagem() {
		return passagem;
	}

	public void setPassagem(int passagem) {
		this.passagem = passagem;
	}
	
	
	
}
