package Entities;

public class SalarioBruto extends Proventos {
	private Double outrosProventos;
	private int diasDeDescanso;
	private int diasUteisDoMes;
	
	public SalarioBruto() {
	}

	public SalarioBruto(String nomeEmpregado, String matricula, int horasBase, Double salarioBase,
			int qtdeHorasTrabalhadas, int qtdeHorasExtras50, int qtdeHorasExtras100, int qtdeHorasNoturnas,
			int qtdeHorasExtras50Not, int qtdeHorasExtras100Not, Double outrosProventos, int diasDeDescanso,
			int diasUteisDoMes) {
		super(nomeEmpregado, matricula, horasBase, salarioBase, qtdeHorasTrabalhadas, qtdeHorasExtras50,
				qtdeHorasExtras100, qtdeHorasNoturnas, qtdeHorasExtras50Not, qtdeHorasExtras100Not);
		this.outrosProventos = outrosProventos;
		this.diasDeDescanso = diasDeDescanso;
		this.diasUteisDoMes = diasUteisDoMes;
	}

	public Double getOutrosProventos() {
		return outrosProventos;
	}

	public void setOutrosProventos(Double outrosProventos) {
		this.outrosProventos = outrosProventos;
	}

	public int getDiasDeDescanso() {
		return diasDeDescanso;
	}

	public void setDiasDeDescanso(int diasDeDescanso) {
		this.diasDeDescanso = diasDeDescanso;
	}

	public int getDiasUteisDoMes() {
		return diasUteisDoMes;
	}

	public void setDiasUteisDoMes(int diasUteisDoMes) {
		this.diasUteisDoMes = diasUteisDoMes;
	}

	public Double calcularTotalRemuneracao() {
        return getSalarioBase() 
        		+ calcularHorasExtras50()
                + calcularHorasExtras100()
                + calcularHorasNoturnas()
                + calcularHorasExtras50Not()
                + calcularHorasExtras100Not();
    }
	
	public Double calcularDSR(int diasUteisNoMes, int diasDeDescanso) {
        return (calcularTotalRemuneracao() / diasUteisNoMes) * diasDeDescanso;
    }


	public Double calcularSalarioBruto() {
        return calcularTotalRemuneracao()
                + getOutrosProventos()
        		+ calcularDSR(diasDeDescanso, diasDeDescanso );
    }

}
