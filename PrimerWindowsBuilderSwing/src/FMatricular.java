import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.ScrollPane;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;

public class FMatricular extends JFrame implements ActionListener{

	private JPanel contentPane;
	Connection miConexionMySql=null;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FMatricular frame = new FMatricular();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ResultSet conectaYConsulta(){
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			System.out.println("Registro exitoso");

			} catch (Exception e) {

			System.err.println("Error registrando el driver");

			}
				

		try {
		String cadenaConexion="jdbc:mysql://127.0.0.1/educa?user=root&password=";
		miConexionMySql = DriverManager.getConnection(cadenaConexion);

		// Otros y operaciones sobre la base de datos...

		} catch (SQLException ex) {

			System.err.println("Error en login o no se encuentra BDD");

		}
		ResultSet resultatConsulta=null;

		try {
			Statement stmt=miConexionMySql.createStatement();		
			resultatConsulta = stmt.executeQuery("SELECT * FROM CURSO");

		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			return resultatConsulta;
		}
	}
	public ResultSet conectaYConsulta2(){
		try {
		String cadenaConexion="jdbc:mysql://127.0.0.1/educa?user=root&password=";
		miConexionMySql = DriverManager.getConnection(cadenaConexion);

		// Otros y operaciones sobre la base de datos...

		} catch (SQLException ex) {

			System.err.println("Error en login o no se encuentra BDD");

		}

		ResultSet resultatConsulta2=null;
		try {
			Statement stmt=miConexionMySql.createStatement();		
			resultatConsulta2 = stmt.executeQuery("SELECT * FROM ESTUDIANTE");

		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			return resultatConsulta2;
		}
	}
	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public FMatricular() throws SQLException {
		ResultSet rs=conectaYConsulta();
		ResultSet rs2=conectaYConsulta2();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel listaCursos = new JPanel();
		contentPane.add(listaCursos, BorderLayout.WEST);
		listaCursos.setLayout(new BoxLayout(listaCursos, BoxLayout.Y_AXIS));
		
		JLabel lblCursos = new JLabel("Cursos");
		lblCursos.setHorizontalAlignment(SwingConstants.LEFT);
		listaCursos.add(lblCursos);
		
		DefaultListModel listModel = new DefaultListModel();

		
		while(rs.next()){
			listModel.addElement(rs.getString("Cnombre"));
		}
		JList CursosLista = new JList(listModel);
		

		CursosLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane desplegable2 = new JScrollPane(CursosLista);
		listaCursos.add(desplegable2);
		
		
		JPanel listaAlumnos = new JPanel();
		contentPane.add(listaAlumnos, BorderLayout.EAST);
		listaAlumnos.setLayout(new BoxLayout(listaAlumnos, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel = new JLabel("Alumnos");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		listaAlumnos.add(lblNewLabel);
		
		DefaultListModel listaEstudiante = new DefaultListModel();
		while(rs2.next()){
			listaEstudiante.addElement(rs2.getString("Snombre"));
		}
		JList AlumnosLista = new JList(listaEstudiante);
		AlumnosLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane desplegable1 = new JScrollPane(AlumnosLista);
		listaAlumnos.add(desplegable1);
	
		JPanel MatriculaBotones = new JPanel();
		FlowLayout flowLayout = (FlowLayout) MatriculaBotones.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		contentPane.add(MatriculaBotones, BorderLayout.SOUTH);
		
		JButton AtrasBtn = new JButton("Volver");
		AtrasBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		AtrasBtn.setHorizontalAlignment(SwingConstants.RIGHT);
		MatriculaBotones.add(AtrasBtn);
		
		JButton EnviarBtn = new JButton("Enviar");
		EnviarBtn.setHorizontalAlignment(SwingConstants.RIGHT);
		MatriculaBotones.add(EnviarBtn);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
