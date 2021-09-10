package comcave;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Button;
import java.awt.event.*;
import java.util.ArrayList;

public class Window extends JFrame 
{
	// 1. Formularelemente deklarieren
	JLabel lblAnrede;
	JLabel lblVorname;
	JLabel lblNachname;
	JLabel lblAnschrift;
	JLabel lblPlzOrt;
	JLabel lblTelefon;
	JLabel lblNeukunde;
	

	JComboBox cbAnrede;
	JTextField tfVorname;
	JTextField tfNachname;
	JTextField tfAnschrift;
	JTextField tfPlz;
	JTextField tfOrt;
	JTextField tfTelefon;
	JCheckBox cbxNeukunde;
	JButton btnSpeichern;
	
	JButton btnShowKunde;
	JTextArea taKundenAnzeige;
	
	JButton btnCsvExport;
	
	
	public Window ()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(460, 700);
		setLocationRelativeTo(null);	// Fenster mittig auf Monitor
		setLayout(null);
		
		// 2. Folrmularelemente initialisieren
		lblAnrede = new JLabel("Anrede");
		lblVorname = new JLabel("Vorname");
		lblNachname = new JLabel("Nachname");
		lblAnschrift = new JLabel("Anschrift");
		lblPlzOrt = new JLabel("PLZ/Ort");
		lblTelefon = new JLabel("Telefon");
		lblNeukunde = new JLabel("Neukunde");
		
		String [] anrede = {"Herr", "Frau", "Div"};
		cbAnrede = new JComboBox(anrede);
		tfVorname = new JTextField();
		tfNachname = new JTextField();
		tfAnschrift = new JTextField();
		tfPlz = new JTextField();
		tfOrt = new JTextField();
		tfTelefon = new JTextField();
		cbxNeukunde = new JCheckBox("Ja / Nein");
		btnSpeichern = new JButton("Speichern");
		
		btnShowKunde = new JButton("Kunde anzeigen");
		taKundenAnzeige = new JTextArea();
		
		btnCsvExport = new JButton("CSV");
		
		// 3. Formularelemente dem Window hinzufuegen
		add(lblAnrede);
		add(lblVorname);
		add(lblNachname);
		add(lblAnschrift);
		add(lblPlzOrt);
		add(lblTelefon);
		add(lblNeukunde);
		add(cbAnrede);
		add(tfVorname);
		add(tfNachname);
		add(tfAnschrift);
		add(tfPlz);
		add(tfOrt);
		add(tfTelefon);
		add(cbxNeukunde);
		add(btnSpeichern);
		
		add(btnShowKunde);
		add(taKundenAnzeige);
		
		add(btnCsvExport);
		
		// 4. Elemente positionieren und Groesse bestimmen
		lblAnrede.setBounds(20, 20, 110, 25);
		lblVorname.setBounds(20, 55, 110, 25);
		lblNachname.setBounds(20, 90, 110, 25);
		lblAnschrift.setBounds(20, 125, 110, 25);
		lblPlzOrt.setBounds(20, 160, 110, 25);
		lblTelefon.setBounds(20, 195, 110, 25);
		lblNeukunde.setBounds(20, 230, 110, 25);
		
		cbAnrede.setBounds(130, 20, 110, 25);
		tfVorname.setBounds(130, 55, 110, 25);
		tfNachname.setBounds(130, 90, 110, 25);
		tfAnschrift.setBounds(130, 125, 310, 25);
		tfPlz.setBounds(130, 160, 60, 25);
		tfOrt.setBounds(200, 160, 110, 25);
		tfTelefon.setBounds(130, 195, 110, 25);
		cbxNeukunde.setBounds(130, 230, 110, 25);
		btnSpeichern.setBounds(20, 265, 110, 25);
		
		btnShowKunde.setBounds(140, 265, 180, 25);
		taKundenAnzeige.setBounds(20, 300, 420, 350);
		
		btnCsvExport.setBounds(330, 265, 110, 25);
		
		Click click = new Click(this);
		btnSpeichern.addActionListener( click );
		btnShowKunde.addActionListener( click );
		btnCsvExport.addActionListener( click );
		
		// JComboBox fuellen
		
		cbAnrede.setSelectedIndex(2);
		cbAnrede.addActionListener(cbAnrede);
	}

	public static void main(String[] args) 
	{
		new Window().setVisible(true);		
	}

}
