
public class TestaAlgunsMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Criando a conta
		Conta minhaConta;
		minhaConta = new Conta();
		
		//alterando os valores de minhaConta
		minhaConta.dono = "Joao";
		minhaConta.saldo = 1000;
		
		//saca 200 reais
		minhaConta.saca(200);
		
		//deposita 500 reais
		minhaConta.deposita(500);
		System.out.println(minhaConta.saldo);
	}

}
