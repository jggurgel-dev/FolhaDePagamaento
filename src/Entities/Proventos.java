package Entities;

public class Proventos extends CalculoBase{
	private int qtdeHorasTrabalhadas;
	private int qtdeHorasExtras50;
	private int qtdeHorasExtras100;
	private int qtdeHorasNoturnas;
	private int qtdeHorasExtras50Not;
	private int qtdeHorasExtras100Not;
	private Double OutrosProventos;
	
	public Proventos() {
	}

	public Proventos(String nomeEmpregado, String matricula, int horasBase, Double salarioBase,
			int qtdeHorasTrabalhadas, int qtdeHorasExtras50, int qtdeHorasExtras100, int qtdeHorasNoturnas,
			int qtdeHorasExtras50Not, int qtdeHorasExtras100Not, Double OutrosProventos) {
		super(nomeEmpregado, matricula, horasBase, salarioBase);
		this.qtdeHorasTrabalhadas = qtdeHorasTrabalhadas;
		this.qtdeHorasExtras50 = qtdeHorasExtras50;
		this.qtdeHorasExtras100 = qtdeHorasExtras100;
		this.qtdeHorasNoturnas = qtdeHorasNoturnas;
		this.qtdeHorasExtras50Not = qtdeHorasExtras50Not;
		this.qtdeHorasExtras100Not = qtdeHorasExtras100Not;
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

	public int getqtdeHorasExtras50Not() {
		return qtdeHorasExtras50Not;
	}

	public void setqtdeHorasExtras50Not(int qtdeHorasExtras50Not) {
		this.qtdeHorasExtras50Not = qtdeHorasExtras50Not;
	}

	public int getqtdeHorasExtras100Not() {
		return qtdeHorasExtras100Not;
	}

	public void setqtdeHorasExtras100Not(int qtdeHorasExtras100Not) {
		this.qtdeHorasExtras100Not = qtdeHorasExtras100Not;
	};
	
	public Double getOutrosProventos() {
		return OutrosProventos;
	}

	public void setOutrosProventos(Double OutrosProventos) {
		this.OutrosProventos = OutrosProventos;
	};
	
	public Double calcularHorasTrabalhadas() {
        return calcularSalarioHora() * qtdeHorasTrabalhadas;
    }

    public Double calcularHorasExtras50() {
        return calcularHoraExtra50() * qtdeHorasExtras50;
    }

    public Double calcularHorasExtras100() {
        return calcularHoraExtra100() * qtdeHorasExtras100;
    }

    public Double calcularHorasNoturnas() {
        return calcularHoraNoturna() * qtdeHorasNoturnas;
    }

    public Double calcularHorasExtras50Not() {
        return calcularHoraExtra50Noturna() * qtdeHorasExtras50Not;
    }

    public Double calcularHorasExtras100Not() {
        return calcularHoraExtra100Noturna() * qtdeHorasExtras100Not;
    }
	
}
