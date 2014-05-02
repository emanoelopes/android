public class TestaHeranca{

	public static void main(String[] args){
		Funcionario func = new Funcionario();
		func.setCodigoFuncional(1);
		func.setNome("José");
		func.setCargo("Assist. Adm");
		func.setSalario(8000.0f);

		exibirDados(func);

		Professor prof = new Professor();
		prof.setCargaHoraria(2);
		prof.setNome("Pedro");
		prof.setCargo("Prof. Assistente");
		prof.setSalario(8500.0f);
		prof.setCargaHoraria(12);

		exibirDados(prof);
	}

	private static void exibirDados(Funcionario f){
		if (f instanceof Funcionario){
			System.out.println(f.toString());
		} else if (f instanceof Professor){
			Professor p = (Professor) f;
			System.out.println(p.toString());
		}
	}
}
