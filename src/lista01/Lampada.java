package lista01;

public class Lampada {
	boolean estado;
	int clickMax;
	boolean quebrado;
	int qtdClick = 0;
	
	void status() {
		if (estado) {
			System.out.println("A l�mpada est� ligada!");
		}
		else {
			System.out.println("A l�mpada est� desligada!");
		}
	}
	
	void defeito() {
		if (qtdClick < this.clickMax) {
			qtdClick++;
		}
		else {
			estado = false;
			quebrado = true;
		}
	}
	
	void clickInterruptor() {
		if (quebrado == false) {
			if (estado) {
				estado = false;
				status();
			}
			else {
				estado = true;
				status();
			}
		}
		else {
			System.out.println("A l�mpada est� estragada!");
		}
		defeito();
	}
}
