package proyecto_bytebank;

public class PruebaConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta1 = new Cuenta(1);
		Cuenta cuenta2 = new Cuenta(2);
		//cuenta.setAgencia(-4);
		System.out.println(Cuenta.getTotal());
	}

}
