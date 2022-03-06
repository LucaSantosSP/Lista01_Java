package lista01;

public class Teste {
	public static void main(String[] args) {
		
		//Exercício 1 -  Definir a consumação média de carne:
		Churrasco c1 = new Churrasco();
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Pedro";
		p1.sexo = "Masculino";
		p1.idade = 11;
		p1.vegetariana = false;
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Carla";
		p2.sexo = "Feminino";
		p2.idade = 21;
		p2.vegetariana = true;
		
		Pessoa p3 = new Pessoa();
		p3.nome = "Matheus";
		p3.sexo = "Masculino";
		p3.idade = 17;
		p3.vegetariana = false;
		
		c1.verificarConsumo(p1);
		c1.verificarConsumo(p2);
		c1.verificarConsumo(p3);
		c1.carneNecessaria();
		
		//Exercício 2 -  Checar estado da lâmpada:
		System.out.println();
		System.out.println("------------------------------------");
		
		Lampada l1 = new Lampada();
		l1.estado = true;
		l1.clickMax = 4;
		
		l1.status();
		l1.clickInterruptor();
		l1.clickInterruptor();
		l1.clickInterruptor();
		l1.clickInterruptor();
		l1.clickInterruptor();
		l1.clickInterruptor();
		l1.clickInterruptor();
		
		//Exercício 3 -  Contar abertura de todas as portas:
		System.out.println();
		System.out.println("------------------------------------");
		
		Porta porta1 = new Porta();
		Porta porta2 = new Porta();
		porta1.status();
		porta1.abrir();
		porta1.abrir();
		porta2.abrir();
		porta1.status();
		porta2.status();
		porta2.fechar();
		porta1.fechar();
		porta2.abrir();
		porta1.status();
	}
}
