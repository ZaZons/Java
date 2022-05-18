package introObjetos.intro;

public class Empregado {
	public static int numEmpregados;
	private int empNum;
	private String empPrimeiroNome;
	private String empUltimoNome;
	private double empSalario;

	public int getEmpNum() {
		return empNum;
	}

	public String getEmpPrimeiroNome() {
		return empPrimeiroNome;
	}

	public String getEmpUltimoNome() {
		return empUltimoNome;
	}

	public double getEmpSalario() {
		return empSalario;
	}

	public void setEmpNum(int n) {
		empNum = n;
	}

	public void setEmpPrimeiroNome(String nome) {
		empPrimeiroNome = nome;
	}
	
	public void setEmpUltimoNome(String nome) {
		empUltimoNome = nome;
	}

	public void setEmpSalario(double salario) {
		empSalario = salario;
	}
}
