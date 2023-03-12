package java_primeros_pasos;

public class EjemploCiclos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		int suma = 0;
		
		while (contador <= 10) {
			suma += contador;
			contador++;
		}
		System.out.println("La suma es: " + suma);
	}

}
