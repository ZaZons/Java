package projeto;

import java.awt.Font;

import java.awt.FlowLayout;

import javax.swing.JButton;

import javax.swing.JRadioButton;

import javax.swing.ButtonGroup;

import javax.swing.JTextField;

import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;

public class JFrameAlunos extends JFrame implements ActionListener {

  JLabel cabecalho;
  JLabel labelNumAluno;
  JTextField textNumAluno;
  JLabel labelNomeAluno;
  JTextField textNomeAluno;
  JLabel labelApelidoAluno;
  JTextField textApelidoAluno;
  JLabel labelnumCC;
  JTextField textnumCC;
  JLabel labelMatriculado;
  ButtonGroup matriculado;
  JRadioButton matriculadoSim;
  JRadioButton matriculadoNao;
  JLabel labelAno;
  ButtonGroup ano;
  JRadioButton ano10;
  JRadioButton ano11;
  JRadioButton ano12;
  JLabel labelTurma;
  ButtonGroup turma;
  JRadioButton turmaA;
  JRadioButton turmaB;
  JRadioButton turmaC;
  JButton botaoGravar;
  JButton botaoAnterior;
  JButton botaoSeguinte;
  JButton botaoGuardarNoFicheiro;
  int numElementos;
  int indice = -1;
  Aluno alunoAtual;
  ArrayList<Aluno> listaAlunos;
  final int LARGURA = 650;
  final int ALTURA = 200;

  public JFrameAlunos(ArrayList<Aluno> alunos) {
    super("Alunos");
    setSize(LARGURA, ALTURA);
    
    cabecalho = new JLabel("ALUNOS");
    Font fontCabecalho = new Font("Arial", Font.BOLD, 16);
    cabecalho.setFont(fontCabecalho);

    labelNumAluno = new JLabel("Numero:");
    textNumAluno = new JTextField(4);

    labelNomeAluno = new JLabel("Nome:");
    textNomeAluno = new JTextField(15);

    labelApelidoAluno = new JLabel("Apelido:");
    textApelidoAluno = new JTextField(15);

    labelnumCC = new JLabel("N.o CC:");
    textnumCC = new JTextField(7);

    labelMatriculado = new JLabel("Matriculado:");
    matriculado = new ButtonGroup();
    matriculadoSim = new JRadioButton("Sim", false);
    matriculadoNao = new JRadioButton("Nao", false);
    matriculado.add(matriculadoSim);
    matriculado.add(matriculadoNao);

    labelAno = new JLabel("Ano:");

    ano = new ButtonGroup();
    ano10 = new JRadioButton("10", false);
    ano11 = new JRadioButton("11", false);
    ano12 = new JRadioButton("12", false);
    ano.add(ano10);
    ano.add(ano11);
    ano.add(ano12);

    labelTurma = new JLabel("Turma:");

    turma = new ButtonGroup();
    turmaA = new JRadioButton("A", false);
    turmaB = new JRadioButton("B", false);
    turmaC = new JRadioButton("C", false);
    turma.add(turmaA);
    turma.add(turmaB);
    turma.add(turmaC);

    botaoGravar = new JButton("Gravar");
    botaoAnterior = new JButton("Anterior");
    botaoSeguinte = new JButton("Seguinte");
    botaoGuardarNoFicheiro = new JButton("Gravar ficheiro ");
    botaoGravar.addActionListener(this);
    botaoAnterior.addActionListener(this);
    botaoSeguinte.addActionListener(this);
    botaoGuardarNoFicheiro.addActionListener(this);

    FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
    setLayout(flow);

    listaAlunos = alunos;
    numElementos = listaAlunos.size();
    
    if (numElementos > 0) {
      indice = 0;
      alunoAtual = listaAlunos.get(indice);
      preencherCampos(alunoAtual);
    }

    add(cabecalho);
    add(labelNumAluno);
    add(textNumAluno);
    add(labelNomeAluno);
    add(textNomeAluno);
    add(labelApelidoAluno);
    add(textApelidoAluno);
    add(labelnumCC);
    add(textnumCC);
    add(labelMatriculado);
    add(matriculadoSim);
    add(matriculadoNao);
    add(labelAno);
    add(ano10);
    add(ano11);
    add(ano12);
    add(labelTurma);
    add(turmaA);
    add(turmaB);
    add(turmaC);
    add(botaoGravar);
    add(botaoAnterior);
    add(botaoSeguinte);
    add(botaoGuardarNoFicheiro);
  }
  
  private void gravarCampos(Aluno aluno) {
    aluno.setNome(textNomeAluno.getText());
    aluno.setApelido(textApelidoAluno.getText());
    aluno.setNumCC(Long.parseLong(textnumCC.getText()));

    int numeroAluno = Integer.parseInt(textNumAluno.getText());
    aluno.setNumAluno(numeroAluno);

    if (matriculadoSim.isSelected()) {
      int anoMatricula = 0;
      String turmaMatricula = null;

      if (ano10.isSelected()) {
        anoMatricula = 10;
      } else if (ano11.isSelected()) {
        anoMatricula = 11;
      } else if (ano12.isSelected()) {
        anoMatricula = 12;
      } else {
        anoMatricula = 0;
      }

      if (turmaA.isSelected()) {
        turmaMatricula = "A";
      } else if (turmaB.isSelected()) {
        turmaMatricula = "B";
      } else if (turmaC.isSelected()) {
        turmaMatricula = "C";
      } else {
        turmaMatricula = null;
      }

      if (turmaMatricula != null & anoMatricula != 0) {
        aluno.matricularAluno(anoMatricula, turmaMatricula, numeroAluno);
      }
    }
  }

  private void preencherCampos(Aluno aluno) {
    textNumAluno.setText(Integer.toString(aluno.getNumAluno()));
    textnumCC.setText(Long.toString(aluno.getNumCC()));
    textNomeAluno.setText(aluno.getNome());
    textApelidoAluno.setText(aluno.getApelido());

    if (!aluno.isMatriculado()) {
      matriculadoNao.setSelected(true);
    } else {
      matriculadoSim.setSelected(true);
      if (aluno.getAno() == 10) {
        ano10.setSelected(true);
      } else if (aluno.getAno() == 11) {
        ano11.setSelected(true);
      } else if (aluno.getAno() == 12) {
        ano12.setSelected(true);
      }

      if (aluno.getTurma().equals("A")) {
        turmaA.setSelected(true);
      } else if (aluno.getTurma().equals("B")) {
        turmaB.setSelected(true);
      } else if (aluno.getTurma().equals("C")) {
        turmaC.setSelected(true);
      }
    }
  }
  
	@Override
	public void actionPerformed(ActionEvent e) {
    Object origem = e.getSource();
    if (origem == botaoGravar) {
      if (indice != -1) {
        gravarCampos(alunoAtual);
      }
    } else if (origem == botaoAnterior) {
      if (indice > 0) {
        indice--;
        alunoAtual = listaAlunos.get(indice);
        preencherCampos(alunoAtual);
      }
    } else if (origem == botaoSeguinte) {
      if (indice < numElementos - 1) {
        indice++;
        alunoAtual = listaAlunos.get(indice);
        preencherCampos(alunoAtual);
      }
    } else if (origem == botaoGuardarNoFicheiro) {
      Aluno.escreverFicheiroAlunos(listaAlunos);
    }
	}
}