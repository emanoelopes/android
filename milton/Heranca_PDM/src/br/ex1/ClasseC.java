package br.ex1;

public class ClasseC {
	public int aC;
	protected int bC;
	int cC;
	private int dC;
	
	public ClasseC() {
		ClasseA a = new ClasseA();
		aC = a.aA;
		bC = a.bA;
		cC = a.cA;
		dC = a.dA;
		
	}

}
