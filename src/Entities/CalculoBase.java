package Entities;

public class CalculoBase extends Cadastro{

	private int horasBase;
	private Double salarioBase;
	
	public CalculoBase() {
	}

	public CalculoBase(String nomeEmpregado, String matricula, int horasBase, Double salarioBase) {
		super(nomeEmpregado, matricula);
		this.horasBase = horasBase;
		this.salarioBase = salarioBase;
	}

	public int getHorasBase() {
		return horasBase;
	}

	public void setHorasBase(int horasBase) {
		this.horasBase = horasBase;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Double calcularSalarioHora() {
		return salarioBase / horasBase;
	}
	
	public Double calcularHoraExtra50() {
		return calcularSalarioHora() * 1.5;
	}
	
	public Double calcularHoraExtra100() {
		return calcularSalarioHora() * 2;
	}
	
	public Double calcularHoraNoturna() {
		return calcularSalarioHora() * 1.2;
	}
	
	public Double calcularHoraExtra50Noturna() {
		return calcularHoraNoturna() * 1.5;
	}
	
	public Double calcularHoraExtra100Noturna() {
		return calcularHoraNoturna() * 2;
	}

}
