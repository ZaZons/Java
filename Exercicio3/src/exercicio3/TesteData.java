package exercicio3;

public class TesteData {
	public static void main(String[] args) {
		Data data1 = new Data(1, 1, 2000);

		data1.setDia(19);
		data1.setMes(12);
		data1.setAno(2019);

		System.out.println(data1);

		System.out.println("Dia: " + String.format("%02d", data1.getDia()));
		System.out.println("Mes: " + String.format("%02d", data1.getMes()));
		System.out.println("Ano: " + String.format("%02d", data1.getAno()));

		data1.setData(25, 4, 1974);
		System.out.println(data1);
	}
}
