import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;

public class Acerca extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Acerca dialog = new Acerca();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Acerca() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
		{
			JLabel lblNewLabel = new JLabel("Educa App");
			lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(Color.RED);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
			contentPanel.add(lblNewLabel);
		}
		{
			JTextPane txtpnEclipseIdeFor = new JTextPane();
			txtpnEclipseIdeFor.setText("Educa App\r\n\r\nVersion: Beta Release 1\r\nBuild id: 20160218-0600\r\n(c) Copyright Educa App 1\u00BA DAM Florida\r\n\r\nVisit www.floridauniversitara.es");
			txtpnEclipseIdeFor.setAlignmentY(Component.TOP_ALIGNMENT);
			contentPanel.add(txtpnEclipseIdeFor);
		}
		{
			JLabel lblLogoFlorida = new JLabel("");
			//Obtinc lobjecte imageIcon
			ImageIcon imgIcon=new ImageIcon(Acerca.class.getResource("/Resources/Imatges/logoFlorida.png"));
			//Objecte Image de la imatge real
			Image img = imgIcon.getImage();
			//Escalem la imatge
			Image imgEscalada = img.getScaledInstance(200, 88, Image.SCALE_SMOOTH);
			//Cree un altre ImageIcon sobre la imatge Escalada
			ImageIcon imgIconEscalat = new ImageIcon(imgEscalada);
			lblLogoFlorida.setIcon(new ImageIcon(imgEscalada));
			//Aplique l'imatge icon al label per a que me'l mostre a la finestra
			lblLogoFlorida.setHorizontalAlignment(SwingConstants.CENTER);
			contentPanel.add(lblLogoFlorida);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

}
