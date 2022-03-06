package lista01;

public class Porta {
	boolean isOpen;
	static int numAberturas;
	
	void abrir() {
		if (isOpen == false) {
			isOpen = true;
			numAberturas++;
			System.out.println("A porta est� aberta!");
		}
		else {
			System.out.println("A porta j� est� aberta!");
		}
	}
	
	void fechar() {
		if (isOpen) {
			isOpen = false;
			System.out.println("A porta est� fechada!");
		}
		else {
			System.out.println("A porta j� est� fechada!");
		}
	}
	
	void status() {
		System.out.println("A quantidade de vezes que as portas foram abertas � igual a: " + numAberturas);
	}
}
