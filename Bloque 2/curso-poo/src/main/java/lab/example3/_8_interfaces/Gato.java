package lab.example3._8_interfaces;

public class Gato extends Animal {

	public Gato(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hacerSonido() {
		System.out.println("miauuu miauu");
	}

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + "]";
	}
	
}
