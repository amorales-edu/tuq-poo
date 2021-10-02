package lab.example3._8_interfaces;

public class Perro extends Animal implements IDomesticable {

	public Perro(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hacerSonido() {
		System.out.println("wuauu woww");
	}

	public void daLaPatita() {
		// TODO Auto-generated method stub
		System.out.println("doy la patita");
	}

	public void sientate() {
		// TODO Auto-generated method stub
		System.out.println("sentado");
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + "]";
	}
	
}
