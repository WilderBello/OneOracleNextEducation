package java_primeros_pasos;

public class EjemploScope {
	public static void main(String[] args) {
		System.out.println("Hello World");
		int edad = 21;
		int cantidadPersonas = 2;
		
		//boolean esPareja = cantidadPersonas > 1; //es true o False
		//System.out.println("El valor de la condicion es: " + esPareja);
		boolean esPareja; // Por defecto es False pero se debe inicializar para evitar errores 
						//   como se ve en else.
		if(cantidadPersonas > 1) {
			esPareja = true; // Dentro de este contexto compila
		} else {
			esPareja = false;
		}
		
		boolean puedeEntrar = edad >= 18 && esPareja;
		if (puedeEntrar) { // && para y, || para o
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no puede entrar");
		}
	}
}
