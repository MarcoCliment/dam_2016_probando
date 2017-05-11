import java.util.Scanner;

public class Alumno {
	
	int codigoAlumno;
	String nombreAlumno;
	String direccionAlumno;
	
	Notas notas;
	public Alumno(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Pide código");
		codigoAlumno = sc.nextInt();
		sc.nextLine();
		System.out.println("Pide Nombre");
		nombreAlumno = sc.nextLine();
		System.out.println("Pide Dirección");
		direccionAlumno = sc.nextLine();
		notas = new Notas(codigoAlumno);

	
	}


	public int getCodigoAlumno() {
		return codigoAlumno;
	}


	public void setCodigoAlumno(int codigoAlumno) {
		this.codigoAlumno = codigoAlumno;
	}


	public String getNombreAlumno() {
		return nombreAlumno;
	}


	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}


	public String getDireccionAlumno() {
		return direccionAlumno;
	}


	public void setDireccionAlumno(String direccionAlumno) {
		this.direccionAlumno = direccionAlumno;

	}
}