package bytebank_heredado;

public class TestFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario diego = new Contador();
		diego.setNombre("Diego");
		diego.setDocumento("111111");
		diego.setSalario(1000);
		diego.setTipo(0);
		
		System.out.println(diego.getBonificacion());
	}

}
