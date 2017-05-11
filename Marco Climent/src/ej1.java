import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rdo;
		int opcionMes, numdies = 0;
		String opcionDia;
		System.out.println("Introdueix un mes de l'any(de forma numerica)");
		Scanner mes = new Scanner(System.in);
		opcionMes= mes.nextInt();
		
		System.out.println("Introdueix un dia que comença");
		Scanner dia = new Scanner(System.in);
		opcionDia= dia.next();
		opcionDia.toLowerCase();
		
		switch (opcionMes) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			numdies=31;
			break;
		case 2:
			numdies=28;
			break;
		case 4: case 6: case 9: case 11:
			numdies=30;
			break;
		default: 
			System.out.println("Error, tienes que colocarlo de forma numérica hasta el 12");
		}
		
		rdo= calendario(numdies, opcionDia);
		System.out.println("Mes: "+opcionMes);
		System.out.println("Empieza por el día "+opcionDia);
		System.out.println(rdo);
	}
	public static String calendario(int dias,String dia){ //El super metodo que lo hace todo porque no me da tiempo a dividirlo en más métodos.
		int diaEmp = 0;
		int contador = 0;
		int diabucle = 1;
		String rdo= "";
		String bucledia= "";
		String diasSemana= "\tDL\tDM\tDX\tDJ\tDV\tDS\tDG\n";
		
		if (dia.equals("lunes")){ //Averiguamos qué día es para la posición empezando por 0
			diaEmp = 0;
		}
		if (dia.equals("martes")){
			diaEmp = 1;
		}
		if (dia.equals("miercoles")){
			diaEmp = 2;
		}
		if (dia.equals("jueves")){
			diaEmp = 3;
		}
		if (dia.equals("viernes")){
			diaEmp = 4;
		}
		if (dia.equals("sabado")){
			diaEmp = 5;
		}
		if (dia.equals("domingo")){
			diaEmp = 6;
		}
		
		for (int n=0; n<diaEmp;n++){//Sabiendo el día que empieza añadimos espacios
			bucledia = "\t"+bucledia;
			contador++;
			}
		
		for (int i=0;i<dias;i++){//Ahora creamos el calendario con un bucle que va añadiendo números y hace salto de línea de vez en cuando
			bucledia = bucledia+"\t"+diabucle;
			diabucle++;
			contador++;
			if (contador==7){
				bucledia+="\n";
				contador=0;
			}
		}
		/*String hacerrallas=new String();	
		for(int i=0;i<35;i++){
			hacerrallas+="-";
			contador++;
				if (contador==7){
					hacerrallas+="\n";
				}
		}
		return hacerrallas;
		*/ 
		//String Calendario= "DL DM DX DJ DV DS DG \n-  -  -  -  -  -  -  \n-  -  -  -  -  -  -\n-  -  -  -  -  -  -  \n-  -  -  -  -  -  -  \n-  -  -  -  -  -  -";
		rdo=diasSemana+bucledia;					
		return rdo;					
	}
}
