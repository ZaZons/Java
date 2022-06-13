package teste01;

import java.time.LocalDate;

public class Professor extends Pessoa {
	int numHorasLetivasSemanais = 22;
	int escalao;
	double salarioBruto;
	boolean aposentado = false;
	static final double taxaSegurancaSocial = .11;

	public Professor(String nome, String apelido, long numCC, LocalDate dataNascimento, int escalao, double salarioBruto) {
		super(nome, apelido, numCC, dataNascimento);
		this.escalao = escalao;
		this.salarioBruto = salarioBruto;
	}

	private double calcularSalarioLiquido(double taxaIrs, double taxaSegurancaSocial) {
		double salarioLiquido = salarioBruto;
		salarioLiquido -= salarioBruto * taxaIrs;
		salarioLiquido -= salarioBruto * taxaSegurancaSocial;

		return salarioLiquido;
	}

	@Override
	public String toString() {
		String res = "";
		res += "Nome do professor: " + nome + " " + apelido;
		if(!aposentado) {
			res += "\n\tN. horas letivas semanais: " + numHorasLetivasSemanais;
			res += "\n\tPosicionado no " + escalao + "o escalao";
			res += "\n\tSalario bruto: " + salarioBruto;
			res += "\n\ttSalario liquido: " + getSalarioLiquido();
		} else {
			res += "\n\t(este professor encontra-se aposentado)";
		}

		return res;
	}

	public double getSalarioLiquido() {
		if (salarioBruto <= 0) {
			System.out.println("Nao e possivel calcular o salario liquido, pois o salario bruto definido e invalido");
			;
			return 0.0;
		} else {
			double taxaIrs;

			if (salarioBruto <= 686) {
				taxaIrs = 0;
			} else if (salarioBruto <= 718) {
				taxaIrs = .04;
			} else if (salarioBruto <= 739) {
				taxaIrs = .072;
			} else if (salarioBruto <= 814) {
				taxaIrs = .08;
			} else if (salarioBruto <= 922) {
				taxaIrs = .102;
			} else if (salarioBruto <= 1005) {
				taxaIrs = .114;
			} else if (salarioBruto <= 1065) {
				taxaIrs = .121;
			} else if (salarioBruto <= 1143) {
				taxaIrs = .132;
			} else if (salarioBruto <= 1225) {
				taxaIrs = .142;
			} else if (salarioBruto <= 1321) {
				taxaIrs = .153;
			} else if (salarioBruto <= 1421) {
				taxaIrs = .163;
			} else if (salarioBruto <= 1562) {
				taxaIrs = .172;
			} else if (salarioBruto <= 1711) {
				taxaIrs = .187;
			} else if (salarioBruto <= 1870) {
				taxaIrs = .201;
			} else if (salarioBruto <= 1977) {
				taxaIrs = .211;
			} else if (salarioBruto <= 2090) {
				taxaIrs = .221;
			} else if (salarioBruto <= 2218) {
				taxaIrs = .23;
			} else if (salarioBruto <= 2367) {
				taxaIrs = .24;
			} else if (salarioBruto <= 2535) {
				taxaIrs = .25;
			} else if (salarioBruto <= 2767) {
				taxaIrs = .26;
			} else {
				taxaIrs = .272;
			}

			double salarioLiquido = calcularSalarioLiquido(taxaIrs, taxaSegurancaSocial);
			salarioLiquido = Math.round(salarioLiquido * 100.0) / 100.0;

			return salarioLiquido;
		}
	}

	public int getNumHorasLetivasSemanais() {
		return this.numHorasLetivasSemanais;
	}

	public void setNumHorasLetivasSemanais(int numHorasLetivasSemanais) {
		this.numHorasLetivasSemanais = numHorasLetivasSemanais;
	}

	public int getEscalao() {
		return this.escalao;
	}

	public void setEscalao(int escalao) {
		this.escalao = escalao;
	}

	public double getSalarioBruto() {
		return this.salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public boolean getAposentado() {
		return this.aposentado;
	}

	public void setAposentado(boolean aposentado) {
		this.aposentado = aposentado;
	}

}
