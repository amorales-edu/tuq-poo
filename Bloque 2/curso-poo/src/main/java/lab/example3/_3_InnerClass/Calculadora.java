package lab.example3._3_InnerClass;

public class Calculadora {

	// clase Interna
	public class Operacion {

		public int suma(Integer... valores) {
			int acumulador = 0;
			for (Integer valor : valores) {
				acumulador += valor;
			}

			return acumulador;
		}
	}
}
