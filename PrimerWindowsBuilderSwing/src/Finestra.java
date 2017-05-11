import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Finestra extends JFrame implements ActionListener {

	private JPanel contentPane;
	JButton btnMatricular;
	/**
	 * Create the frame.
	 */
	
	public Finestra() {
	
		setTitle("Educa App");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		//Creacio menu
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnConsultes = new JMenu("Consultes");
		menuBar.add(mnConsultes);
		
		JMenuItem mntmListaCursos = new JMenuItem("Lista cursos");
		mnConsultes.add(mntmListaCursos);
		
		JMenuItem mntmMostrarAlumnosPor = new JMenuItem("Mostrar alumnos por curso");
		mnConsultes.add(mntmMostrarAlumnosPor);
		
		JMenu mnHoly = new JMenu("Holy");
		mnConsultes.add(mnHoly);
		
		JMenuItem mntmFuck = new JMenuItem("Fuck");
		mnHoly.add(mntmFuck);
		
		JMenu mnInsertar = new JMenu("Insertar");
		menuBar.add(mnInsertar);
		Component horizontalGlue = Box.createHorizontalGlue();
		menuBar.add(horizontalGlue);
		
		JMenu mnAcercaDe = new JMenu("Acerca de");
		menuBar.add(mnAcercaDe);
		
		JMenuItem mntmInfo = new JMenuItem("Info");
		mnAcercaDe.add(mntmInfo);
		//Fi de creacio de menu
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblEducaApp = new JLabel("Educa App");
		lblEducaApp.setToolTipText("a\u00E7o es el tooltip text");
		lblEducaApp.setHorizontalAlignment(SwingConstants.CENTER);
		lblEducaApp.setForeground(Color.RED);
		lblEducaApp.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblEducaApp, BorderLayout.NORTH);
		
		JPanel panelConsultes = new JPanel();
		contentPane.add(panelConsultes, BorderLayout.WEST);
		panelConsultes.setLayout(new BoxLayout(panelConsultes, BoxLayout.Y_AXIS));
		
		JLabel lblConsultes = new JLabel("Consultes");
		lblConsultes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelConsultes.add(lblConsultes);
		
		JButton btnLlistar = new JButton("Llistar cursos");
		panelConsultes.add(btnLlistar);
		
		JButton btnAlumnes = new JButton("Alumnes per curs");
		panelConsultes.add(btnAlumnes);
		
		JPanel panelInserccions = new JPanel();
		contentPane.add(panelInserccions, BorderLayout.EAST);
		panelInserccions.setLayout(new BoxLayout(panelInserccions, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel = new JLabel("Inserccions");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelInserccions.add(lblNewLabel);
		
		JButton btnInsertarEst = new JButton("Insertar estudiants");
		panelInserccions.add(btnInsertarEst);
		
		JButton btnMatricular = new JButton("Matricular");
		panelInserccions.add(btnMatricular);
		btnMatricular.addActionListener(this);
		
		/*String unTitol = JOptionPane.showInputDialog(this, "Inrodueix titol de la finestra", "Entrada de dades", JOptionPane.QUESTION_MESSAGE);
		if(unTitol!=null){
			setTitle("------");
		}else{
		if(!unTitol.isEmpty()){
			setTitle(unTitol);
	}else{
		setTitle("Ieee, posa-li titol!");
	}
	}*/
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource()==btnMatricular){
			try {
				JFrame FMatricular = new FMatricular();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
