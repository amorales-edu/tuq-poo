package lab.example1;

/**
* -Estructura un proyecto en maven
 * -Creaci�n de una clase Calculadora
 * -Sobrecarga de m�todos
 * */
public class Calculadora {
	
	public int suma(int a,int b ) {
		return a+ b;
	}
	public String suma(int a,int b,String r ) {
		r = String.format("%d",(a+b));
		return r ;
	}
	public int suma(String a,String b ) {
		return Integer.parseInt(a) +  Integer.parseInt(b);
	}
}
