package practicaT;

import java.util.Scanner;

public class triangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner captura = new Scanner(System.in);
		double x1, x2, y1, y2, z1, z2, distanciaXY, distanciaYZ, distanciaXZ;
		
		System.out.println("Dame el lado A1: ");
		x1 = captura.nextDouble();
		System.out.println("Dame el lado A2: ");
		x2 = captura.nextDouble();
		System.out.println("Dame el lado B1: ");
		y1 = captura.nextDouble();
		System.out.println("Dame el lado B2: ");
		y2 = captura.nextDouble();
		System.out.println("Dame el lado C1: ");
		z1 = captura.nextDouble();
		System.out.println("Dame el lado C2: ");
		z2 = captura.nextDouble();
		
		distanciaXY = Math.sqrt(
				Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		distanciaYZ = Math.sqrt(
				Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
		
		distanciaXZ = Math.sqrt(
				Math.pow(x2 - x1, 2) + Math.pow(z2 - z1, 2));
		
		System.out.println("La distancia de A a B es: "+distanciaXY);
		System.out.println("La distancia de B a C es: "+distanciaYZ);
		System.out.println("La distancia de A a C es: "+distanciaXZ);
		
		if (distanciaXY == distanciaYZ && distanciaXY == distanciaXZ) {
			System.out.println("El triangulo es equilatero");
		} 
		
		if (distanciaXY == distanciaYZ && distanciaXY != distanciaXZ) {
			System.out.println("El triangulo es isoceles");
		}
		
		if (distanciaXY != distanciaYZ && distanciaXY == distanciaXZ) {
			System.out.println("El triangulo es isoceles");
		}
		
		if (distanciaXY != distanciaYZ && distanciaYZ == distanciaXZ) {
			System.out.println("El triangulo es isoceles");
		}
		
		if (distanciaXY != distanciaYZ) {
			if (distanciaYZ != distanciaXZ) {
				if (distanciaXY != distanciaXZ) {
					System.out.println("El triangulo es escaleno");
				}
			}
		}
	}
}