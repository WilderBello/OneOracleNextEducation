package proyecto_bytebank;

public class TestReferencia2 {
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.setNombre("Diego");
		diego.setDocumento("1111111111");
		diego.setTelefono("31352324");
		
		Cuenta cuentaDeDiego = new Cuenta();
		
		cuentaDeDiego.setAgencia(1);
		cuentaDeDiego.setTitular(diego);
		
		System.out.println(cuentaDeDiego.getTitular().getTelefono());
		System.out.println(cuentaDeDiego.getTitular());
	}
}
