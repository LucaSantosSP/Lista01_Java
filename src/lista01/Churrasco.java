package lista01;

public class Churrasco {
	double qtdCarne;
	
	void verificarConsumo(Pessoa pessoa) {
		if (pessoa.vegetariana || pessoa.idade < 3) {
			System.out.println(pessoa.nome + " não consome carne.");
		}
		else if (pessoa.idade > 3 && pessoa.idade < 12) {
			System.out.println(pessoa.nome + " consome 1 kilo de carne.");
			qtdCarne++;
		}
		else {
			System.out.println(pessoa.nome + " consome 2 kilos de carne.");
			qtdCarne += 2;
		}
	}
	
	void carneNecessaria() {
		System.out.println();
		System.out.println("É necessário " + qtdCarne + " kilos de carne!");
	}
}
