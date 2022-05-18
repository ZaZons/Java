package introObjetos.intro;

public class EmpregadosExemplo {
	public static void main(String[] args) {
		Empregado emp1 = new Empregado();
		Empregado emp2 = new Empregado();

		emp1.setEmpNum(0);
		emp1.setEmpPrimeiroNome("Pedro");
		emp1.setEmpUltimoNome("Crispim");
		emp1.setEmpSalario(4500.0);

		emp2.setEmpNum(1);
		emp2.setEmpPrimeiroNome("Joao");
		emp2.setEmpUltimoNome("Silva");
		emp2.setEmpSalario(1213.25);

		System.out.println("O empregado com o numero " + emp1.getEmpNum() + " chama-se " + 
			emp1.getEmpPrimeiroNome() + " " + emp1.getEmpUltimoNome() + " e tem um salario bruto de " +
			emp1.getEmpSalario());

		System.out.println("O empregado com o numero " + emp2.getEmpNum() + " chama-se " +
				emp2.getEmpPrimeiroNome() + " " + emp2.getEmpUltimoNome() + " e tem um salario bruto de " +
				emp2.getEmpSalario());
	}
}
