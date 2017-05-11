import java.util.Scanner;
public class Conversor {

	public static void main(String[] args) {
		int numeroE=Pidedatos();//Número Entero
		int opcion=menu();//Opción del menú
		switch(opcion){
		case 1:
			decabin(numeroE);
			break;
		case 2:
			decahexa(numeroE);
			break;
		default:
			System.out.println("Error");
			break;
		}
		String binario=decabin(numeroE);//Binario
		String hexadecimal=decahexa(numeroE);//Hexadecimal
		Muestraresultado(numeroE,opcion,binario,hexadecimal);
	}
	public static int Pidedatos(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número entero que quieras convertir mayor que 0");
		int numeroE = sc.nextInt();
		return numeroE;
	}
	public static int menu(){
		Scanner sc2=new Scanner(System.in);
		System.out.println("¿A qué lo quieres convertir?/n 1-Binario/n 2-Hexadecimal");
		int opcion = sc2.nextInt();
		return opcion;
	}
	public static String decabin(int numeroE){
		int mod=0;
		String binario= "";
		do{
		mod=numeroE%2;
		numeroE=numeroE/2;
		binario=mod+binario;
		}while(numeroE!=0);
		return binario;
	}
	public static String decahexa(int numeroE){
		String hexadecimal ="";
		int mod;
		String digitohexa="";
		do{
			mod=numeroE%16;
			numeroE=numeroE/16;
				switch (mod){
				case 0:
					digitohexa="0";
					break;
				case 1:
					digitohexa="1";
					break;
				case 2:
					digitohexa="2";
					break;
				case 3:
					digitohexa="3";
					break;
				case 4:
					digitohexa="4";
					break;
				case 5:
					digitohexa="5";
					break;
				case 6:
					digitohexa="6";
					break;
				case 7:
					digitohexa="7";
					break;
				case 8:
					digitohexa="8";
					break;
				case 9:
					digitohexa="9";
					break;
				case 10:
					digitohexa="A";
					break;
				case 11:
					digitohexa="B";
					break;
				case 12:
					digitohexa="C";
					break;
				case 13:
					digitohexa="D";
					break;
				case 14:
					digitohexa="E";
					break;
				case 15:
					digitohexa="F";
					break;
				}
			hexadecimal=digitohexa+hexadecimal;
		}while(numeroE!=0);
		return hexadecimal;
	}
	public static void Muestraresultado(int numeroE, int opcion, String binario, String hexadecimal){
		if(opcion==1){
			System.out.println("Tu número "+numeroE+" convertido a binario da "+binario);
		}else{
			System.out.println("Tu número "+numeroE+" convertido a hexadecimal da "+hexadecimal);
		}
		System.out.println("Gracias por utilizar nuestro servicio");
	}
}
