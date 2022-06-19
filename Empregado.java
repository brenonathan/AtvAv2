public class Empregado extends Pessoa {
	private int codSetor;
	private float salario;
	
	public Empregado(String nome, String endereco, String telefone, int codSetor, float salario) {
		super(nome, endereco, telefone);
		this.codSetor = codSetor;
		this.salario = salario;
	}

	public int getCodSetor() {
		return codSetor;
	}

	public void setCodSetor(int codSetor) {
		this.codSetor = codSetor;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void exibirEmpregado() {
		super.exibirPessoa();
		System.out.println("Código do Setor: " +codSetor);
		System.out.println("Salário: " +salario);
	}
	
	

}