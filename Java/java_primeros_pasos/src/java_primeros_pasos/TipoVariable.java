package java_primeros_pasos;

public class TipoVariable {
	public static void main(String[] args) {
		System.out.println("Hola Mundo!!!");
		
		// Usando Int
		int edad = 28;
		edad = 47; //Sobre escritura
		edad = edad + 12; // Modificando variable
		
		System.out.println("Edad es: " + edad); // Concatenando strings
		
		// Usando Double
		double salario = 1250.50;
		System.out.println(salario);
		
		//double edad = 28; // Se puede utilizar ya que es el doble de la capacidad int
		double salarioMitad = salario/2;
		System.out.println(salarioMitad);
		
		int division = 1250/3;
		System.out.println(division);
		
		// Usando cast
		double variable1 = 230.89;
		int variableEntero = (int) variable1; // Cast
		System.out.println(variableEntero);
		
		// Se debe tener cuidado con el tamano de memoria necesaria para los números.
		long prueba = 1222222222222222222L; //numeros grandes
		short numeroPequeno = 13555; 
		byte numeroAunMasPequeno =  8; //8 bits de tamano
		float numeroDecimalPequeno = 2.5F; // numero decimal mas pequeno que double
		
		
		int resultado = (int) variable1 + variableEntero;
		System.out.println(resultado);
	}
}
