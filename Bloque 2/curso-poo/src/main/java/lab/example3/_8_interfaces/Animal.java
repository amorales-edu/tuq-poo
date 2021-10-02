package lab.example3._8_interfaces;

public abstract class Animal {
	protected String nombre;
		
	 public Animal(String nombre) {
			super();
			this.nombre = nombre;
		}

	protected abstract void hacerSonido();
}
