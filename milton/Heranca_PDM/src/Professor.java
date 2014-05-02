public class Professor extends Funcionario{
	private int cargaHoraria;
	
	public Professor(){
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public String toString(){
		return super.toString() 
			 + "Carga Horaria: " + getCargaHoraria() + "\n";
	}
}