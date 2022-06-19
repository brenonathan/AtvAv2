public class Fornecedor extends Pessoa{
	private float valorCredito;
	private float valorDivida;
	
	public Fornecedor(String nome, String endereco, String telefone, float valorCredito, float valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public float getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}
	public float obterSaldo() {
		return valorCredito - valorDivida;
	}
	
	public void exibirFornecedor() {
		super.exibirPessoa();
		System.out.println("Valor do Crédito: " +valorCredito);
		System.out.println("Valor da Dívida: " +valorDivida);
	}
	

}