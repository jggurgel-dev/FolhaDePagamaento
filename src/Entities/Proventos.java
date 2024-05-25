package Entities;

public class Proventos extends CalculoBase{
	private int qtdeHorasTrabalhadas;
	private int qtdeHorasExtras50;
	private int qtdeHorasExtras100;
	private int qtdeHorasNoturnas;
	private int qtdeHorasExtras50not;
	private int qtdeHorasExtras100not;
	private Double OutrosProventos;
	
	public Proventos() {
	}

	public Proventos(String nomeEmpregado, String matricula, int horasBase, Double salarioBase,
			int qtdeHorasTrabalhadas, int qtdeHorasExtras50, int qtdeHorasExtras100, int qtdeHorasNoturnas,
			int qtdeHorasExtras50not, int qtdeHorasExtras100not, Double OutrosProventos) {
		super(nomeEmpregado, matricula, horasBase, salarioBase);
		this.qtdeHorasTrabalhadas = qtdeHorasTrabalhadas;
		this.qtdeHorasExtras50 = qtdeHorasExtras50;
		this.qtdeHorasExtras100 = qtdeHorasExtras100;
		this.qtdeHorasNoturnas = qtdeHorasNoturnas;
		this.qtdeHorasExtras50not = qtdeHorasExtras50not;
		this.qtdeHorasExtras100not = qtdeHorasExtras100not;
		this.OutrosProventos = OutrosProventos;
	}

	public int getQtdeHorasTrabalhadas() {
		return qtdeHorasTrabalhadas;
	}

	public void setQtdeHorasTrabalhadas(int qtdeHorasTrabalhadas) {
		this.qtdeHorasTrabalhadas = qtdeHorasTrabalhadas;
	}

	public int getQtdeHorasExtras50() {
		return qtdeHorasExtras50;
	}

	public void setQtdeHorasExtras50(int qtdeHorasExtras50) {
		this.qtdeHorasExtras50 = qtdeHorasExtras50;
	}

	public int getQtdeHorasExtras100() {
		return qtdeHorasExtras100;
	}

	public void setQtdeHorasExtras100(int qtdeHorasExtras100) {
		this.qtdeHorasExtras100 = qtdeHorasExtras100;
	}

	public int getQtdeHorasNoturnas() {
		return qtdeHorasNoturnas;
	}

	public void setQtdeHorasNoturnas(int qtdeHorasNoturnas) {
		this.qtdeHorasNoturnas = qtdeHorasNoturnas;
	}

	public int getQtdeHorasExtras50not() {
		return qtdeHorasExtras50not;
	}

	public void setQtdeHorasExtras50not(int qtdeHorasExtras50not) {
		this.qtdeHorasExtras50not = qtdeHorasExtras50not;
	}

	public int getQtdeHorasExtras100not() {
		return qtdeHorasExtras100not;
	}

	public void setQtdeHorasExtras100not(int qtdeHorasExtras100not) {
		this.qtdeHorasExtras100not = qtdeHorasExtras100not;
	};
	
	public Double getOutrosProventos() {
		return OutrosProventos;
	}

	public void setOutrosProventos(Double OutrosProventos) {
		this.OutrosProventos = OutrosProventos;
	};
	
	public Double CalculoHorasTrab(int qtdeHorasTrabalhadas) {
		Double TotalHorasTrabVlr = SalarioHora(getSalarioBase(), getHorasBase()) * qtdeHorasTrabalhadas;
		return TotalHorasTrabVlr;
	}
	
	public Double CalculoHorasExtras50(int qtdeHorasExtras50) {
		Double TotalHorasExtras50 = HoraExtra50VlrHora(SalarioHora(getSalarioBase(), getHorasBase())) * qtdeHorasExtras50;
		return TotalHorasExtras50;
	}
	
	public Double CalculoHorasExtras100(int qtdeHorasExtras100) {
		Double TotalHorasExtras100 = HoraExtra100VlrHora(SalarioHora(getSalarioBase(), getHorasBase())) * qtdeHorasExtras100;
		return TotalHorasExtras100;
	}
	
	public Double CalculoHorasNoturnas(int qtdeHorasNoturnas) {
		Double TotalHorasNoturnas = HoraNoturnaVlrHora(SalarioHora(getSalarioBase(), getHorasBase())) * qtdeHorasNoturnas;
		return TotalHorasNoturnas;
	}
	
	public Double CalculoHorasExtras50Not(int qtdeHorasExtras50not) {
		Double TotalHorasExtras50Not = HoraExtra50NotVlrHora(HoraNoturnaVlrHora(SalarioHora(getSalarioBase(), getHorasBase()))) * qtdeHorasExtras50not;
		return TotalHorasExtras50Not;
	}
	
	public Double CalculoHorasExtras100Not(int qtdeHorasExtras100Not) {
		Double TotalHorasExtras100Not = HoraExtra100NotVlrHora(HoraNoturnaVlrHora(SalarioHora(getSalarioBase(), getHorasBase()))) * qtdeHorasExtras100;
		return TotalHorasExtras100Not;
	}
	
	
}
