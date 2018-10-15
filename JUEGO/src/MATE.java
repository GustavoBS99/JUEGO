import java.math.BigDecimal;

import java.util.Scanner;

public class MATE {

	public static void main(String[] args) {
		
		Scanner Usuario = new Scanner(System.in);
		
		int C = 0;
		int P=0;
		int aumentos = 0;
		
		//Numeros Maximos y minimos para operaciones
		int min = 1;
		int max = 10;
		

		int min1 = 1;
		int max2 = 3;
		int max3 = 4;

		//Generar numeros random
		int IN1 = (int) (Math.random() * max) + min;
		int IN2 = (int) (Math.random() * max) + min;
		int IN3 = (int) (Math.random() * max) + min;
		int IN4 = (int) (Math.random() * max) + min;
		int Random = (int) (Math.random() * max2) + min1;
		int Random2 = (int) (Math.random() * max3) + min1;
		

		double N1 = IN1;
		double N2 = IN2;
		double N3 = IN3;
		double N4 = IN4;
		int decimales = 2;
		double R = 0;
		
		//Nombre de usuario
		System.out.println("Introduce tu nombre:");
		String nombre = Usuario.next();
		String Repetir = "Si";
		
		//Ciclo Grande que sirve para decidir si el usuario jugara otra vez o no
		while (Repetir.equals("Si")) {
			C++;
			
		
			System.out.println("Escoje tu nivel:");
			System.out.println("");
			System.out.println("Nivel 1: Sumas y restas.");
			System.out.println("Nivel 2: Multiplicaciones y divisiones.");
			System.out.println("Nivel 3: Operaciones de suma, resta, multiplicación y división.");
			System.out.println("");
			//Seleccion de nivel
			System.out.println("Introduce el numero de nivel deseado:");
			int Eleccion = Usuario.nextInt();
			
			//Diferentes problemas
			switch (Eleccion) { //Nivel elegido por el usuario
			//Operaciones de nivel 1
			case 1:
				aumentos=1;
				switch (Random) {//Seleccion random de operacion
				case 1:
					System.out.println("Resuelve la ecuacion " + N1 + "+" + N2 + "+" + N3);
					R = N1 + N2 + N3;
					break;
				case 2:
					System.out.println("Resuelve la ecuacion " + N1 + "-" + N2 + "+" + N3);
					R = N1 - N2 + N3;
					break;

				case 3:
					System.out.println("Resuelve la ecuacion " + N1 + "-" + N2 + "-" + N3);
					R = N1 - N2 - N3;
					break;
				}
				break;
			//Operaciones de nivel 2
			case 2:
				aumentos=3;
				switch (Random2) {
				case 1:
					System.out.println("Resuelve la ecuacion " + N1 + " * " + N2 + " * " + N3);
					R = N1 * N2 * N3;
					break;
				case 2:
					System.out.println("Resuelve la ecuacion " + N1 + " * (" + N2 + " / " + N3 + ")");
					R = N1 * (N2 / N3);
					break;
				case 3:
					System.out.println("Resuelve la ecuacion " + N1 + " / (" + N2 + " / " + N3 + ")");
					R = N1 / (N2 / N3);
					break;
				case 4:
					System.out.println("Resuelve la ecuacion " + N1 + " / (" + N2 + " * " + N3 + ")");
					R = N1 / (N2 * N3);
					break;
				}
				break;
			//Operaciones de nivel 3
			case 3:
				aumentos=5;
				switch (Random2) {
				case 1:
					System.out.println("Resuelve la ecuacion (" + N1 + " + " + N2 + ") / (" + N3 + " - " + N4 + ")");
					R = (N1 + N2) / (N3 - N4);
					break;
				case 2:
					System.out.println("Resuelve la ecuacion (" + N1 + " + " + N2 + ") / (" + N3 + " / " + N4 + ")");
					R = (N1 + N2) / (N3 / N4);
					break;
				case 3:
					System.out.println("Resuelve la ecuacion (" + N1 + " * " + N2 + ") / (" + N3 + " * " + N4 + ")");
					R = (N1 * N2) / (N3 * N4);
					break;
				case 4:
					System.out.println("Resuelve la ecuacion (" + N1 + " / " + N2 + ") + (" + N3 + " - " + N4 + ")");
					R = (N1 / N2) + (N3 - N4);
					break;
				}
				break;

			}
			// Acaba el switch

			// tranformar respuestas largas en Dos decimales
			BigDecimal d = new BigDecimal(R);
			d = d.setScale(decimales, BigDecimal.ROUND_DOWN);
			R = d.doubleValue();

			// respuestas
			System.out.println(R);
			//Ingresar Respuesta
			System.out.println("Ingresa tu respuesta:");
			double Resp = Usuario.nextDouble();
			if (Resp == R) {
				P+=aumentos;
			}
			System.out.println("Muy bien "+nombre+ ". Tus puntos actuales son = " + P);
			System.out.println("Has realizado "+C+ " Operaciones.");
			//Repetir ciclo?
			System.out.println("Quieres hacer un problema nuevo?[Si/No]");
			Repetir = Usuario.nextLine();
			Repetir = Usuario.nextLine();
		}
	}
}
