import java.util.Scanner;


public class Estadistic {

	public static void main(String[] args) {
		String titol="PERIODE;TOTAL;HOMENS;DONES\n";
		String dades ="2015;4.980.689;2.460.805;2.519.884#"
				+"2014;5.004.844;2.475.081;2.529.763#"
				+"2013;5.113.815;2.534.539;2.579.276#"
				+"2012;5.129.266;2.546.404;2.582.862#"
				+"2011;5.117.190;2.541.780;2.575.410#"
				+"2010;5.111.706;2.542.949;2.568.757#";

		System.out.println(dades);
		String dades2 =dades.replace(".", "");
		System.out.println(dades2);
		int opcion=menu();
		switch (opcion){
		 	case 1: System.out.println("---- Total Poblacio------");
		 	        break;
		 	case 2: System.out.println("---- Poblacio Homens------");
		 	        break;
		 	case 3: System.out.println("---- Poblacio Dones-------");
		 	        break;
		}
		info_10_15(dades2,opcion);
		
	}

	// Menu per a triar una de les següents opcions:
	//	1.-Mostrar el total habitants en el període 2010-2015
	//	2.-Mostrar el el nombre d'homens en el període 2010-2015
	//	3.-Mostrar el nombre de dones en el període 2010-2015
	public static int menu(){
		Scanner sc = new Scanner(System.in);
		int op;
		do{
			System.out.println("Selecciona una opcio: (1,2 o 3)");
			System.out.println("1.- Llistar total habitants");
			System.out.println("2.- Llistar homens");
			System.out.println("3.- Llistar dones");
			System.out.print("Opcio:");
			op=sc.nextInt();
		} while(op<1||op>3);
		return op;
	}
	
	
	//Mètode que ens mostre el total d'habitants en el període 2010-2015
/*	public static int totalHab10_15(String dadesAAnalitzar){
		String unaCadena,totalPeriode;
		int pos_i, pos_f;
		
		pos_i=0;
		pos_f=dadesAAnalitzar.indexOf('#');
		while(pos_f!=-1){
			unaCadena = dadesAAnalitzar.substring(pos_i, pos_f);
			totalPeriode=gestionaLinea(unaCadena,1);
			System.out.println("\t\t"+totalPeriode);
			pos_i=pos_f+1;
			pos_f=dadesAAnalitzar.indexOf('#',pos_i);
		};
		return 1;
	}
	*/
	public static String gestionaLinea(String dadesAAnalitzar, int col){
		String rdo="";
		int c1,c2,c3, c4;
		c1=dadesAAnalitzar.indexOf(';');
		c2=dadesAAnalitzar.indexOf(';',c1+1);
		c3=dadesAAnalitzar.indexOf(';',c2+1);
		c4=dadesAAnalitzar.length();
		
		switch (col){
		case 1:
			rdo=dadesAAnalitzar.substring(c1+1,c2);
			break;
		case 2:
			rdo=dadesAAnalitzar.substring(c2+1, c3);
			break;
		case 3:
			rdo=dadesAAnalitzar.substring(c3+1, c4);
			break;

		}
		
		//System.out.println(rdo+"\t["+pos_i+","+pos_f+"]");
		
		return rdo;
	}
	//Mètode que ens mostre el nombre d'homens en el període 2010-2015
	public static int info_10_15(String dadesAAnalitzar, int opcio){
		String unaCadena,totalPeriode;
		int pos_i, pos_f;
		
		pos_i=0;
		pos_f=dadesAAnalitzar.indexOf('#');
		while(pos_f!=-1){
			
			unaCadena = dadesAAnalitzar.substring(pos_i, pos_f);
			totalPeriode=gestionaLinea(unaCadena,opcio);
			System.out.println("\t\t"+totalPeriode);
			pos_i=pos_f+1;
			pos_f=dadesAAnalitzar.indexOf('#',pos_i);
		};
		return 1;
	}
	/*
	public static String gestionaLinea2(String dadesAAnalitzar){
		// Exemple de linia a tractar:   
		// 2015;4.980.689;2.460.805;2.519.884
		String rdo="";
		int kk,pos_i, pos_f;
		kk=dadesAAnalitzar.indexOf(';');
		pos_i=dadesAAnalitzar.indexOf(';',kk+1)+1;
		pos_f=dadesAAnalitzar.indexOf(';',pos_i);
		
		rdo=dadesAAnalitzar.substring(pos_i, pos_f);
		//System.out.println(rdo+"\t["+pos_i+","+pos_f+"]");
		
		return rdo;
	}
	*/
	//Mètode que ens mostre el nombre de dones en el període 2010-2015
/*	public static int totalDones10_15(String dadesAAnalitzar){
		String unaCadena,totalPeriode;
		int pos_i, pos_f;
		
		pos_i=0;
		pos_f=dadesAAnalitzar.indexOf('#');
		while(pos_f!=-1){
			unaCadena = dadesAAnalitzar.substring(pos_i, pos_f);
			totalPeriode=gestionaLinea(unaCadena,3);
			System.out.println("\t\t"+totalPeriode);
			pos_i=pos_f+1;
			pos_f=dadesAAnalitzar.indexOf('#',pos_i);
		};
		return 1;
	}
	*/
/*
	public static String gestionaLinea3(String dadesAAnalitzar){
		// Exemple de linia a tractar:   
		// 2015;4980689;2460805;2519884
		String rdo="";
		int kk,kk2,pos_i, pos_f;
		kk=dadesAAnalitzar.indexOf(';');
		kk2=dadesAAnalitzar.indexOf(';',kk+1);
		pos_i=dadesAAnalitzar.indexOf(';',kk2+1)+1;
		pos_f=dadesAAnalitzar.length();
		
		rdo=dadesAAnalitzar.substring(pos_i, pos_f);
		//System.out.println(rdo+"\t["+pos_i+","+pos_f+"]");
		
		return rdo;
	}
*/
}
