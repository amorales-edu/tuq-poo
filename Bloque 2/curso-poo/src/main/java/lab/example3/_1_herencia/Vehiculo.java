package lab.example3._1_herencia;
/**
 * super Clase Veiculo 
 * */
public class Vehiculo {
	//Atributo solo accesible a subClases
	protected String marca = "Ford";
	//Atributo solo accesibel para la clase Veiculo
	private String nombreModelo = "Mustang";
	
	//Constructor 
	public Vehiculo(String marca, String nombreModelo) {
		this.marca = marca;
		this.nombreModelo = nombreModelo;
	}
	//metodo público Accionar Bocina
	public void accionarBocina() {
		System.out.println("Tuut, tuut!");
	}
	//Encapsulado del atributo getNombreModelo
	public String getNombreModelo() {
		return nombreModelo;
	}
	//Encapsulado del atributo getMarca
	public String getMarca() {
		return this.marca;
	}
	//Sobreescritura de método toString de la Clase Object
	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", nombreModelo=" + nombreModelo + "]";
	}

}
