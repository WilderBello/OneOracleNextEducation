package java_primeros_pasos;

public class EjemploCaracteres {

	public static void main(String[] args) {
		//Usando char, utiliza un solo caracter
		char caracter = 'a';
		System.out.println(caracter);
		// Se puede utilizar la tabla ascii
		caracter = 65;
		System.out.println(caracter);
		
		char caracter2 =  (char) (caracter + 1);
		System.out.println(caracter2);
		
		String Palabra = "Alura Cursos Online ";
		System.out.println(Palabra);
		
		Palabra += "2020";
		System.out.println(Palabra);
		
	}

}
