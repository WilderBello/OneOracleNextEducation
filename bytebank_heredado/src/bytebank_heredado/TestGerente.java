package bytebank_heredado;

public class TestGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente gerente = new Gerente();
		gerente.setSalario(2000);
		gerente.setClave("AluraCurosOnline");
		System.out.println(gerente.iniciarSesion("AluraCurosOnline"));
		
		System.out.println(gerente.getBonificacion());
		
	}
}
