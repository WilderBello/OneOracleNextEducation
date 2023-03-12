package proyecto_bytebank;

public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		miCuenta.depositar(200);
		System.out.println(miCuenta.getSaldo());
		
		miCuenta.retirar(100);
		System.out.println(miCuenta.getSaldo());
		
		Cuenta cuentaDeJimena = new Cuenta();
		cuentaDeJimena.depositar(100);
		cuentaDeJimena.transferir(400, miCuenta);
		
		if(cuentaDeJimena.transferir(400, miCuenta)) {
			System.out.println("Transferencia exitosa");
		} else {
			System.out.println("No fue posible...");
		}
		
		System.out.println(cuentaDeJimena.getSaldo());
		System.out.println(miCuenta.getSaldo());
	}
}
