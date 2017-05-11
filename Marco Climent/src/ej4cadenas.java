
public class ej4cadenas {

	
	
	public static void main(String args[]){//NO ME HA DADO TIEMPO A ACABARLO PERO AHÍ MÁS O MENOS ESTÁ CREO
		String datos= "2016;11;22;30;44444#"+"2014;23;14;31;666666#"+"24;11;25;15;777777";
		System.out.println(datos);
		Alumnostotales(datos);
	}
	public static String gestionaLinea(String datosAnalizar){
		String rdo="";
		int c1,c2,c3, c4, c5;
		c1=datosAnalizar.indexOf(';');
		c2=datosAnalizar.indexOf(';',c1+1);
		c3=datosAnalizar.indexOf(';',c2+1);
		c4=datosAnalizar.indexOf(';',c3+1);
		c5=datosAnalizar.length();
		rdo=datosAnalizar.substring(c4+1, c5);
		return rdo;
	}
public static String Alumnostotales(String datosAnalizar){
	String unaCadena,totalAlumnos = "";
	int pos_i, pos_f;
	
	pos_i=0;
	pos_f=datosAnalizar.indexOf('#');
	while(pos_f!=-1){
		
		unaCadena = datosAnalizar.substring(pos_i, pos_f);
		totalAlumnos=gestionaLinea(unaCadena);
		System.out.println(totalAlumnos);
		pos_i=pos_f+1;
		pos_f=datosAnalizar.indexOf('#',pos_i);
	};
	return totalAlumnos;
}
}