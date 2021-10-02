package lab.example3._3_InnerClass;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new Calculadora();
		Calculadora.Operacion operacion = calc.new Operacion();
		int suma =  operacion.suma(1,2,3,4,54,65,6);
		System.out.print(suma);
	}

}
