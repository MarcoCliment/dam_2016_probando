import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Clase {
	HashMap <Integer, Alumno> alumnos;
	
	public Clase() {
		
		alumnos = new HashMap <Integer, Alumno>();
	}

	public static void main(String[] args) {
	
		Clase c = new Clase();
		c.creaAlumno();
		c.recorreHashMap();
		
	}
	public void creaAlumno(){
		Alumno a = new Alumno();
		Alumno b = new Alumno();
		Alumno c = new Alumno();
		alumnos.put(1, a);
		alumnos.put(2, b);
		alumnos.put(3, c);
		int codigo = alumnos.get(2).codigoAlumno;
		System.out.println(codigo);
	}
	public void recorreHashMap(){
		
		Iterator it = alumnos.entrySet().iterator();
		while(it.hasNext()){
			Entry <Integer, Alumno> unObjetodelHashMap = (Entry <Integer,Alumno>)(it.next());
			System.out.println(unObjetodelHashMap.getValue().getNombreAlumno());
		}
	}		
}