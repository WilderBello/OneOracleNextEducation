package java_primeros_pasos;

/* 
 *  Ahora crea una nueva clase, escribe un for que comience una variable n (número actual) 
 *  como 1 y factorial (resultado total) como 1. ¡Haz su ciclo entre 1 y 10 y calcula el resultado!
 *  */

public class EjercicioFactorial {
	public static void main(String[] args) {
		int numero = 10;
		
		for (int n = 0; n <= numero; n++) {
			int factorial = 1;
			if(n == 0) {
				System.out.println("Factorial de "+ n + " es: " + 1);
				continue;
			}
			for (int factor = 1; factor <= n; factor++) {
				factorial *= factor;
			}
			System.out.println("Factorial de "+ n + " es: " + factorial);
		}
	}
}
