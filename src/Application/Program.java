package Application;

import Entities.CalculoBase;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculoBase fun1 = new CalculoBase("Jose", "6674", 220, 1854.94);
		
		System.out.println(fun1.getNomeEmpregado());
		System.out.println(fun1.getHorasBase());
		System.out.println(fun1.getSalarioBase());
		System.out.println(String.format("%.2f",fun1.SalarioHora(fun1.getSalarioBase(),fun1.getHorasBase())));
	}

}
