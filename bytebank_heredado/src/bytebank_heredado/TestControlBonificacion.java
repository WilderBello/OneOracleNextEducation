package bytebank_heredado;

public class TestControlBonificacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario diego = new Gerente();
		diego.setSalario(1000);
		
		Gerente jimena = new Gerente();
		jimena.setSalario(10000);
		
		Contador alexis = new Contador();
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		controlBonificacion.registrarSalario(diego);
		controlBonificacion.registrarSalario(jimena);
		controlBonificacion.registrarSalario(alexis);
	}

}
