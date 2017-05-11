import java.util.Scanner;


public class Juego {

	public static void main(String[] args) {
		String palabraSecreta=pidePalabra();
		
		final int NUM_INTENTOS=10;
		
		Scanner sc=new Scanner(System.in);
		boolean hasGanado=false;
		
		hasGanado= juego(palabraSecreta,sc,NUM_INTENTOS);
		
		if(hasGanado==true){
			System.out.println("Enhorabuena, la palabra era "+palabraSecreta);
		}else{
			System.out.println("Has perdido, la palabra era "+palabraSecreta);
		}
	}
	public static String pidePalabra(){
		Scanner palabra=new Scanner(System.in);
		System.out.println("Escribe una palabra secreta");
		String palabraSecreta = palabra.next();
		return palabraSecreta;
	}
	public static void comparaletras(String palabraSecreta){
		
	}
	public static boolean juego(String palabraSecreta,Scanner sc, final int NUM_INTENTOS){
		boolean resultado = false;
		int errores=0;
		int letrasRestantes = palabraSecreta.length();
		char letra;
		int posicion;
		String Adivinadas;
		String palabrasErradas="";
		String ratlles="";
		
		System.out.println("La palabra a adivinar tiene "+palabraSecreta.length()+" caracteres");
		 for (posicion = 0; posicion < palabraSecreta.length(); posicion++) {
		        ratlles = ratlles+"-";
		    }
		 
		 
		do{
		System.out.println("Introduce una letra a adivinar");
		System.out.println(ratlles);
		System.out.println("Letras equivocadas: "+palabrasErradas);
		System.out.println("Vidas restantes: "+(NUM_INTENTOS-errores));
		letra = sc.findWithinHorizon(".", 0).charAt(0);
		
		String novaRatlles="";
		if (palabraSecreta.indexOf(letra)!=-1){
			System.out.println("La letra "+letra+" es correcta");
			for (posicion = 0; posicion < palabraSecreta.length(); posicion++) {
                if (palabraSecreta.charAt(posicion) == letra) {
                	novaRatlles=novaRatlles+letra;
                    letrasRestantes--;
                } else {
                	novaRatlles=novaRatlles+ratlles.charAt(posicion);
                }
			}
			ratlles=novaRatlles;
		}else{
			System.out.println("Error");
			palabrasErradas=letra+palabrasErradas;
			errores++;
		}
		}while(errores<=NUM_INTENTOS && letrasRestantes>0);
			if (letrasRestantes==0){
			resultado=true;
			}
		return resultado;
	}
}
