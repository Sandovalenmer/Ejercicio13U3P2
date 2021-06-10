import java.util.*;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		double dividendo, division, divisor, opc, sumatoria, n, n1;
		Scanner scanner = new Scanner(System.in);

		opc = 0;
		while (opc!=3) {
			System.out.println("Opciones");
			System.out.println("1.Sumar");
			System.out.println("2.Dividir");
			System.out.println("3.Salir");
			System.out.println("Seleccione lo que requiere");
			opc = scanner.nextDouble();
			if (opc==1) {
				System.out.println("Ingrese el Primer número");
				n = scanner.nextDouble();
				System.out.println("Ingrese el Segundo numero");
				n1 = scanner.nextDouble();
				sumatoria = n + n1;
				System.out.println("La suma es: "+sumatoria+".");
				System.out.println(" ");
			} else {
				if (opc==2) {
					System.out.println("ingrese el Dividendo");
					dividendo = scanner.nextDouble();
					System.out.println("Ingrese el Divisior");
					divisor = scanner.nextDouble();
					if (divisor==0) {
						System.out.println("No se puede dividir entre 0.");
						System.out.println(" ");
					} else {
						division = dividendo/divisor;
						System.out.println("La division dá: "+division+".");
						System.out.println(" ");
					}
				} else {
					System.out.println("Fin");
				}
			}
		}
	}


}

