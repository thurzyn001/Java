package aula011.Classes;

public class Aula011 {

	public static void main(String[] args) {

		Pessoa[] pessoas = new Pessoa[5];

		pessoas[0] = new Visitante("Estevo", 22, "M"); 

		pessoas[1] = new Aluno("Maria", 20, "F", 1111, "Informática");

		pessoas[2] = new Professor("Cláudio", 40, "M", "Matemática", 10000);

		pessoas[3] = new Tecnico("Fabiana", 26, "F", 2222, "Administração", "12345");
	
		pessoas[4] = new Bolsista("Carlos", 21, "M", 3333, "Arquitetura", 500);


		for (Pessoa p : pessoas) {
			
			if (p instanceof Bolsista) {
				Bolsista b = (Bolsista) p;
				System.out.println(b.toString());
				b.renovarBolsa();
				b.pagarMensalidade(); 
				
			} else if (p instanceof Tecnico) {
				Tecnico t = (Tecnico) p;
				System.out.println(t.toString());
				t.praticar();

			} else if (p instanceof Aluno) {
				Aluno a = (Aluno) p;
				System.out.println(a.toString());
				a.pagarMensalidade();
			
			} else if (p instanceof Professor) {
				Professor prof = (Professor) p;
				System.out.println(prof.toString());
				prof.receberAumento(500);
			
			} else {
				System.out.println(p.toString());
				
			}

			p.fazerAniversario();
		}

	}

}
