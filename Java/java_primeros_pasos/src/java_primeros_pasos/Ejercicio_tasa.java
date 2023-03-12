package java_primeros_pasos;

public class Ejercicio_tasa {
/*
 Opcional: tasa con ifs
PRÓXIMA ACTIVIDAD

A Juan le gustaría crear un programa sobre Impuesto sobre la Renta (IR), para ello, 
verificó las reglas de impuestos. Encontró en el sitio web de impuestos que:

De 1900.0 a 2800.0, el IR es de 7.5% y puede deducir de la declaración el monto de 142.
De 2800.01 a 3751.0, el IR es del 15% y puede deducir 350.
De 3751.01 a 4664.00, el IR es 22.5% y puede deducir 636. 
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double costoRenta = 3200.0;
		
		double deduccion = 0.0;
		double IR = 0.0;
		
		if(costoRenta >= 1900.0 && costoRenta <= 2800.0) {
			deduccion = 142.0;
			IR = costoRenta * 0.075;
		} else if (costoRenta >= 2800.01 && costoRenta <= 3751.0) {
			deduccion = 350.0;
			IR = costoRenta * 0.15;
		}else if (costoRenta >= 3751.01 && costoRenta <= 4664.0) {
			deduccion = 636.0;
			IR = costoRenta * 0.225;
		} else {
			deduccion = 0;
			IR = 0;
		}
		double total = IR - deduccion;
		
		if(deduccion != 0) {
			System.out.println("Para el costo de renta de " + costoRenta + ", el valor de deduccion es de: " 
		+ deduccion + " y el impuesto a la renta es de: " + IR + ", por lo tanto el total a pagar es de: " 
		+ total);
		} else {
			System.out.println("El costo de renta esta fuera rango... Por favor ingresar un valor entre 1900 y 4664");
		}
	}

}
