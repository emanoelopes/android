package br.ex1;

public class ClasseA {
	public int aA;
	protected int bA;
	int cA;
	private int dA;
	
	public ClasseA() {
		ClasseC c = new ClasseC();
		cA = c.cC;
	}
}
