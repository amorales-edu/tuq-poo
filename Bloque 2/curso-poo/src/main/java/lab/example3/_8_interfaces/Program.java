package lab.example3._8_interfaces;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     
		Perro perro = new Perro("lucho");  
	    Gato gato = new Gato("moka");
	    Animal[] animales= {perro, gato};
	    
	   for(Animal animal : animales) {
		   if(animal instanceof IDomesticable) {
			 System.out.println(animal);  
			 animal.hacerSonido();
		   }
		  
	   }
	    
	    
	    
	   
	}

}
