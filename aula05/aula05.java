package aula05;

public class aula05 {
    
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(300);
        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);
        p2.estadoAtual();

        ContaBanco p3 = new ContaBanco();
        p3.setNumConta(3333);
        p3.setDono("TTVO");
        p3.abrirConta("CC");
        p3.depositar(1000);
        p3.sacar(-120);
        p3.estadoAtual();
    }   
}
