package java_primeros_pasos;

public class WhileToFor {
	public static void main(String[] args) {
		// While utilizadp
		int contador = 0;
        while(contador <= 10) {
            System.out.println(contador);
            contador++;
        }
        // Codigo en For
        for (int contadorFor = 0; contadorFor <= 10; contadorFor++) {
			System.out.println(contadorFor);
		}
	}
}
