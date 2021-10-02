package lab.example3._2_Constructor;

public class Fecha {
	int dia, mes, anio;
	// el constructor es asegura que se cumpla con los elementos basicos para la
	// creación del objeto

	public Fecha(int dia, int mes, int anio) {
		// super() manda a llamar al constructor de la clase padre

		super();
		validarFecha(dia, mes, anio);
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;

	}

	public Fecha(String dia, String mes, String anio) {
		// this manda a llamar al constructor Fecha(int dia, int mes, int anio)
		this(Integer.valueOf(dia).intValue(), Integer.valueOf(mes).intValue(), Integer.valueOf(anio).intValue());

	}

	// "11-09-1993"
	public Fecha(String fecha) {
		validarFecha(fecha);

	}

	public void AgregarDias(int noDias) {
		this.dia += noDias;
	}

	private void validarFecha(String fecha) {
		if (fecha == null || fecha == "") {

			System.out.print("Fecha no valida");
		}
	}

	private void validarFecha(int dia, int mes, int anio) {
		if (!(dia > 0 && dia <= 31))
			return;
		if (!(mes > 0 && mes <= 12))
			return;
		if (!(anio > 0))
			return;
	}

}
