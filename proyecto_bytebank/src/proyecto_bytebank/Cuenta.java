package proyecto_bytebank;

/*Entidad cuenta */
class Cuenta {
	// saldo, agencia, numero, titular
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	private static int total = 0; // No es de la instancia pero si del objeto
	
	public Cuenta() {
		
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}
	
	public Cuenta(int agencia) {
		System.out.println("aqui se crea una nueva cuenta");
		
		
		if (agencia <= 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Cantidad de cuentas: " + total);
	}
	
	// metodos depositar, retirar, transferir
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
		
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			cuenta.depositar(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setAgencia(int nuevaAgencia) {
		if (agencia > 0) {
			this.agencia = nuevaAgencia;
		} else {
			System.out.println("No estan permitidos valores negativos");
		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
}