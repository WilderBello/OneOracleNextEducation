package proyecto_bytebank;

public class CrearCuenta {
	public static void main(String[] args) {
		// Variable = valor
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.depositar(1000);;
		
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.depositar(500);;
		
		System.out.println(segundaCuenta.getSaldo());
		
		System.out.println(primeraCuenta.getAgencia());
		
		// Ubicacion en memoria
		//System.out.println(primeraCuenta);
		//System.out.println(segundaCuenta);
		// Java evalua el lugar en memoria para cada objeto y saber si son el mismo objeto.
	}
}
