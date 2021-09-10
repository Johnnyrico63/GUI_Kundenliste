package comcave;

import java.awt.event.*;
import java.util.*;
import java.io.*;
import javax.swing.*;

public class Click implements ActionListener
{
	Window w;
	
	public Click(Window w)
	{
		this.w = w;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(w.btnSpeichern))
		{		
			Costumer.kdList.add(new Costumer (
									w.cbAnrede.getSelectedItem(), 
									w.tfVorname.getText(),
									w.tfNachname.getText(),
									w.tfAnschrift.getText(),
									w.tfPlz.getText(),
									w.tfOrt.getText(),
									w.tfTelefon.getText(),
									w.cbxNeukunde.getAccessibleContext()
								));
			if(DateiManager.kundenSpeichern())
			{
				clearForm();
			}
			else
			{
				JOptionPane.showMessageDialog(w, "Kunde nicht gespeichert");
			}
		}
		else if (e.getSource().equals(w.btnShowKunde))
		{
			w.taKundenAnzeige.setText(""); // TextArea leeren
			String text = "";
			for( Costumer costumer : Costumer.kdList)
			{
				text += costumer.getAnrede() + "\t" + costumer.getVorname() + "\t" + costumer.getNachname() + "\n";
			}
			w.taKundenAnzeige.setText(text);
		}
		else if (e.getSource().equals(w.btnCsvExport)) 
		{
			File file = new File(new File("export.csv").getAbsolutePath());
			
			JFileChooser exportDialog = new JFileChooser();
			exportDialog.setSelectedFile(file);
			int result = exportDialog.showSaveDialog(w);
			if (result == JFileChooser.APPROVE_OPTION)
			{
				file = exportDialog.getSelectedFile();
				DateiManager.csvSpeichern(file);
			}
		}
	}

	private void clearForm()
	{
		w.tfVorname.setText("");
		w.cbAnrede.setSelectedIndex(0);
		w.cbxNeukunde.setSelected(false);
	}
}
