package lab.example1;

/**
* -Estructura un proyecto en maven
 * -Creaci�n de una clase Cubo
 * -Sobrecarga de m�todos
 * -Encapsulaci�n Getter y Setters
 * -Modificadores de acceso Default, Publico y privado
 * */
class Cubo {

	/**
	 * Atributos
	 * */
	private int anchura, altura , profundidad;
 
	/**
	 * M�todos constructores
	 * */
	public void construir() {
		this.anchura = 10; 
		this.altura= 10 ;
		this.profundidad= 10;
	}
	public void construir(int anchura,int altura ,int profundidad) {
		this.anchura = anchura; 
		this.altura= altura ;
		this.profundidad= profundidad;
	}
	public void construir(String anchura,String altura ,String profundidad) {
		this.anchura = Integer.parseInt(anchura); 
		this.altura= Integer.parseInt(altura); 
		this.profundidad= Integer.parseInt(profundidad); 
	}
	
	/**
	 * M�todos getters y setters
	 * */
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int nuevaAltura) {
		altura = nuevaAltura;
	}
	
	public int getAnchura() {
		return anchura;
	}
	
	public void setAnchura(int nuevaAnchura) {
		anchura = nuevaAnchura;
	}
	
	
	public int getProfundidad() {
		return profundidad;
	}
	
	
	public void setProfundidad(int nuevaProfundidad) {
		profundidad = nuevaProfundidad;
	}
	
	/**
	 * M�todos utilitarios
	 * */
	public int getVolumen() {
		return anchura* altura * profundidad;
	}
}
