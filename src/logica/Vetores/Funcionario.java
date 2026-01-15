package logica.Vetores;

public class Funcionario {
	
	private String nome;
	private int id;
	private double salario;
	private double porcentagem;
	
	public Funcionario() {
		super();
	}

	public Funcionario(int id, String nome, double salario) {
		super();
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	}
	
	public Funcionario(double porcentagem) {
		this.porcentagem = porcentagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}

	public void ajusteSalario(double porcentagem) {
		salario += salario * porcentagem / 100.0;
	}
	
	@Override
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
	
}
