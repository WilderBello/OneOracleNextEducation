package bytebank_heredado;

public class ControlBonificacion {
	
	private double suma;
	
	public double registrarSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma;
		System.out.println("Suma: " + this.suma);
		return this.suma;
	}
	
}
