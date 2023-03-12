package java_primeros_pasos;

public class EjemploCondicionales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		int edad = 18;
		int cantidadPersonas = 2;
		
		boolean esPareja = cantidadPersonas > 1; //es true o False
		boolean puedeEntrar = edad >= 18 && esPareja;
		System.out.println("El valor de la condicion es: " + esPareja);

		if (puedeEntrar) { // && para y, || para o
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no puede entrar");
		}
	}

}
