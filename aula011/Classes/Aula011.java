package aula011.Classes;

public class Aula011 {

	public static void main(String[] args) {

		Pessoa[] pessoas = new Pessoa[5];

		pessoas[0] = new Visitante("Estevo", 22, "M");
		System.out.println(pessoas[0].toString());

		pessoas[1] = new Aluno("Maria", 20, "F", 1111, "Informática");
		System.out.println(pessoas[1].toString());

		pessoas[2] = new Professor("Cláudio", 40, "M", "Matemática", 10000);
		System.out.println(pessoas[2].toString());

		pessoas[3] = new Tecnico("Fabiana", 26, "F", 2222, "Administração", "12345");
		System.out.println(pessoas[3].toString());

		pessoas[4] = new Bolsista("Carlos", 21, "M", 3333, "Arquitetura", 500);
		System.out.println(pessoas[4].toString());

		pessoas[1].fazerAniversario();
		((Aluno) pessoas[1]).pagarMensalidade();

		((Bolsista) pessoas[4]).renovarBolsa();
		((Bolsista) pessoas[4]).pagarMensalidade();

		((Tecnico) pessoas[3]).praticar();

		((Professor) pessoas[2]).receberAumento(500);
	}

}
