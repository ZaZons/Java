package projeto;

import java.util.ArrayList;

public class Programa {
  public static ArrayList<Aluno> alunos;
	public static void main(String[] args) {
    alunos = Aluno.lerFicheiroAlunos();
		JFrameAlunos frame = new JFrameAlunos(alunos);
		frame.setVisible(true);
	}
}
