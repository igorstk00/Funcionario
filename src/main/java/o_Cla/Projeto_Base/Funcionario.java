package o_Cla.Projeto_Base;

/**
 * Hello world!
 *
 */
public class Funcionario {
	private int matricula;
	private String nome;
	private double salarioBase;
	private int nroDependentes;
	private boolean insalubridade;
	
	public Funcionario() {}
	
	public Funcionario(int matricula, String nome, double salarioBase, 
            			int nroDependentes, boolean insalubridade) {
		this.matricula = matricula;
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.nroDependentes = nroDependentes;
		this.insalubridade = insalubridade;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public int getNroDependentes() {
		return nroDependentes;
	}
	
	public boolean getInsalubridade() {
		return insalubridade;
	}
	
	public double getSalarioBruto() {
		double salarioBruto = salarioBase;
		if(insalubridade) {
			salarioBruto += (salarioBase*0.1);
		}
		if(getNroDependentes() > 0) {
			for(int i = 0; i < getNroDependentes(); i++) {
				salarioBruto += (salarioBase*0.01);
			}
		}
		return salarioBruto;
	}
	
	public double getSalarioLiquido() {
		double salarioLiquido = getSalarioBruto();
		// inss
		if(getSalarioBase() <= 5000.0) {
			salarioLiquido -= (getSalarioBase()*0.045);
		}
		if(getSalarioBase() > 5000.0) {
			salarioLiquido -= (5000*0.045);
		}
		// imposto de renda
		if(getSalarioBase() > 2000.0 && getSalarioBase() <= 5000.0) {
			salarioLiquido -= (getSalarioBase()*0.12);
		}
		if(getSalarioBase() > 5000.0) {
			salarioLiquido -= (getSalarioBase()*0.275);
		}
		return salarioLiquido;
	}
}