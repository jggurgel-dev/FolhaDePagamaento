package Entities;

public class Cadastro {
	private String nomeEmpregado;
	private String matricula;
	
		
	public Cadastro() {
	}


	public Cadastro(String nomeEmpregado, String matricula) {
		this.nomeEmpregado = nomeEmpregado;
		this.matricula = matricula;
	}


	public String getNomeEmpregado() {
		return nomeEmpregado;
	}


	public void setNomeEmpregado(String nomeEmpregado) {
		this.nomeEmpregado = nomeEmpregado;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	
	
}