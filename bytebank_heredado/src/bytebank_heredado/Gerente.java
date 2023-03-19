package bytebank_heredado;

public class Gerente extends Funcionario {
	
	private String clave;
	
	public Gerente() {
		
	}
	
	public void setClave(String clave){
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "AluraCurosOnline";
	}
	@Override
	public double getBonificacion() {
		return super.getSalario() + super.getBonificacion();
	}
}
