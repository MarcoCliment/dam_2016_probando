import java.lang.Math;
import java.util.Scanner;

public class ej3area {
	
	public static void main(String args[]){
		int perimetro = 0;
		int ladoTriangulo= 0;
		double area= 0;
		System.out.println("Escribe la medida de un lado de un triángulo equilatero");
		Scanner lado= new Scanner(System.in);
		ladoTriangulo= lado.nextInt();
		perimetro=ladoTriangulo+ladoTriangulo+ladoTriangulo;
		area= (Math.sqrt(3)/4)*ladoTriangulo;
		System.out.println("Perímetro es: "+perimetro);
		System.out.println("Area es: "+ area);
	}
}
