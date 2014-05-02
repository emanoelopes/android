public class Funcionario{
	private int codigoFuncional;
	private String nome;
	private String cargo;
	private float salario;
	
	public Funcionario(){
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getCodigoFuncional() {
		return codigoFuncional;
	}

	public void setCodigoFuncional(int codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public String toString(){
		return "Codigo Funcional: " + getCodigoFuncional() + "\n" 
			+  "Nome: " + getNome() + "\n" 
			+  "Cargo: " + getCargo() + "\n" 
			+  "Salário: " + getSalario() + "\n"; 
	}
}