package exercicio3;

public class Droide {
	String nome;
	int nivelBateria;
	public static void main(String[] args) {
		Droide droide = new Droide("Number5");

		System.out.println(droide.toString());

		droide.executarTarefa("jogar");
		droide.executarTarefa("dancar");

		droide.relatorioEnergia();

		Droide droide1 = new Droide("Number6");

		droide1.transferenciaEnergia(10, droide);
	}

	public Droide(String nomeDroide) {
		nome = nomeDroide;
		nivelBateria = 100;
	}

	public String toString() {
		return "Ola, eu sou o droide " + nome;
	}

	public void executarTarefa(String tarefa) {
		System.out.println(nome + " esta a executar a tarefa: " + tarefa);
		nivelBateria -= 10;
	}

	public void relatorioEnergia() { 
		System.out.println("Nivel da bateria de " + nome + ": "
			+ nivelBateria + "%");
	}

	public void transferenciaEnergia(int troca, Droide d1) {
		System.out.println("Transferencia de " + troca + "% de energia de " +
			nome + " para " + d1.nome);
		nivelBateria -= troca;
		d1.nivelBateria += troca;
		relatorioEnergia();
		d1.relatorioEnergia();
	}
}
