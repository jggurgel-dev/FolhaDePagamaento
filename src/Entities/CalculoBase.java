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

	public Double SalarioHora(Double salarioBase, int horasBase) {
		Double SalarioHora = salarioBase / horasBase;
		return SalarioHora;
	}

	public Double HoraExtra50VlrHora(Double SalarioHora) {
		Double Horaextra50 = SalarioHora + (SalarioHora / 2);
		return Horaextra50;
	}

	public Double HoraExtra100VlrHora(Double SalarioHora) {
		Double HoraExtra100 = SalarioHora * 2;
		return HoraExtra100;
	}

	public Double HoraNoturnaVlrHora(Double SalarioHora) {
		Double HoraNoturnaVlrHora = SalarioHora + (SalarioHora * 0.20);
		return HoraNoturnaVlrHora;
	}

	public Double HoraExtra50NotVlrHora(Double HoraNoturnaVlrHora) {
		Double HoraExtra50Not = HoraNoturnaVlrHora + (HoraNoturnaVlrHora / 2);
		return HoraExtra50Not;
	}

	public Double HoraExtra100NotVlrHora(Double HoraNoturnaVlrHora) {
		Double HoraExtra100Not = HoraNoturnaVlrHora * 2;
		return HoraExtra100Not;
	}
	
}
