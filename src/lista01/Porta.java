package lista01;

public class Porta {
	boolean isOpen;
	static int numAberturas;
	
	void abrir() {
		if (isOpen == false) {
			isOpen = true;
			numAberturas++;
			System.out.println("A porta está aberta!");
		}
		else {
			System.out.println("A porta já está aberta!");
		}
	}
	
	void fechar() {
		if (isOpen) {
			isOpen = false;
			System.out.println("A porta está fechada!");
		}
		else {
			System.out.println("A porta já está fechada!");
		}
	}
	
	void status() {
		System.out.println("A quantidade de vezes que as portas foram abertas é igual a: " + numAberturas);
	}
}
