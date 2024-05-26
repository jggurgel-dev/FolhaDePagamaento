package Application;

import Entities.CalculoBase;

public class Program {

    public static void main(String[] args) {
        // Criação de uma instância de CalculoBase com dados de exemplo
        CalculoBase empregado = new CalculoBase("Jose", "6674", 220, 3500.00);
        
        // Exibindo informações do empregado
        System.out.println("Nome do Empregado: " + empregado.getNomeEmpregado());
        System.out.println("Horas Base: " + empregado.getHorasBase());
        System.out.println("Salário Base: " + String.format("%.2f", empregado.getSalarioBase()));
        System.out.println("Salário por Hora: " + String.format("%.2f", empregado.calcularSalarioHora()));
    }
}