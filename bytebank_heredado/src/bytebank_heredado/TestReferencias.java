package bytebank_heredado;

public class TestReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Diego");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(5000);
	}

}
